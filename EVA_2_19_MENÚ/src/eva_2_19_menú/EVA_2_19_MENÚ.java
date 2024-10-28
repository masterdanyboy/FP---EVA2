/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_19_menú;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_2_19_MENÚ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String menu[];
        int precios[];
        Scanner captu = new Scanner(System.in);
        int Cant;
        System.out.println("cuantos productos tendra el menu?");
        Cant = captu.nextInt();
        captu.nextLine();
        menu = new String[Cant];
        precios = new int[Cant];
        for(int i = 0; i < menu.length; i++){
            System.out.println("Cual es el nombre del producto? ");
            menu[i] = captu.nextLine();
            System.out.println("Cual es su valor? ");
            precios[i] = captu.nextInt();
            captu.nextLine();
        }
        for(int i = 0; i < menu.length; i++){
            System.out.println(i + " - " + menu[i]+" $"+precios[i]);
        }
    }
    
}
