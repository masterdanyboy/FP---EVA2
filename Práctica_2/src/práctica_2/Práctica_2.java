/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Práctica_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int n1 = scanner.nextInt();

        System.out.println("Ingrese otro número entero: ");
        int n2 = scanner.nextInt();

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.println(i);
            }
            for (int i = n2; i >= n1; i--) {
                System.out.println(i);
            }
        }
    }
}
