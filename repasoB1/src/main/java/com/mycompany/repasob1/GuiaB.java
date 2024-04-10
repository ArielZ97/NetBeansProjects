/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasob1;

import java.util.Scanner;



/**
 *
 * @author Ariel Zurita
 */
public class GuiaB {
    public static void ejer1(int num1, int num2){
        if (num1 > num2){
            System.out.println(num1 + " Es mayor que " + num2);
        } else if (num2 > num1){
            System.out.println(num2 + " Es mayor que " + num1);
        }else {
            System.out.println(num1 + " Y " + num2 +" Son iguales ");
        }
        
    }
    
    public static void ejer2(int n){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el numero a evaluar ");
        n = teclado.nextInt();
        if(n % 2== 0) {
            System.out.println(n + " Es un numero par. ");
            
        }else {
            System.out.println(" Es un numero inpar ");
        }
        
    }
    
    public static void ejer3(){
        
        String frase = "eureka";
        
        if (frase.equals(frase)){
            System.out.println(" !!CORRECTO¡¡ ");
            
        }else {
            System.out.println("!! INCORRECTO ¡¡ ");
        }
        
    }
    
    
        
    public static void validarPrimeraLetra(String entrada) {
        // Convierte la entrada a minúsculas para que sea insensible a mayúsculas y minúsculas
        entrada = entrada.toLowerCase();
        
        if (entrada.startsWith("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}







