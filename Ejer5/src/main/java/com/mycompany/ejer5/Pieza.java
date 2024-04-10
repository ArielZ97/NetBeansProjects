//En un nuevo proyecto para un juego de ajedrez, nos piden modelar e implementar una clase
//que representa una Pieza de dicho juego. Usted deberá pensar que atributos serían
//necesarios para describir las características de dicha clase, agregarle los métodos getter y
//setter correspondientes y luego probar desde el main de la clase principal del proyecto.
package com.mycompany.ejer5;

/**
 *
 * @author Ariel Zurita
 */
public class Pieza {
    private String color;
    private String tipo;
    
     public Pieza(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     
}
