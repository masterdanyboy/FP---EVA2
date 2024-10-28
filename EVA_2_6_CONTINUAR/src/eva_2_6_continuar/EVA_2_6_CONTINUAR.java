/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_6_continuar;

/**
 *
 * @author Usuario
 */
public class EVA_2_6_CONTINUAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <=10; i++){
            if((i % 2)>0)
                continue;
            System.out.print(i+" - ");
        }
        System.out.println("");
        for (int i = 1; i <=10; i++){
            if((i % 2)==0)
                continue;
            System.out.print(i+" - ");
        }
    }
    
}
