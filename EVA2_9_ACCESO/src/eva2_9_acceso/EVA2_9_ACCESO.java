/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_acceso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_9_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario="", pwd="";
        Scanner captu = new Scanner(System.in);

        //PANTALLA DE VALIDACIÓN: USUARIO Y CONTRASEÑA

       while(!(usuario.equals("admin") && pwd.equals ("1234"))){
           System.out.println ("Usuario: ");
           usuario = captu.nextLine();
           System.out.println("Contraseña: ");
           pwd = captu.nextLine();
       }
    }
    
}
