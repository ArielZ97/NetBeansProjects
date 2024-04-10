//2. En un nuevo proyecto crear una clase que represente una Computadora, usted determine
//que atributos describirían mejor a dicho objeto y luego agregue un constructor para
//inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de
//la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado
//de todos sus atributos.

package com.mycompany.ejercicio2;


public class Ejercicio2 {

    public static void main(String[] args) {
        Computadora p1=new Computadora("samsung", "sony", 64);
        System.out.println("Marca: "+p1.getMarca());
        System.out.println("Monitor : "+p1.getMonitor());
        System.out.println("Memoria : "+p1.getMemoria());
        
        
        
                
    }
}
