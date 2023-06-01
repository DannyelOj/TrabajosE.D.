/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author VEL-USER
 */
public class metodos {

    int[] Array;

    public metodos(int _n) {
        this.Array = new int[_n];
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void llenarArreglo() {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = fibonacci(i);
        }
    }

    public void presentarArreglo() {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(i + Array[i]);
        }
    }
}
