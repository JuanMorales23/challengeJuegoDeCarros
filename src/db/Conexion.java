package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            System.out.println("Error de conexión" + e.getMessage());
        }
        return con;
    }

    public void create() {
        try {
            Connection con = null;
            con = getConnection();
            sql = con.prepareStatement("INSERT INTO `usuario` (`usuario`) VALUES (?);");
            sql.setString(1, "Juan");
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
    
    public void read(){
        try{
            Connection con = null;
            con = getConnection();
            sql = con.prepareStatement("SELECT * FROM usuario WHERE usuario = 'JUAN'");
            res = sql.executeQuery(); 
            if(res.next()){
                System.out.println("Se encontró el registro");
            }else{
                System.out.println("No se pudo encontrar");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void update(){
        try {
            Connection con = null;
            con = getConnection();
            sql = con.prepareStatement("UPDATE `usuario` SET `usuario`= 'Juan' WHERE id = '1';");
            int resultado = sql.executeUpdate();     
            if(resultado > 0){
                System.out.println("Se modificó correctamente");
            }else{
                System.out.println("No se pudo modificar");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void delete(){
        try{
            Connection con = null;
            con = getConnection();
            sql = con.prepareStatement("DELETE FROM `usuario` WHERE id = '4'");
            int resultado = sql.executeUpdate();     
            if(resultado > 0){
                System.out.println("Se borro correctamente");
            }else{
                System.out.println("No se pudo borrar");
            }
            con.close();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
