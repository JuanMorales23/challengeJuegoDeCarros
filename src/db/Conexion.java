package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jugador.Jugador;
import podio.Podio;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/dbchallenge";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private Connection con = null;
    private PreparedStatement sql = null;
    private ResultSet res;

    public Connection getConnection() {        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error de conexión" + e.getMessage());
        }
        return con;
    }

    public void actualizarGanador(Podio podio) {
        try {
            int id = buscarIdJugador(podio.getPrimerPuesto());
            if (id != 0) {
                sql = con.prepareStatement("UPDATE `jugadores` SET `ganadas`='"
                        + podio.getPrimerPuesto().getGanadas() + "' WHERE `id`='" + id + "'");
                sql.executeUpdate();
            } else {

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertarGanadores(Podio podio) {
        sql = null;
        try {                        
            sql = con.prepareStatement("INSERT INTO `ganadores` (`primerPuesto`,`segundoPuesto`,`tercerPuesto`) VALUES (?, ?, ?);");
            sql.setString(1, podio.getPrimerPuesto().getNombre());
            sql.setString(2, podio.getSegundoPuesto().getNombre());
            sql.setString(3, podio.getTercerPuesto().getNombre());
            int resultado = sql.executeUpdate();
            if (resultado > 0) {
                System.out.println("Se guardó correctamente");
            } else {
                System.out.println("No se pudo guardar");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertarJugadores(Jugador jugador) {
        try {
            sql = con.prepareStatement("INSERT INTO `jugadores` (`nombre`,`ganadas`) VALUES (?, ?);");
            sql.setString(1, jugador.getNombre());
            sql.setInt(2, jugador.getGanadas());
            int resultado = sql.executeUpdate();
            if (resultado > 0) {
                System.out.println("Se guardó correctamente");
            } else {
                System.out.println("No se pudo guardar");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public boolean buscarJugador(String nombre) {
        boolean existe = false;
        try {
            sql = con.prepareStatement("SELECT * FROM `jugadores` WHERE `nombre`='" + nombre + "'");
            res = sql.executeQuery();
            if (res.next()) {
                System.out.println("El jugador ya existe.");
                existe = true;

            } else {
                existe = false;
            }         
        } catch (SQLException e) {
            System.out.println(e);
        }
        return existe;
    }

    public int buscarIdJugador(Jugador jugador) {
        int id = 0;
        try {
            sql = con.prepareStatement("SELECT id FROM `jugadores` WHERE `nombre`='" + jugador.getNombre() + "'");
            res = sql.executeQuery();
            if (res.next()) {
                id = Integer.parseInt(res.getString("id"));
            } else {
                System.out.println("No se encontró el registro");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return id;
    }
}
