//Un Kiosco tiene 3 Empleados. Vamos a contar de dos clases. Kiosco, que tendrá los atributos:
//dirección, nombre, cuit y 3 atributos de tipo Empleado; y la clase Empleado posee los atributos:
//nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
//la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
//Empleado con mayor antigüedad.
//
//Ahora en el método main de la clase principal usted creará un Kiosco y 3 Empleados, luego
//incorporará al Kisoco esos Empleados y le solicitará al Kiosco que muestre los datos del Empleado
//de mayor antigüedad.
package com.mycompany.ejer2guia3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ariel Zurita
 */
public class Kiosco {
    
    private String direccion;
    private String nombre;
    private String cuit;
    
    private Empleado emp1;
    private Empleado emp2;
    private Empleado emp3;
    
    public Kiosco(String direccion, String nombre, String cuit) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;
        
    
   } 

    Kiosco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void ingresoEmpleado(Empleado e1, Empleado e2, Empleado e3){
        emp1 = e1; emp2 = e2; emp3 = e3;
    }
    public void masAntiguo(Empleado e1, Empleado e2, Empleado e3){
        LocalDate hoy = LocalDate.now();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate f1 = LocalDate.parse(e1.getFecha_de_Ingreso(), formato);
        LocalDate f2 = LocalDate.parse(e1.getFecha_de_Ingreso(), formato);
        LocalDate f3 = LocalDate.parse(e1.getFecha_de_Ingreso(), formato);
        
       long d1 = ChronoUnit.DAYS.between(f1, hoy);
       long d2 = ChronoUnit.DAYS.between(f2, hoy);
       long d3 = ChronoUnit.DAYS.between(f3, hoy);
       
       if (d1 > d2 && d1 > d3){System.out.println(e1.getNombre()+ "Es el mas antiguo ");}
       else if (d2 > d1 && d2 > d3){System.out.println(e2.getNombre()+ "Es el mas antiguo ");}
       else if (d3 > d1 && d3 > d2){System.out.println(e2.getNombre()+ "Es el mas antiguo ");}
       else System.out.println("No hay un empleado mas antiguo ");    
       
       
    }
}