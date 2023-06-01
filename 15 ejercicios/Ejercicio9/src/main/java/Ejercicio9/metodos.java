/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    public int determinantes(int[][] matriz) {
        int a1 = 0, a2 = 0, d, aM1, aM2, k, l;

        for (int i = 0; i < matriz.length; i++) {
            k = i;
            l = (matriz.length - 1) - i;
            aM1 = 1;
            aM2 = 1;
            for (int j = 0; j < matriz.length; j++) {
                aM1 *= matriz[j][k];
                aM2 *= matriz[j][l];
                if (k == matriz.length - 1) {
                    k = 0;
                    l = 3;
                } else {
                    k++;
                    l--;
                }
            }
            a1 += aM1;
            a2 += aM2;
        }
        d = a1 - a2;

        return d;
    }
}
