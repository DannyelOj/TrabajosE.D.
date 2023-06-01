/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 9");
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de su arreglo: ");
        int n = entrada.nextInt();
        
        metodos arreglo = new metodos(n);
        
        arreglo.llenarArreglo();
        arreglo.presentarArreglo();
        System.out.printf("%s",arreglo.toString()); //usamos el metodo toString por comodidad
    }
}
