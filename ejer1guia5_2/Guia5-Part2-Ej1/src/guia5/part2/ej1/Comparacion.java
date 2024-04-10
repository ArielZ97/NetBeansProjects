
package guia5.part2.ej1;

import java.util.Comparator;


public class Comparacion {
    
    
    public static Comparator <Pelicula> titulo = new Comparator<Pelicula>(){
       
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            int orden = o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
            
            return orden;
            
        }
        
        
    };
    
    
    public static Comparator <Pelicula> director = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           
            int orden = o1.getDirector().compareToIgnoreCase(o2.getDirector());
            
            return orden;
            
        }
        
    };
    
}
