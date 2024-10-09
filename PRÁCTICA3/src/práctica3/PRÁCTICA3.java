/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRÁCTICA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String input = scanner.nextLine();
        String accum="";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
          accum+=c+" ";
        }
        System.out.println(accum);
    }
    
}
