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
        String cad;
        int num;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese la cadena de texto");
        
        cad = captu.nextLine();
        System.out.println("Ingrese el número de veces que desea repetir");
        
        num=captu.nextInt();
       
        for(int i = 1; i <=num; i++){
            System.out.println(""+cad);
    }
    
}
}