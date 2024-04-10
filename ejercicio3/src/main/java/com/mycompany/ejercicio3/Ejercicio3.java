//3. En un nuevo proyecto crear una clase de nombre Jugador con los atributos: nombre,
//puntaje, nacionalidad y edad. Luego un constructor vació y un constructor que inicialice
//todos sus atributos; agregue además los respectivos métodos getter y setter. Desde el
//método main de la clase principal del proyecto crear un Jugador utilizando el constructor
//vacío; luego, a dicho jugador darle de nombre “Juan”, con 140 puntos, de nacionalidad
//“Argentino” y una edad de 29 años; por último mostrar por consola el estado de cada uno
//de sus atributos.

package com.mycompany.ejercicio3;


public class Ejercicio3 {

    public static void main(String[] args) {
      Jugador p1=new Jugador("Juan",8,"Argentina",29);
        
        System.out.println("Nombre : "+p1.getNombre());
        System.out.println("Puntaje : "+p1.getPuntaje());
        System.out.println("Nacionalidad : "+p1.getNacionalidad());
        System.out.println("Edad : "+p1.getEdad());
    }
}
