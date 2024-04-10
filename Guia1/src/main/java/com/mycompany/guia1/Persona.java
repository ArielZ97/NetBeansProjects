/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia1;

/**
 *
 * @author Ariel Zurita
 */
public class Persona {
    private String apellido;
    private String nombre;
    private int edad;
    
    
    public Persona(String apellido,String nombre, int edad) {
      this.apellido=apellido;
      this.nombre=nombre;
      this.edad=edad;
    }
  
    

public  String getApellido(){
    return apellido;
}

public void setApellido(String apellido){
    this.apellido=apellido;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("hola, mi nombre es "+nombre);
    }
}




