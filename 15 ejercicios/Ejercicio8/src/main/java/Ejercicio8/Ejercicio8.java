/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 8");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas: ");
        int n = scanner.nextInt();
        
        // Evalúo el tamaño de la matriz
        if (n%2!=0) {
            metodos matriz = new metodos();
            // Mostrar el cuadrado mágico
            System.out.println("Cuadrado Mágico:");
            matriz.mostrarCuadradoMagico(n);
        } else {
            System.out.println("Ingrese un número impar");
        } 
    }
}
