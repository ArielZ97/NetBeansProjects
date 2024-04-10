/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repasob1;

import java.util.Scanner;

/**
 *
 * @author Ariel Zurita
 */
public class RepasoB1 {

    public static void main(String[] args) {
        try (//        GuiaB.ejer1(8, 8);
//        GuiaB.ejer2(1);
        //GuiaB.ejer3();
                //ejercicio 4
            Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa una frase o palabra de 8 caracteres: ");
            String entrada = scanner.nextLine();
            
            
            
            
        if (entrada.length()== 8 ){
            System.out.println(" CORRECTO ");
            
        }else {
            System.out.println(" INCORRECTO ");
        }
        }
       
       
    }
    public static void main ()

    
}
