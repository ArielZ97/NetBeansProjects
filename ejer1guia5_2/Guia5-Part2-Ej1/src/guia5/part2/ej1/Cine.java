
package guia5.part2.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cine {
    
    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> proyecciones = new ArrayList();;
    private Scanner leer = new Scanner (System.in);
    
    
    
    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    
    
    public void agregarpelicula(Pelicula peli){
        
        proyecciones.add(peli);
        
    }
    
    
    public void listarTodo(){
        
        System.out.println("En el cine tenemos " + proyecciones.size() + " peliculas");
        System.out.println(" ");
        System.out.println("Las peliculas en cartelera son las siguientes:");
        System.out.println(" ");
        
        for (Pelicula salida : proyecciones) {
            
            System.out.println(salida);
            
        }
        
        
        System.out.println(" ");
    }
   
    
    public void listarDuranMas(int duracionEnMinutos){
        
        System.out.println("¿Cual es el limite que tolera ver una pelicula, expresada en minutos?");
        int duracionPreferencia = leer.nextInt();
        
        
         
            Collections.sort(proyecciones);
            
            for (Pelicula salida : proyecciones) {
                
                System.out.println(salida);
                
            }
        
//        if(duracionPreferencia < duracionEnMinutos ){
//            
//            //collection.sort ordena los elementos dentro del array
//            
//           
//            
//        }
        
    }
    
    
    public void listarMenorDuracionAMayorDuracion(){
        
        System.out.println("Ahora veremos las peliculas ordenadas de menor a mayor, por su tiempo de duración");
        System.out.println(" ");
        
        Collections.sort(proyecciones);
        
        for (Pelicula salida : proyecciones) {
            
            System.out.println(salida);
            
        }
        
        
    }    
    
    
    public void listarOrdenadasPorTituloAZ(){
        
        System.out.println("Ahora veremos las peliculas ordenadas por titulo");
        System.out.println(" ");
        
        Collections.sort(proyecciones, Comparacion.titulo);
        
        for (Pelicula salida : proyecciones) {
            
            System.out.println(salida);
            
        }
        
    }
    
    
    public void listarOrdenadasPorDirectorAZ(){
        
        System.out.println("Ahora veremos las peliculas ordenadas por director");
        System.out.println(" ");
        
        Collections.sort(proyecciones, Comparacion.director);
        
       for (Pelicula salida : proyecciones) {
            
            System.out.println(salida);
            
        }
        
    }
    
    
    
    
}
