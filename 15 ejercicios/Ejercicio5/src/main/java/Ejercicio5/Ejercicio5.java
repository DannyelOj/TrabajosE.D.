/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio5;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 5");
        metodos matriz = new metodos();
        
        matriz.llenarMatriz();
        matriz.presentarMatriz();
        
        System.out.println("Media Mensual de todos los almacenes");
        for (int i=0;i<matriz.matriz[0].length;i++) {
            System.out.print("["+matriz.sumarColumnas()[i]+"] ");
        }
        
        System.out.println("");
        
        System.out.println("Listado de posiciones de Almacenes con ventas superiores a la media");
        for (int i=0;i<(matriz.c*matriz.f);i++) {
            if (matriz.superiorMedia()[0]==null){
                System.out.println("No hay ningún almacen con ventas superiores a la media");
                break;
            } else if (matriz.superiorMedia()[i]!=null) {
                System.out.print("Posición: "+matriz.superiorMedia()[i]);                
            } else {
               break; 
            }          
        }
        
        System.out.println("El mes más productivo es: "+(matriz.mesMasProductivo()+1));
    }
}
