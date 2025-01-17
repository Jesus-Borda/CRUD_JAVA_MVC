 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author prueba
 */
public class MyConection {
    private static final String URL = "jdbc:mysql://localhost:3308/crud_java_mvc";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection (){
        Connection connection = null;
        try {
            //CARGAR EL DRIVER DE Mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Establecer la conexion
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de MYSQL" + e.getMessage());
            
        } catch (SQLException e) {
            System.err.println("Eror al conectar a la base de datos" + e.getMessage());
        }
        return connection;
                }




    
}