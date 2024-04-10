//En un nuevo proyecto, en el método main de su clase principal, se pide realizar un algoritmo
//que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.

package com.mycompany.ejer4guia5;

import java.util.Scanner;


public class Ejer4guia5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int matriz [][] = new int [4][4];
       
        System.out.println("Digite la Matriz ");
        for(int i= 0; i<4; i++ ) {
            for(int j=0; j<4;j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Matriz original");
        for(int i=0;i<4;i++) {
            for(int j=0; j<4;j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        // transponer la matriz 
        int aux;
        int[][]transpuesta= new int[4][4];
        for(int i=0; i<4; i++){
        for(int j=0; j<i; j++){
            aux = matriz[i][j];
            matriz[j][i]= aux;
            
        }
        
                
    }
        System.out.println("La matriz transpuesta es: ");
        for(int i=0; i<4;i++) {
            int j;
            for(j=0; j<4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
