/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer5;

/**
 *
 * @author Ariel Zurita
 */
public class Ejer5 {

    public static void main(String[] args) {
        Pieza pl = new Pieza("caballo", "negro");
       System.out.println("Tipo de pieza: " + pl.getTipo());
       System.out.println("Color de pieza: " + pl.getColor()); 
       
       // ahora cambio el color y tipo de pieza utilizando el metodo setter.
       pl.setTipo("Reina");
       pl.setColor("Blanca");
       
       System.out.println("Nuevo tipo de pieza: " + pl.getTipo());
       System.out.println("Nuevo color de pieza: " + pl.getColor());
    }
}
