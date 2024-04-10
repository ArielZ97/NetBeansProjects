
package guia5.part2.ej1;

import java.util.Scanner;

/**
 * 
 * Dado el siguiente modelo, implementar según la consigna
 * 
 * Descripción de los métodos de la clase Cine:
 * 
 * 
 * 
 * agregarPelicula(Pelicula):void  Recibe una Película y la agrega a la lista que posee el Cine.
 * 
 * 
 * listarTodo():void  Muestra por consola todas las Películas registradas en el Cine.
 * 
 * 
 * listarDuranMas(horas):void  Reciba una cantidad de horas y muestra por consola todas las películas que
 * tengan una duración mayor a la recibida por parámetro.
 * 
 * 
 * listarMenorDuracionAMayorDuracion():void  Lista las Películas ordenadas de menor a mayor.
 * 
 * 
 * listarOrdenadasPorTituloAZ():void  Lista las Películas ordenadas alfabéticamente por el título.
 * 
 * 
 * listarOrdenadasPorDirectorAZ():void  Lista las Películas ordenadas alfabéticamente por el director.
 * 
 * 
 * 
 * 
 * 
 * 
 * Desde el método main de una clase Test, se pide:
 * 
 *  Crear el Cine ROMA SRL, ubicado en Rivadavia 325.
 * 
 * Definir un bucle que crea un objeto Película pidiéndole al usuario todos sus
 * datos y guardándolos en el objeto Película. Después, esa Película se guarda
 * en el Cine usado su método agregarPelicula y se le pregunta al usuario si
 * quiere crear otra Película o no.
 * 
 *  Pedir al Cine que liste las películas que duren más de x cantidad de horas
 * que el usuario ingresará por teclado.
 * 
 *  Pedir al cine que liste todas las películas.
 * 
 *  Pedir al cine que liste las películas ordenadas por título.
 * 
 *  Pedir al cine que liste las películas ordenadas por director.
 * 
 *  Pedir al cine que liste las películas ordenadas por duración.
 * 
 * 
 */
public class Guia5Part2Ej1 {

    public static void main(String[] args) {
        
        Cine cinema = new Cine("Cine ROMA SRL", "Rivadavia 325");
        
        Scanner leer = new Scanner (System.in);
        
        boolean respuesta = true;
        
        while (respuesta = true) {            
            
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = leer.next();
            leer.nextLine();
            
            System.out.println("Ingrese el nombre del director de la pelicula: " + titulo);
            String director = leer.nextLine();
            
            System.out.println("Ingrese el tiempo de duracion de la pelicula: " + titulo + ", expresada en minutos");
            int duracion = leer.nextInt();
            
            Pelicula peli1 = new Pelicula(titulo, director, duracion);
            
            cinema.agregarpelicula(peli1);
            
            System.out.println("¿Desea agregar otra pelicula?, ¿SI o NO?");


            String rePuesta = leer.next();

            
            System.out.println("Ud dijo:" + rePuesta);
            
            if (rePuesta.equalsIgnoreCase("si")) {
                respuesta = true;
            } else {
                respuesta = false;
                break;
            }

        }
        
        
        
        cinema.listarTodo();
        
        cinema.listarOrdenadasPorTituloAZ();
        
        cinema.listarOrdenadasPorDirectorAZ();
        
        cinema.listarDuranMas(60);
        
    }
    
}
