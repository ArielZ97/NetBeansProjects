
package com.mycompany.cinemacenter;

/**
 *
 * @author Ariel Zurita
 */
public class Pelicula {

    public Pelicula(String tit, String direc, double durac) {
    }
    private String titulo, director;
    private Double duracion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDireccion() {
        return director;
    }

    public void setDireccion(String direccion) {
        this.director = direccion;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "  " + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
    
    
}
