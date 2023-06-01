/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 6");
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Tamaño de su arreglo: ");
        int lim = entrada.nextInt();
        
        metodos arreglo = new metodos(lim);
        
        System.out.println("Ingrese la posicion deseada");
        int n = entrada.nextInt();
        
        arreglo.llenar();
        arreglo.dividir(n);
    }
}
