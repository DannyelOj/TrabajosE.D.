/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    int []Array;
    
    public metodos (int _n) {
        this.Array = new int [_n];
    }    
    
    public static boolean Primo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
    }
    
    public void llenarArreglo () {
        int j=1;
        for (int i=0;i<Array.length;i++) {
            if (Primo(j)==true) {
                Array[i]=j;
            } else {
                i--;
            }
            j++;
        }
    }
    
    public void presentarArreglo(){
        for (int i=0;i<Array.length;i++) {
            System.out.println("["+i+"]: "+Array[i]);
        }
    }
}
