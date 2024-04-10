//En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
//entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
//que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
//de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
//de todos sus atributos.

package ejercicio1;


public class Ejercicio1 {

    public static void main(String[] args) {
        Producto p1=new Producto(12345,"Galletas",420,50);
        
        System.out.println("Codigo: "+p1.getCodigo());
        System.out.println("Descripcion: "+p1.getDescripcion());
        System.out.println("Precio: "+p1.getPrecio());
        System.out.println("Stock: "+p1.getStock());
        
        
       
    }
}
