/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_1_2018.pkg2019;

/**
 *
 * @author oscar
 */
public class solucion_actividad_1 {
    
    /**
     * Para los metodos recursivos tenemos que cumplir con unas condiciones, 
     * Condicion de parada
     * Llamada recursiva
     * 
     */
    
    //EJERCICIO 1
    public static int factorial(int n){
        if(n == 0) return 1; 
        else{
            return n * factorial(n-1);
        }
    }
    
    //EJERCICIO 2
    	public static int cuadrado (int n)
	{
		if (n == 0) return 0;
		else return cuadrado(n-1) + 2 * n - 1; 	
	}
    
    
}
