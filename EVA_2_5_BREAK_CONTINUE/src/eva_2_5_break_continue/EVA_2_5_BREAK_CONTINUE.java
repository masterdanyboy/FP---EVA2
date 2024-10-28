/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_5_break_continue;

/**
 *
 * @author Usuario
 */
public class EVA_2_5_BREAK_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++) {
            //cONTINUE --> SE SALTA LA INTERACCIÓN ACTUAL
            //*if (i == 8)
            //continue;* // interrumpe la repetición desde este punto
            if (i == 8)
                break; // detiene el ciclo por completo en este punto
            System.out.print(i + " - ");
        }
    }
    
}
