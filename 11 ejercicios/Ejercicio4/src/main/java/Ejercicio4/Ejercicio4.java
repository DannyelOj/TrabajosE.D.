/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 4");
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        
        metodos arreglo = new metodos(n);
        
        System.out.println("LOS NÚMEROS PRIMOS SON");
        arreglo.llenarArreglo();
        arreglo.presentarArreglo();
    }
}
