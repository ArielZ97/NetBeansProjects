//En un nuevo proyecto, crear una clase de nombre Conversor con los siguientes métodos
//estáticos:
// convertirAPesos(): recibe un valor en dólares y retorna convertido a pesos argentinos.
// convertirADolar(): recibe un valor en pesos argentinos y retorna convertido a dólar.
//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//Utilizando los métodos estáticos de la clase Conversor.
//a) Convertir 500 dólares a pesos y mostrar por consola lo convertido.
//b) Convertir 25700 pesos a dólares y mostrar por consola lo convertido.
package com.mycompany.ejer4parte2;

/**
 *
 * @author Ariel Zurita
 */
public class Ejer4parte2 {

    public static void main(String[] args) {
        System.out.println(" $ " + Conversor.convertirAPesos(500));
        System.out.println(" U$D " + Conversor.convertirADolar(25700));
    }
}
