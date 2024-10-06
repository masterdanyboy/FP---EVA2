/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Kilometraje;
        int meses;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el kilometraje del auto: ");
        Kilometraje = captu.nextInt();
        captu.nextLine();
        System.out.println("Introduce los meses que han pasado desde el ultimo cambio de aceite: ");
        meses = captu.nextInt();
        captu.nextLine();


        if(Kilometraje >= 5000 || meses >= 6){
            System.out.println("Cambio de aceite");
            }
        else{

            System.out.println("No es necesario cambio de aceite");
    }
    
}
}