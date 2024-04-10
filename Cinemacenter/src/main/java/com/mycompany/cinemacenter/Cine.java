
package com.mycompany.cinemacenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Ariel Zurita
 */
public class Cine {
    private String nombre, direccion;
    private ArrayList<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        proyecciones = new ArrayList();
        
    }
    
    public void agregarPelicula(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la pelicula ");
        String tit = leer.nextLine();
        System.out.println("Ingrese el Director de la pelicula ");
        String direc = leer.nextLine();
        System.out.println("Ingrese la duracion de la pelicula ");
        double durac = leer.nextDouble();
        leer.nextLine();
        Pelicula p = new Pelicula(tit, direc, durac );
        proyecciones.add(p);
    }
    
    public void mostrarColeccion(){
        System.out.println("Peliculas");
        System.out.println(proyecciones);
    }
    // aca hago los ordenamientos o comparacion 
    public void ordenarTitulos(){
        Comparator<Pelicula> ordenaPorTitulo;
        ordenaPorTitulo = new Comparator<Pelicula> (){
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
         };
        Collections.sort(proyecciones, ordenaPorTitulo);
        // las llaves es la implementacion de las clases anonimas 
    }
    
    public void ordenarDirector(){
        Comparator<Pelicula> ordenaPorDirector;
        ordenaPorDirector = new Comparator<Pelicula> (){
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o1.getDireccion().compareTo(o2.getDireccion());
            }
         };
        Collections.sort(proyecciones, ordenaPorDirector);
        
    }
    
    public void ordenarDuraccion(){
        Comparator<Pelicula> ordenaPorDuracion;
        ordenaPorDuracion = new Comparator<Pelicula> (){
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o1.getDuracion().compareTo(o2.getDuracion());
            }
         };
        Collections.sort(proyecciones, ordenaPorDuracion);
        
    }
     
}
