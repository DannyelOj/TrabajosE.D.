/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        Scanner entrada = new Scanner (System.in);
        
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
        System.out.println("Suma de Filas");
        for (int i=0;i<matriz.matriz.length;i++) {
            System.out.print(matriz.sumarFilas()[i]+"\n");
        }
        System.out.println("");
        System.out.println("Suma de Columnas");
        for (int i=0;i<m;i++) {
            System.out.print(matriz.sumarColumnas(m)[i]+"\n");
        }
    }
}
