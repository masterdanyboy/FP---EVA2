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
         Scanner sc = new Scanner(System.in);
        int dia = 0;
        int diamax = 0;

        while (true) {
            System.out.println("ingresa en que día de la semana estás");
            dia = sc.nextInt();

            if(diamax < dia){
                diamax = dia;
            }

            if (dia >= 1 && dia <= 7) {
                break;
            }

        }
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        System.out.println("El numero más alto que ingreso el usuario fue: "+diamax);
    
        
    }
    
}
