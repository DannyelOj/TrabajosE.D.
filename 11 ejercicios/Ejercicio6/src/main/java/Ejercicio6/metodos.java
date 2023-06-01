/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class metodos {

        Scanner entrada;
        int[] Array;
        double[] Array2;

        public metodos(int _lim) {
            this.entrada = new Scanner(System.in);
            this.Array = new int[_lim];
            this.Array2 = new double[_lim];
        }

        public void llenar() {
            for (int i = 0; i < Array.length; i++) {
                Array[i] = (int) (-10 + (Math.random() * 100));
                if (Array[i] == 0) {
                    i--;
                }
            }
        }

        public void dividir(int _n) {
            if (_n < Array.length) {
                for (int i = 0; i < Array.length; i++) {
                    Array2[i] = ((double) Array[i] / Array[_n]);
                }
                System.out.println("ARREGLO 1");
                presentarArreglo(Array);
                System.out.println("\nARREGLO 2");
                presentarArreglo(Array2);
                System.out.println("");
            } else {
                System.out.println("ERROR fuerea de rango");
            }
        }

        public void presentarArreglo(int[] x) {
            for (int i = 0; i < x.length; i++) {
                System.out.print(i+ x[i] + " ");
            }
        }

        public void presentarArreglo(double[] x) {
            for (int i = 0; i < x.length; i++) {
                System.out.printf("[%d]:%.2f ", i, x[i]);
            }
        }
    }
