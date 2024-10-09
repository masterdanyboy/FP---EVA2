/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRÁCTICA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        String accum = "";
        char c = '*';
       for (int i= numero; i>0; i--){
           

           for (int j=0; j<i; j++){
               accum += c;
           }
           System.out.println(accum);
           accum = "";
    }
    }  
}
