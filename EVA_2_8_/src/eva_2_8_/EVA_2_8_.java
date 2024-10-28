/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_8_;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_2_8_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //pantalla de validacion
        Scanner captu = new Scanner(System.in);
        //usuario y contraseña
        String cont, usua;

        System.out.println("usuario:");
        usua=captu.nextLine();
        System.out.println("contraseña:");
        cont=captu.nextLine();
        do{


        }while(!(usua.equals("admi")&& cont.equals("3312")));
        System.out.println("hola, esto es el programa principal");

    }
    
}
