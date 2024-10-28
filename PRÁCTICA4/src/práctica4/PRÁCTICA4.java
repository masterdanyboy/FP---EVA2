/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRÁCTICA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner scanner = new Scanner(System.in);
        System.out.println("introduce tu texto");
        String texto = scanner.nextLine();
        String VocalesT="";
        for(int i = 0; i < texto.length(); i++) {

        if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u' || texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' || texto.charAt(i) == 'O' || texto.charAt(i) == 'U') {
            char letra = texto.charAt(i);
            VocalesT += letra+" ";
        }

        }
        System.out.println(VocalesT);
    }
    
}
