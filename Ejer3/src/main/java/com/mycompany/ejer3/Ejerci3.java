
package com.mycompany.ejer3;

/**
 *
 * @author Ariel Zurita
 */
public class Ejerci3 {
    

 public static void main(String[] args) {
     Jugador j1 = new Jugador();
    j1.setNombre("Juan");
    j1.setPuntaje(140);
    j1.setNacionalidad("Argentino");
    j1.setEdad(29);{
     System.out.println("Nombre: " + j1.getNombre());
    System.out.println("Puntaje: " + j1.getPuntaje());
    System.out.println("Nacionalidad: " + j1.getNacionalidad());
    System.out.println("Edad: " + j1.getEdad());
 }
    
}
 }