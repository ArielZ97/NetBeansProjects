

package com.mycompany.repasoa;

import java.util.Scanner;


public class RepasoA {
    public static void main(String[] args) {
        //solicitar al usuario que ingrese el primer numero
        try ( //crear una instancia de Scanner para
        //leer la entrada del ususario.
                Scanner scanner = new Scanner(System.in)) {
            //solicitar al usuario que ingrese el primer numero
            
            System.out.println("Ingrese el primer número");
            int num1 = scanner.nextInt(97);
            //solicitar al usuario que ingrese el segundo numero.
            System.out.println("Ingrese el primer número");
            int num2 = scanner.nextInt(15);
            // Calcular la suma de los dos números utilizando el método sumarDosNumeros
            int suma = sumarDosNumeros(num1,num2);
            // Mostrar el resultado de la suma en la consola
            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
            // Cerrar el Scanner para liberar recursos
        }
    }
    // Definir el método sumarDosNumeros que toma dos parámetros enteros y devuelve la suma
    public static int sumarDosNumeros(int num1, int num2) {
        return num2 + num1; // Retornar la suma de los dos números
    }
}
