/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    int[] Array;
    Scanner entrada;
    
    public metodos(int _n) {
        this.Array = new int[_n];
        this.entrada = new Scanner(System.in);
    }
    
    public void llenarArreglo() {
        for (int i=0;i<Array.length;i++) {
            System.out.print("Ingrese un número :");
            Array[i]=entrada.nextInt();
            if (Array[i]==0) {
                System.out.println("Ingrese un número diferente de cero");
                i--;
            }
        }
    }
    
    public int sumaPares(){
        int conp = 0;
        for (int i=0;i<Array.length;i++) {
            if (Array[i]%2==0) {
                conp++;
            }
        }
        return conp;
    }
    
    public int sumaImpares(){
        int coni = 0;
        for (int i=0;i<Array.length;i++) {
            if (Array[i]%2!=0) {
                coni++;
            }
        }
        return coni;
    }
    
    public void presentarArreglo(){
        for (int i=0;i<Array.length;i++) {
            System.out.println("["+i+"]: "+Array[i]);
        }
    }
    
    @Override
    public String toString () {
        String cadena = String.format("Hay %d números impares \nHay"
                + " %d números pares\n",sumaImpares(),sumaPares());
        return cadena;
    }
}
