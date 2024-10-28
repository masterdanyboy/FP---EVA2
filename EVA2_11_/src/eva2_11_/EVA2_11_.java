/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_11_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int díaSem;
        Scanner captu = new Scanner (System.in);
        while(true){
        System.out.println("Captura el número del día ()1 a 7: ");
        díaSem = captu.nextInt();
        captu.nextLine();
        if (díaSem <= 1 && díaSem <= 70)
            Break;
        }
        
        //ELEGIR ENTRE MÚLTIPLES ALTERNATIVAS
        switch (díaSem){
            case 1:
        }
    }
    
}
