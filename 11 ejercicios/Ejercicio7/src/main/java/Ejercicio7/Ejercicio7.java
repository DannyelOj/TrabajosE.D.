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
        System.out.println("Ejercicio 7");
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int lim = entrada.nextInt();
        
        metodos arreglo = new metodos (lim); 
        arreglo.llenarArreglo();
        arreglo.presentarArreglo(arreglo.Array);
        
        System.out.print("Ingrese la posición para insertar el número: ");
        int a = entrada.nextInt(); 
        
        if ((a<arreglo.Array.length)&&(a>0)) {            
            arreglo.insertarNumero(a);
        } else {
            System.out.println("ERROR fuera de rango");
        }
    }
}
