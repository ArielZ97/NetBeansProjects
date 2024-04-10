//En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos
//estáticos (static):
//
//a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
//enteros y muestre por pantalla la suma y promedio de los mismos.
//
//b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
//irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
//c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
//de vocales que tiene la cadena.
//
//d) Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
//retorne la cantidad de veces que se repite en la cadena el carácter recibido.
//
//Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos
//de la clase Arreglo creada por usted.
package com.mycompany.guia5_eje1;


public class Arreglo {
    //metodo suma y promedio de los elementos 
    public static void sumarLista(int[] arreglo ){
        int suma = 0;
        for (int i = 0; i< arreglo.length; i++){
            suma += arreglo[i];
        }
        double promedio = (double) suma/arreglo.length;
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
        
    }
    //Este método recibe como parámetro un arreglo bidimensional e irregular de enteros y
    //retorna el entero más grande que se encuentra en el arreglo.
   public static int buscarMayor(int[][] arreglo){
       int mayor = Integer.MIN_VALUE;
       for( int i = 0; i < arreglo.length; i++){
       for( int j = 0; i < arreglo[i].length; j++){
       if (arreglo[i][j] > mayor){
       mayor = arreglo[i][j];
       }
       }
       }
       return mayor;   
   } 
   //Este método recibe como parámetro una cadena de texto y retorna 
//la cantidad de vocales que contiene.
public static int cuentaVocales(String cadena){
    int contador = 0;
    cadena = cadena.toLowerCase();
    for (int i = 0; i < cadena.length(); i++ ){
        char caracter = cadena.charAt(i);
    if (caracter == "a" || caracter == "e" || caracter == "i" || caracter == "o" || caracter == "u"){
        contador++;
    }    
    }
    return contador;  

}
   
}

