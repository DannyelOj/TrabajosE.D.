/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    Scanner entrada;
    int[] Array;
    
    public metodos(int _lim) {
        this.entrada = new Scanner(System.in);
        this.Array = new int[_lim];
    }
    public void llenarArreglo() {
        for (int i=0;i<Array.length;i++) {
            System.out.print("Ingrese un número en la posición ["+i+"]:");
            Array[i]=entrada.nextInt();
        }
    }
    
        public void presentarArreglo(int []X){
        for (int i=0;i<Array.length;i++) {
            System.out.println("["+i+"]: "+Array[i]);
        }
    }
    
    public int[] recorrerDerecha (int a, int _n) {
        for (int i=Array.length-1;i>a;i--) {
            Array[i]=Array[i-1];
        }
        Array[a]=_n;
        return Array;   
    }
    
    public void insertarNumero(int a) {
        int n;
        System.out.println("Ingrese el número a insertar");
        n = entrada.nextInt();     
        
        presentarArreglo(recorrerDerecha(a,n));
    }
}
