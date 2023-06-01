/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 11");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas: ");
        int n = scanner.nextInt();
        
        metodos matriz = new metodos(n);
            // Mostrar el cuadrado mágico
        matriz.llenarMatriz();
        matriz.presentarMatriz();
    }
}
