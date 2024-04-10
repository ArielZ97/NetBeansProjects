/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1guia3;

/**
 *
 * @author Ariel Zurita
 */
class perro {
    
    private String Nombre;
    private String Raza;
    private int edad;
    private String tamaño;
    
    public perro(String Nombre, String Raza, int edad, String tamaño){
        this.Nombre= Nombre;
        this.Raza= Raza;
        this.edad = edad;
        this.tamaño= tamaño;
        
    }
    // crear getter y setter.

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    

    
            
    
}
