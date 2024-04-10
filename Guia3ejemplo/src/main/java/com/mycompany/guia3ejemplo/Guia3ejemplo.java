/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3ejemplo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ariel Zurita
 */
public class Guia3ejemplo {

    public static void main(String[] args) {
        //representar fecha actual
        
        LocalDate Hoy = LocalDate.now();
//        System.out.println(Actual );
        LocalDate diaNombre = Hoy.plusDays(1);
        System.out.println(diaNombre.getDayOfWeek());
//------------------------------------------------------------------------------------
// mostrar fecha de mi cumpleaños 15 de febrero 2023
      
//    LocalDate fecha1 = LocalDate.of(1997, Month.FEBRUARY, 15);
//    System.out.println(fecha1);
//-----------------------------------------------------------------------------------
// representar una fecha proveniente de un string
//        String Cadena ="2023-02-15";
//        LocalDate fecha2= LocalDate.parse(Cadena);
//        System.out.println(fecha2);
 //-----------------------------------------------------------------------------------       
// representar una fecha con otro formato local 
 
//String Cadena ="15/02/2023";
//DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//LocalDate fecha2 = LocalDate.parse(Cadena, forma);
//        System.out.println(fecha2);

//------------------------------------------------------------------------------------
// dadas dos fechas, calcula el tiempo entre ellas.
 
// LocalDate Hasta = LocalDate.of(1999, Month.OCTOBER, 21);
// LocalDate Desde = LocalDate.now();
//long dias = ChronoUnit.DAYS.between(Hasta, Desde);
//        System.out.println(dias);
//  LocalDate Hoy = LocalDate.now();
//        DayOfWeek diaNombre = Hoy.getDayOfWeek();
//        System.out.println(diaNombre);
        
        
    }
}
