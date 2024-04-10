//En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de métodos estáticos:
// dibujaCuadrado(): Este método recibe un número entero N, y dibujará un
//cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//
//* * * *
//* *
//* *
//* * * *
//
// elMayorEs(): Este método recibe 3 números enteros y mostrará por consola cual es el
//mayor. En caso de ser iguales lo deberá informar.
// elDiaEs(): Se espera que este método reciba un numero entero entre 1 y 7 que
//corresponderá a un día de la semana, retornando el nombre que le corresponda, por
//ejemplo: 1 Lunes, 2Martes, 3Miércoles, 4Jueves, 5Viernes, 6Sábado, 7
//Domingo. Si recibe un valor distinto retornará “No existe ese día!!!”.
//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//
//Utilizando los métodos estáticos de Utilitario:
//a) Dibujar un cuadrado de 5 elementos.
//b) Mostrar el mayor entre (20,75 y 40)
//c) Mostrar el nombre del día 5.

package com.mycompany.ejer5parte2;

public class Ejer5parte2 {

public static void main(String[] args) {
    // a) Dibujar un cuadrado de 5 elementos.
    System.out.println("Dibujando cuadrado de 5 elementos:");
    Utilitario.dibujaCuadrado(5);
    System.out.println();

        // b) Mostrar el mayor entre (20, 75 y 40)
    System.out.println("Mostrando el mayor entre 20, 75 y 40:");
    Utilitario.elMayorEs(20, 75, 40);
    System.out.println();

        // c) Mostrar el nombre del día 5.
    System.out.println("El nombre del día 5 es: " + Utilitario.elDiaEs(5));
    }
  }

