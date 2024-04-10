

package com.mycompany.ejer3guia5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Ejer3guia5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del vector: ");
        int N = scanner.nextInt();

        int[] vector = new int[N];

        // Rellenar el vector con valores aleatorios
        for (int i = 0; i < N; i++) {
            vector[i] = random.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        int repeticiones = 0;

        // Buscar el número en el vector y contar las repeticiones
        for (int i = 0; i < N; i++) {
            if (vector[i] == numeroBuscado) {
                encontrado = true;
                repeticiones++;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " se encuentra en el vector.");
            System.out.println("Se repite " + repeticiones + " veces.");
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }

        System.out.println("Vector: " + Arrays.toString(vector));
    }
}
