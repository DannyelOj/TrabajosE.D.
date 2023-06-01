/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    int[] Array = new int [] {1,5,3,2,7,6};
    int[] Array2 = new int [Array.length];

    public long factorial(int n) {
        if (n==0)
            return 1;
        else 
            return n*factorial(n-1);
    }
    
    public void presentarArreglo(){
        System.out.println("ARREGLO 1");
        for (int i=0;i<Array.length;i++) {
            System.out.print(i + Array[i]+" ");
        }
        
        System.out.println("\nARREGLO 2");
        for (int i=0;i<Array2.length;i++) {
            System.out.print(i + Array2[i]+" ");
        }
    }
    
    public void factorialArreglo() {
        for (int i=0;i<Array.length;i++) {
            Array2[i]=(int) factorial(Array[i]);
        }
    }
}
