/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        
        Scanner entrada = new Scanner(System.in);
        
        metodos vuelo = new metodos();
        int n;
        int opc;
        String id;        
            
        do {
            System.out.println("Desea abordar el avion");
            System.out.println("Sí [1]\tNo[2]");
            n = entrada.nextInt();
            do {
                opc = vuelo.menu();
                switch (opc) {
                    case 1 -> {
                        System.out.println("Escoga la seccion del avion\n"
                                + "Fumadores [1]\nNo Fumadores [2]");
                        n = entrada.nextInt();
                        switch (n) {
                            case 1 -> vuelo.llenarFumadores();
                            case 2 -> vuelo.llenarNoFumadores();
                            default -> System.out.println("Ingrese 1 o 2 para ubicarlo");
                        }
                    } 
                    case 2 -> {
                        System.out.println("Escoga su opcion reservada\n"
                                + "Fumadores [1]\nNo Fumadores [2]");
                        n = entrada.nextInt();
                        entrada.nextLine();
                        switch (n) {
                            case 1 -> {
                                System.out.println("Ingrese su cedula:\n");        
                                id = entrada.nextLine(); 
                                vuelo.eliminarFumadores(id);
                            }
                            case 2 -> {
                                System.out.println("Ingrese su cedula:\n");        
                                id = entrada.nextLine();
                                vuelo.eliminarNoFumadores(id);
                            }
                            default -> {
                                System.out.println("Ingrese 1 o 2 para ubicarlo");
                            }
                        }
                    }
                    default -> {
                        System.out.println("GRACIAS POR VOLAR EN AEREOLINAS DANNYZIP");
                    }
                }  
            } while (opc!=0);
        } while (n==1);
        if (n==1) {
           System.out.println("El vuelo ya no está disponible\n"
                        + "Lo sentimos ): \n");           
        }
    }
}
