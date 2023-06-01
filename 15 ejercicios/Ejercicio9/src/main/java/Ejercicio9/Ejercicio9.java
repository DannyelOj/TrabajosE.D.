/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio9;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 9");
        System.out.println("Primera Pregunta");
        int matriz[][]  = {{1,2,0,3},
                           {1,1,2,1},
                           {2,1,3,2},
                           {2,1,2,1}};
        int matrizDet[][] = new int[4][4]; 
        metodos dM = new metodos();      
        int determinante = dM.determinantes(matriz);
        System.out.println("La determinante de la matriz es: " + determinante);
        
    }
}
