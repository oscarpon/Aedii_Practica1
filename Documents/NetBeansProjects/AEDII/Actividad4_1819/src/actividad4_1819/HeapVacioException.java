/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4_1819;

/**
 *
 * @author oscar
 */
public class HeapVacioException extends RuntimeException {
    public HeapVacioException(){
        super();
    }
    public HeapVacioException(String mensaje){
        super(mensaje);
    }
}
