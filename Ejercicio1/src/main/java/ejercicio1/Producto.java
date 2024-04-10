//1. En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
//entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
//que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
//de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
//de todos sus atributos.
package ejercicio1;


public class Producto {
    //agregar los atributos con sus respectivas condiciones ej. private/public. 
    // y las descripciones que te pide el ejercicio.
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    //a continuacion debemos crear un constructor que acepten los parametros para inicializar
    //los atributos. ejem. public Producto(int codigo, String descripcion, double precio, int stock) {
    public Producto(int codigo, String descripcion, double precio, int stock) {
      //ahora vamos a asignar los valores pasandolo a argumentos los atributos correspondientes
      // usando la referencia this.
      this.codigo=codigo;
      this.descripcion=descripcion;
      this.precio=precio;
      this.stock=stock;
      
          
      }
      //Estos son los métodos get y set para el atributo codigo. El método getCodigo() 
//devuelve el valor actual del atributo codigo, mientras que el método setCodigo
//(int codigo) permite modificar el valor del atributo codigo.  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    /*En el método main, creamos una instancia de la clase Producto utilizando el 
constructor que creamos antes. Le proporcionamos valores iniciales para cada atributo.*/
    public static void main(String[] args) {
        Producto producto = new Producto(1, "Producto Ejemplo", 25.50, 1000);
     /*Aquí estamos imprimiendo el estado del producto utilizando los métodos get 
para obtener los valores actuales de cada atributo y mostrarlos en la consola.*/   
      System.out.println("Estado del Producto:");
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());   
    }
}
