/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el numero");

        int acum=1;
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {


            acum = acum * i;



            }
        System.out.println("El factorial de " + num + " es: " + acum);
    }
    
}
