/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio6;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 6");
        metodos metodos = new metodos();
        int opc;
        do{
            opc=metodos.menu();
            switch (opc) {
                case 1 ->  {
                    metodos.sumaMatrices();
                }
                case 2 ->  {
                    metodos.restaMatrices();
                }
                case 3 ->  {
                    metodos.multiplicaEscalar();
                }
                case 4 ->  {
                    metodos.transpuestaMatrices();
                }
                default -> {
                }
            }            
        } while (opc!=0);
    }
}
