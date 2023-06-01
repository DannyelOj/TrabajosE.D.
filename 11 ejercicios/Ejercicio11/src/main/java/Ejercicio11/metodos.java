/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    alumno[] Array;
    
    public metodos(int _n) {
        this.Array = new alumno[_n];
    }
    
    public void llenarArreglo() {
        Scanner entrada = new Scanner(System.in);
        String nombreCompleto;
        String id;
        for (int i=0;i<Array.length;i++) {
            System.out.println("Ingrese el nombre del estudiante:");
            nombreCompleto = entrada.next();
            System.out.println("Ingrese el ID del estudiante:");
            id = entrada.next();
            Array[i]= new alumno(nombreCompleto,id);
            System.out.println("");
        }
    }
    
    public void presentarArreglo(){
        for (int i=0;i<Array.length;i++) {
            System.out.printf("Nombre completo del estudiante: %s\n"
                    + "ID del estudiante: %s\n",Array[i].nombreCompleto,
                    Array[i].id);
        }
    }
    
    public int buscarAlumno(String _id) {
        for (int i=0;i<Array.length;i++) {
            if (_id.equalsIgnoreCase(Array[i].id)) {
                return i;
            }
        }
        return -1;
    }
    
    public void encontrarAlumno(String _id) {
        int i = buscarAlumno(_id);
        if (i!=-1) {
            System.out.printf("El estudiante %s (%s) se encuentra registrado y está"
                    + " en la posición: %d\n",Array[i].nombreCompleto,
                    Array[i].id,i);
        } else {
            System.out.println("El estudiante no se encuentra registrado\n");
        }
    }
}
