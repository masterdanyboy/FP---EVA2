/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_número.mayor;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_12_NÚMEROMAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int num, masGrande = 9999999;
 Scanner captu = new Scanner (System.in);
 
 do{
     System.out.println("un número entero: ");
     num = captu.nextInt();
     captu.nextLine();
     
     if(num > masGrande);
     masGrande = num;
 } while (!(num == 1));
 System.out.println(masGrande);
           
           
       
    }
}