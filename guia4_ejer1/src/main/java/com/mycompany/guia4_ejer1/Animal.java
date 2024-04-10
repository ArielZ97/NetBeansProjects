//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
//Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
//un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice
//lo siguiente:
package com.mycompany.guia4_ejer1;


public class Animal {
    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de " + alimento);
    }
    
    public class Perro extends Animal {
    public Perro(String nombre, int edad, String raza) {
        super(nombre, "croquetas", edad, raza);
    }

    // Puedes agregar métodos específicos para un perro si es necesario
}

public class Gato extends Animal {
    public Gato(String nombre, int edad, String raza) {
        super(nombre, "comida para gatos", edad, raza);
    }

    // Puedes agregar métodos específicos para un gato si es necesario
}

public class Caballo extends Animal {
    public Caballo(String nombre, int edad, String raza) {
        super(nombre, "heno y pasto", edad, raza);
    }

    // Puedes agregar métodos específicos para un caballo si es necesario
}

    
}
