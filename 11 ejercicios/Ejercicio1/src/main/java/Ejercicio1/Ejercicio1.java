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
        Scanner entrada = new Scanner(System.in);
        int lim=0;
        System.out.println("Ingrese el tamaño del arreglo");
        lim = entrada.nextInt();
        
        metodos arreglo = new metodos(lim);
        arreglo.llenar();
        arreglo.calcular();
    }
}
