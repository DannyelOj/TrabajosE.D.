/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 2");
        Scanner entrada = new Scanner(System.in);
        
        int n,m;
        
        System.out.println("Ingrese el tamaño de la matriz");
        System.out.print("Filas y Columnas: ");
        n = entrada.nextInt();
        
        metodos matriz = new metodos(n,n);
        
        matriz.llenarMatriz();
        System.out.println("MATRIZ ORIGINAL");
        matriz.presentarMatriz();
        System.out.println("Suma de la Diagonal Secundaria: "+matriz.sumaDiagonal());
    }
}
