/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner entrada = new Scanner(System.in);
        
        int n,m;
        
        System.out.println("Ingrese el tamaño de la matriz");
        System.out.print("Filas: ");
        n = entrada.nextInt();
        System.out.print("Columnas: ");
        m = entrada.nextInt();
        
        metodos matriz = new metodos(n,m);
        
        matriz.llenarMatriz();
        System.out.println("MATRIZ ORIGINAL");
        matriz.presentarMatriz();
        matriz.ordenarMatriz();
        System.out.println("MATRIZ ORDENADA");
        matriz.presentarMatriz();
    }
}
