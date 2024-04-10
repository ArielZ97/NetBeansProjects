//La agencia inmobiliaria "Casas Felices" necesita un programa para gestionar su
//inventario de propiedades. Se requiere implementar un sistema en Java que utilice
//conceptos de colecciones, polimorfismo y manejo de excepciones para administrar
//los diferentes tipos de propiedades que ofrece la agencia.
//Crea una clase abstracta llamada "Propiedad" con los siguientes atributos
//privados:
//● nombre (String): el nombre de la propiedad.
//● precio (double): el precio de la propiedad.
//● stock (int): la cantidad de propiedades en stock.
//Esta clase debe tener un único constructor que reciba los valores para los
//atributos y los inicialice. Además, implementa los siguientes métodos:
//● Getters y setters.
//Crea tres clases derivadas de "Propiedad": Casa, Departamento y Terreno.
//Cada clase derivada debe tener atributos según el tipo de propiedad. Casa
//debe tener un atributo "numHabitaciones", Departamento debe tener un
//atributo "numPisos", y Terreno debe tener un atributo "area". Asegúrate de que
//cada clase derivada tenga un constructor que reciba los valores para los
//atributos y los inicialice correctamente. Además, cada clase derivada debe
//sobrescribir el método "calcularPrecioTotal()" para calcular el precio total de
//la propiedad, teniendo en cuenta:
//● Si hay más de 10 casas se aplica un descuento al precio del 5%.
//● Si hay más de 10 terrenos en venta se aplica un descuento del 7% al
//precio.

package com.mycompany.ejem_parcial;

/**
 *
 * @author Ariel Zurita
 */
public class Propiedad {
    private String nombre; // el nombre de la propiedad.
    private double precio; // el precio de la propiedad.
    private int stock; // la cantidad de propiedades en stock.

    public Propiedad(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public class 
        // Método para calcular el precio total

    public double calcularPrecioTotal() {
       double precioTotal = getPrecio();
       
       // Aplicar descuento del 5% si hay más de 10 casas
        // Aplicar descuento del 7% si hay más de 10 terrenos
        
        if (this instanceof Casa && getStock()> 10){
            
        }
       
   } 
   
   
}
