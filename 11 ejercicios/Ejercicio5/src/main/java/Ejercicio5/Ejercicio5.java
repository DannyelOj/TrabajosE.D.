/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 5");
        Scanner entrada = new Scanner(System.in);
        int opc;

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        metodos arreglo = new metodos(n);

        arreglo.llenar();
        
        System.out.println("Ingrese: \n[1] Mayor a menor\n[2] Menor a mayor");
        opc = entrada.nextInt();

        switch (opc) {
            case 1 -> {
                System.out.printf("%s\n", arreglo.ordenarMayor());
                break;
            }
            case 2 -> {
                System.out.printf("%s\n", arreglo.ordenarMenor());
                break;
            }
            default -> {
                System.out.println("Fuera de rango&");
            }
        }
    }
}
