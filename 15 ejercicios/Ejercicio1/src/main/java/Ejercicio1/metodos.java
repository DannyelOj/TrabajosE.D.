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
    Scanner entrada = new Scanner (System.in);
    int [][] matriz;
    int [] vF;
    int [] vC;
    
    public metodos (int n, int m) {
        entrada = new Scanner(System.in);
        matriz = new int [n][m];
        vF = new int [n];
        vC = new int [m];
    }
    
    public void llenarMatriz () { 
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    public void presentarMatriz () {
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
    public int[] sumarFilas () {
        int suma = 0; 
        for (int i=0;i<matriz.length;i++){
            suma = 0;
            for (int j=0;j<matriz[i].length;j++){
                suma+=matriz[i][j];
            }
            vF[i] = suma;
        }
        return vF;
    }
    
    public int[] sumarColumnas (int _m) {
        int suma = 0; 
        for (int i=0;i<_m;i++){
            suma = 0;
            for (int j=0;j<matriz.length;j++){
                suma+=matriz[j][i];
            }
            vC[i] = suma;
        }
        return vC;
    }
}
