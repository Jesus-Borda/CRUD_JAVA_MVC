/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import controlador.ConexionBD;
import  java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CYBER
 */
public class ProductoDAO {
    ConexionBD conexion = new ConexionBD(); //Instancia conexion base de datos
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List Listar (){
        // SENTENCIA SQL
        String  sql = "select * From productos";
        //LISTA PARA LOS DATOS
        List <Producto> Lista = new ArrayList<>();
        // TRY AND CATCH
        try {
            /*  Creamos los productos y asignamos los valores
                despues de esto los agregamos a la lista
                y la invocamos.
            */
            
            
            con = ConexionBD.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setInventario(rs.getInt(4));
                Lista.add(producto);
               
                
            }
                    
                    
        } catch (SQLException e) {
            
            System.out.println("Error al listar "+ e);
            
        }
        return Lista;
    } 
    // FIN DEL METODO LISTAR
    
    
} //  Fin de la clase DAO
