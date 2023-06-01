/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 15");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas: ");
        int n = scanner.nextInt();
        
        if (n%2!=0) {
            metodos matriz = new metodos(n);
            matriz.llenarCruz();
            matriz.presentarMatriz();
        } else {
            System.out.println("El número debe ser impar");
        }  
    }
}
