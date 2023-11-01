
package com.emergentes.te_libros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/bg_agenda";
    static String usuario = "root";
    static String password = "root";
    
    Connection conn = null;
    
    public ConexionDB(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
            
            if (conn != null) {
                System.out.println("Conexion OK "+ conn);
            }
           
        } catch (SQLException ex) {
            
        }
    }
}
