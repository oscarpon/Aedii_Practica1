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
    
        //  EJERCICIO 3
        public int sumarDigitos (int n){
            if(n < 10){
                return n;
            }
            else{
                return (n%10) + sumarDigitos(n/10);
            }
        }
        
        //ejercicio 4
	public static int euclides (int n1, int n2)
	{
		if (n1 == n2) return n1;
		else if (n1 > n2) return euclides(n1-n2, n2);
		else return euclides (n1, n2-n1);
	}
    
}
