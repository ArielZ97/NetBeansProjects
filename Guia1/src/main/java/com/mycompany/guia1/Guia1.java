

package com.mycompany.guia1;


public class Guia1 {

    public static void main(String[] args) {
       Persona ariel=new Persona("Ariel","Zurita",26);
       ariel.saludar();
       ariel.setNombre("Gonzalo");
       ariel.saludar();
       System.out.println(ariel.getEdad());
       ariel.setEdad(26);
        System.out.println(ariel.getEdad());
    }
}
