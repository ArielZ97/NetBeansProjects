/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejertres;

/**
 *
 * @author Ariel Zurita
 */
public class Jugador {
    private String nombre;
    private int puntaje;
    private String nacionalidad;
    private int edad;
    
    public Jugador(){}
    
     public Jugador(String nombre,int puntaje,String nacionalidad, int edad){
        this.nombre=nombre;
        this.puntaje= puntaje;
        this.nacionalidad=nacionalidad;
        this.edad=edad;
        
    }
 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
}
