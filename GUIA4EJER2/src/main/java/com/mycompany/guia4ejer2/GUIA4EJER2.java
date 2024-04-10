/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia4ejer2;

/**
 *
 * @author Ariel Zurita
 */
public class GUIA4EJER2 {

    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico(500, "Blanco", 'A', 15);
// En este caso, 'A' es una letra válida para consumo energético.

Electrodomestico electrodomestico2 = new Electrodomestico(400, "Negro", 'G', 10);
// 'G' no es una letra válida, por lo que se establece 'F' por defecto.
    }
}
