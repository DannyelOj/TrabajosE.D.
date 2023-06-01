/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    int[] Array;
    
    public metodos() {
        this.Array = new int[100];
    }
    
    public void presentarArreglo(){
        for (int i=0;i<Array.length;i++) {
            System.out.printf("El xuadrado de la posición [%d] = %d \n"
            ,i,Array[i]);
        }
    }
    
    public void calcularCuadrado () {
        for (int i=0;i<Array.length;i++) {
            Array[i]=(i+1)*(i+1);
        }
    }
}
