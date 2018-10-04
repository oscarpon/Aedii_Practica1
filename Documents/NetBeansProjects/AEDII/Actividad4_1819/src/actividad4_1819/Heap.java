/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4_1819;

import java.lang.reflect.Array;

/**
 *
 * @author oscar
 */
public class Heap <E extends Comparable<E>>{
    public static final int CAPACIDAD = 25;
    private E [] vector;
    private int numElem;
    
    
    public Heap (Class clase, E superior){
        numElem = 0;
        vector = (E[]) Array.newInstance(clase, CAPACIDAD+1);
	vector[0]= superior;
    }
    
}
