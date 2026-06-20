/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
     public Connection conectar() {

        Connection con = null;

        try {

            String url = "jdbc:sqlserver://localhost:58496;"+ "databaseName=Hersil;" + "encrypt=true;" + "trustServerCertificate=true;";

            String user = "HersilAdmin";
            String password = "pollofrito123";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Conexión exitosa");

        } catch (SQLException e) {

            System.out.println("Error de conexión: " + e.getMessage());

        }

        return con;
    }
   
}
