/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author pruebapa
 * @param <T>
 */
public interface IDataManager <T >{
    void create(T objeto); 
    T read( int id);
    void update (T objeto,int id);
    void delete (T objeto, int id);
}
