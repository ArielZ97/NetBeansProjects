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
//Crea una clase "Inmobiliaria" que declare un mapa (Map) llamado "inventario"
//para almacenar las propiedades en stock. Utiliza el nombre de la propiedad
//como clave (String) y la instancia de "Propiedad" como valor.
//Debe incluir 3 metodos:
//● El método void agregarPropiedad(Propiedad propiedad) que tenga en
//cuenta que el método dispara una excepción tipo
//“IllegalArgumentException” en caso de que se intente agregar una
//propiedad null o que se intente agregar un nombre de propiedad ya
//existente.
//● El método mostrarInventario() que muestre el inventario completo con
//un for-each sobre las claves y los valores del mapa.
//● El método double alquilarDptos() que retorne la suma de los alquileres
//de Departamentos.
//Crea una interfaz "Alquiler" que incluya el método double calcularAlquiler()
//para calcular el descuento en el precio según la política de descuentos de la
//inmobiliaria. Haz que Departamento implemente esta interfaz, teniendo en
//cuenta que para un departamento el alquiler mensual es igual al precio base
//de alquiler más 10% por piso adicional

package com.mycompany.ejem_parcial;

/**
 *
 * @author Ariel Zurita
 */
public class Ejem_parcial {

    public static void main(String[] args) {
        
    }
}
