

package com.mycompany.cinemacenter;

/**
 *
 * @author Ariel Zurita
 */
public class Cinemacenter {

    public static void main(String[] args) {
        Cine c1 = new Cine ("oasis", "av la plata");
        for (int i = 0; i < 2; i++) {
            c1.agregarPelicula();
            
        }
        c1.mostrarColeccion();
        c1.ordenarDirector();
        
        c1.mostrarColeccion();
        c1.ordenarTitulos();
        
        c1.mostrarColeccion();
        c1.ordenarDuraccion();
       
    }
}
