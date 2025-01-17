/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud.java_mvc;
import Configuration.MyConection;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author prueba
 */
public class CRUDJAVA_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn=MyConection.getConnection();
    if (conn !=null) {
        try {
            conn.close();
            System.out.println("Conexion cerrada correctamente");
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion:  " + e.getMessage());
        }
    }
    }
    
}
