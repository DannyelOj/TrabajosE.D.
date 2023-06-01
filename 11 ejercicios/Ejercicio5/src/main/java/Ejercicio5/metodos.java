/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    Scanner entrada;
    int [] Array;
    
    public metodos(int _lim) {
        this.entrada = new Scanner(System.in);
        this.Array = new int [_lim];
    }
    
    public void llenar() {
        for (int i=0;i<Array.length;i++) {
            System.out.print("Ingrese un número en la posición ["+i+"]: ");
            Array[i]=entrada.nextInt();
        }
    }
    
    public String ordenarMayor () {
        String cadena;
        for (int i=0; i<Array.length-1; i++) {
            for (int j=i+1; j<Array.length; j++) {
                if (Array[i]<Array[j]) {
                    return cadena = "El arreglo no está ordenado";
                }
            }
        }
        return cadena = "El arreglo está ordenado de mayor a menor";
    }
    
    public String ordenarMenor () {
        String cadenaD;
        for (int i=0; i<Array.length-1; i++) {
            for (int j=i+1; j<Array.length; j++) {
                if (Array[i]>Array[j]) {
                    return cadenaD = "El arreglo no está ordenado";
                }
            }
        }
        return cadenaD = "El arreglo está ordenado de menor a mayor";
    }
}
