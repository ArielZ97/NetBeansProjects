//En un nuevo proyecto en el método main de su clase principal, se pide crear un algoritmo que
//rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden
//descendente.

package com.mycompany.ejer2guia5;


public class Ejer2guia5 {

    public static void main(String[] args) {
       int[] numeros = new int[100];

        // Rellenar el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = 100 - i;
        }

        // Mostrar los números en orden descendente
        for (int i = 0; i < 100; i++) {
            System.out.println(numeros[i]);
        }
    }
}

//public void agregarModelo(int cantidad) {
//        Random random = new Random();
//        int numeroPelicula = pelis.size() + 1; // Comienza en 1 int ultimoIndice = proyecciones.size() - 1;
//
//        char xxChar;
//        for (int i = 0; i < cantidad; i++) {
//            xxChar = (char) (random.nextInt(26) + 'A');
//            String titulo = xxChar + "_pelicula #" + (numeroPelicula);
//            xxChar = (char) (random.nextInt(26) + 'a');
//            String director = xxChar + "_director #" + (numeroPelicula);
//            int duracion = random.nextInt(200); //
//
//            Pelicula pelicula = new Pelicula(titulo, director, duracion);
//            pelis.add(pelicula);
//            numeroPelicula++;
//        }
//
//        System.out.println("se han agregado " + cantidad + " peliculas");
//        System.out.println();
//    }