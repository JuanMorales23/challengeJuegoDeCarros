package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import podio.Podio;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/dbchallenge";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    PreparedStatement sql;
    ResultSet res;

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error de conexión" + e.getMessage());
        }
        return con;
    }

    public void insertarGanadores(Podio podio) {
        try {
            Connection con = null;
            con = getConnection();
            sql = con.prepareStatement("INSERT INTO `ganadores` (`primerPuesto`,`segundoPuesto`,`tercerPuesto`,`puntos`)"
                    + " VALUES (?, ?, ?, ?);");
            sql.setString(1, podio.getPrimerPuesto().getNombre());
            sql.setString(2, podio.getSegundoPuesto().getNombre());
            sql.setString(3, podio.getTercerPuesto().getNombre());            
            sql.setInt(4, podio.getPrimerPuesto().getPuntos());
            int resultado = sql.executeUpdate();     
            if(resultado > 0){
                System.out.println("Se guardó correctamente");
            }else{
                System.out.println("No se pudo guardar");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
