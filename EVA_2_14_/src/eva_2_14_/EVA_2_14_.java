/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_14_;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_2_14_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero decimal: ");
        int numero = scanner.nextInt();
        String binario = "";
        while(numero > 0){
            binario = numero % 2 + binario;
            numero = numero / 2;
        }
        System.out.println("El numero en binario es: " + binario);

    }
    
}
