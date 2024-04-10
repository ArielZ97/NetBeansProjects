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

import java.util.Date;

/**
 *
 * @author Ariel Zurita
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private Date fecha_de_Ingreso;
    private String dni;

    public Empleado(String nombre, String apellido, Date fechaIngreso, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_Ingreso = fecha_de_Ingreso;
        this.dni = dni;
    }

    CharSequence getFecha_de_Ingreso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
