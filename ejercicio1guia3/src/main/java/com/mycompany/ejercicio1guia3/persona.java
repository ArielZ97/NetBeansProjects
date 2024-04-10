/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1guia3;

/**
 *
 * @author Ariel Zurita
 */
class Persona { 
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Documento;
    private perro[] perrosAdoptados;
    
    public Persona(String juan, String Apellido, int Edad, int Documento){
        this. Nombre = Nombre;
        this.Apellido= Apellido;
        this.Edad = Edad;
        this.Documento = Documento;
        this.perrosAdoptados = new perro[3]; // Inicializamos el arreglo de perros
        
        // metodo adoptar perro
    }
    public void adoptarPerro(perro perro){
        if (perrosAdoptados[0] == null) {
            perrosAdoptados [0] = perro;
            System.out.println("adoptaste a "+ perro.getNombre() + "!");  
            
            
        }else if (perrosAdoptados[1] == null){
            perrosAdoptados [1] = perro; 
            System.out.println("adoptaste a "+ perro.getNombre() + "!");
            
        }else if (perrosAdoptados [2]== null){
            perrosAdoptados [2] = perro;
            System.out.println("adoptaste a "+ perro.getNombre() + "!");
            
        }else System.out.println("ya no puedes adoptar mas perros ");
        
        
        // Método para encontrar el perro de mayor edad
    }
    public perro perroMasGrande() {
        perro perroMayorEdad = null;
        int maxEdad = -1; // Inicializamos con un valor negativo para encontrar el máximo

        for (perro perro : perrosAdoptados) {
            if (perro != null && perro.getEdad() > maxEdad) {
                perroMayorEdad = perro;
                maxEdad = perro.getEdad();
            }
        }

        return perroMayorEdad;
    }
    
    
}
