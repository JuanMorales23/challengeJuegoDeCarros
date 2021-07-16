package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class conexion {
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
    
}
