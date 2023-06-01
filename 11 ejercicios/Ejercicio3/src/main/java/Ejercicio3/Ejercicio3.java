/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        
        metodos arreglo = new metodos(n);
        
        System.out.println(" FIBONACCIS: ");
        arreglo.llenarArreglo();
        arreglo.presentarArreglo();
    }
}
