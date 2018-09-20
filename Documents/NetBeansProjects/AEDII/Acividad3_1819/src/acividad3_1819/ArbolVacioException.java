/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acividad3_1819;

/**
 *
 * @author oscar
 */
public class ArbolVacioException extends RuntimeException {
    public ArbolVacioException(){
        super();
    }
    
    public ArbolVacioException(String mensaje){
        super(mensaje);
    }
}
