/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRÁCTICA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        String accum = "";
        for (int i = 0; i < numero; i++) {
            accum += "*";
            System.out.println(accum);
    }
    }
}
