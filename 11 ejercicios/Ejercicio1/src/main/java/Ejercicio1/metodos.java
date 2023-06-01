/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    
    Scanner entrada;
    int [] Array;
    
    public metodos(int lim) {
        this.entrada = new Scanner(System.in);
        this.Array = new int [lim];
    }
    
    public void llenar() {
        for (int i=0;i<Array.length;i++) {
            System.out.print("Ingrese un número: " );
            Array[i]=entrada.nextInt();
        }
    }
    
    public void calcular () {
        int c=0, p=0, n=0;
        for (int i=0;i<Array.length;i++) {
            if (Array[i]>0) {
                p++;
            } else if (Array[i]==0) {
                c++;
            } else {
                n++;
            }
        }
        presentar(p,"positivos");
        presentar(c,"ceros");
        presentar(n,"negativos");
    }
    
    public void presentar (int n, String i) {
        System.out.println("Hay " + n + " números "+i);
    }
}
