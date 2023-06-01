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
        
        Scanner entrada = new Scanner(System.in);
        
        String id;
        
        System.out.println("Ingrese el tamaño del arreglo");
        int n = entrada.nextInt();
        entrada.nextLine(); 
        
        metodos arreglo = new metodos(n);
        
        arreglo.llenarArreglo(); 
       
        
        System.out.println("Ingrese el ID del alumno");         
        id = entrada.next();     
        arreglo.encontrarAlumno(id);
        
        arreglo.presentarArreglo();
    }
}
