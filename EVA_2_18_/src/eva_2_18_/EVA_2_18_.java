/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_18_;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_2_18_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        String [] menu= {"pizza", "tacos", "hamburguesa", "hotdog", "torta"};
        int [] precio={100,120,80,70,80};

        System.out.println("Este es nuestro menu: " );
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " $" + precio[i]);
        }
        System.out.println("¿Que desea ordenar?");
        int orden = scanner.nextInt();
        System.out.println("Vas a tener que pagar: $" + precio[orden-1] + " por tu " + menu[orden-1]);
    }
    
}
