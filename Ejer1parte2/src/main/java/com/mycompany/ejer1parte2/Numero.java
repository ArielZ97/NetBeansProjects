//En un nuevo proyecto crear una clase de nombre Numero, con un atributo de tipo entero, un
//constructor que permita inicializar dicho atributo, los métodos getter y setter y los siguientes
//métodos adicionales:
// esPar: este método retornará true si el valor guardado en el atributo es par, caso contrario
//retornará false.
// esPositivo: este método retornará true si el valor guardado en el atributo es mayor o igual
//a cero, caso contrario retornará false.
// esMultiploDe: este método recibirá un valor por parámetro y retornará true si el valor
//guardado en el atributo es múltiplo del valor recibido, caso contrario retornará false.
//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//
//a) Crear un objeto Numero con el valor 1459
//Luego utilizando sus métodos:
//b) Mostrar por consola si es par o no.
//c) Mostrar por consola si es positivo o no.
//d) Mostrar por consola si es múltiplo de 3.

package com.mycompany.ejer1parte2;

/**
 *
 * @author Ariel Zurita
 */
public class Numero {
    private int nro;

    public Numero(int nro) {
        this.nro = nro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    public boolean esPar(){
        return this.nro % 2 == 0;
      
    }
        public boolean esPositivo(){
            return this.nro >= 0;
        }
        public boolean esMultiploDe(int otroNro){
            return  otroNro % this.nro==0;
        }

}
