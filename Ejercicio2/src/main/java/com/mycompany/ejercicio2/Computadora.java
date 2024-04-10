//2. En un nuevo proyecto crear una clase que represente una Computadora, usted determine
//que atributos describirían mejor a dicho objeto y luego agregue un constructor para
//inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de
//la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado
//de todos sus atributos.
package com.mycompany.ejercicio2;

/**
 *
 * @author Ariel Zurita
 */
public class Computadora{ 
private String marca; 
private String monitor;
private int memoria;

public Computadora(String marca, String monitor, int memoria) {
    this.marca=marca;
    this.monitor=monitor;
    this.memoria=memoria;
   
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

//public static void main(String[] args) {
//    Computadora pl = new Computadora();
//    System.out.println("Marca: " + pl.getMarca());
//    System.out.println("Monitor: " + pl.getMonitor());
//    System.out.println("Memoria: " + pl.getMemoria());
//}
}