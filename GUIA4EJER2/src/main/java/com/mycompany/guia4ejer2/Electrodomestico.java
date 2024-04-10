//Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
//Los constructores que se deben implementar son los siguientes:
//• Un constructor vacío.
//• Un constructor con todos los atributos pasados por parámetro.
//Los métodos a implementar son:
//• Métodos getters y setters de todos los atributos.
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es
//correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
//Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el
//color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro,
//rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se
//invocará al crear el objeto y no será visible.
//• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio.
//Esta es la lista de precios:
package com.mycompany.guia4ejer2;


public class Electrodomestico {
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetio, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetio() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetio(char consumoEnergetio) {
        this.consumoEnergetico = consumoEnergetio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    // Método privado para comprobar el consumo energético
    private char comprobarConsumoEnergetico(char letra) {
        // Verificar que la letra esté entre A y F
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F'; // Si no es válido, establecer como F por defecto
        }
        
    

    }
}
