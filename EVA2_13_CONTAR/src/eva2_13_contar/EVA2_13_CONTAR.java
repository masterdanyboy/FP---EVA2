/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_13_CONTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu cadena: ");
        String cadena = scanner.nextLine();
        int count =0;
        for(int i =0; i<cadena.length(); i++){
            if(cadena.toLowerCase().charAt(i) == 'a' || cadena.toLowerCase().charAt(i) == 'e' || cadena.toLowerCase().charAt(i) == 'i' || cadena.toLowerCase().charAt(i) == 'o' || cadena.toLowerCase().charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("La cantidad de vocales en la cadena es: " + count);
        
        
        
    }
    
}
