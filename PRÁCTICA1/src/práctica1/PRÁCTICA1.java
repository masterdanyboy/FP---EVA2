/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRÁCTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String input=scanner.nextLine();
        for(int i=0;i<input.length();i++){
            System.out.println(input);
    }
    
}
}