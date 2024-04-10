
package guia5.part2.ej1;

public class Pelicula implements Comparable<Pelicula>{

    //static String peli1;

    //static String peli1;
    
    private String titulo;
    private String director;
    private Integer duracionEnMinutos;

    
    
    public Pelicula(String titulo, String director, Integer duracionEnMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(Integer duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    
    @Override
    public String toString(){
        return "TÍTULO: " + titulo + ", DIRECTOR: " + director + ", DURACIÓN: " + duracionEnMinutos + " minutos";
    }
    
    
    @Override
    public int compareTo(Pelicula o) {
        
        int orden;
        
        orden = duracionEnMinutos.compareTo(o.duracionEnMinutos);
        
        return orden;
        
    }
    
    
    
    

   
    
}
