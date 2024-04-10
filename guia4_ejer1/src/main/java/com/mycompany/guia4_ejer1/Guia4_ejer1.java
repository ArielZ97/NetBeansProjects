

package com.mycompany.guia4_ejer1;


public class Guia4_ejer1 {

    public static void main(String[] args) {
        Perro miPerro = new Perro("Max", 3, "Labrador");
        Gato miGato = new Gato("Whiskers", 2, "Siamese");
        Caballo miCaballo = new Caballo("Spirit", 5, "Mustang");

        miPerro.alimentarse();  // Muestra cómo se alimenta el perro
        miGato.alimentarse();   // Muestra cómo se alimenta el gato
        miCaballo.alimentarse(); // Muestra cómo se alimenta el caballo
    }
}
