/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA2_15_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACIÓN DE ARREGLOS:
        int [] arreglo = new int [10];//ocupa 40 bytes
        //manejo por índices
        //primer elemento de un arreglo --> cero
        arreglo [0] = 100;
        arreglo [1] = 200;
        arreglo [2] = 300;
        arreglo [3] = 400;
        arreglo [4] = 500;
        arreglo [5] = 600;
        arreglo [6] = 700;
        arreglo [7] = 800;
        arreglo [8] = 900; 
        //último elemento de un arreglo --> Tamaño -1
        arreglo [9] = 1000;
        
        //EL ACCESO SIEMPRE ES A TRAVÉS DE LAS POSICIONES
        System.out.println(arreglo [0]);
        System.out.println(arreglo [1]);
        System.out.println(arreglo[2]);
        
        arreglo = new int [10];
        
        for (int i = 0; i < 10; i++) {
            arreglo [i] = (int) (Math.random() * 100);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
            
        }
        
        
                
    }
    
}
