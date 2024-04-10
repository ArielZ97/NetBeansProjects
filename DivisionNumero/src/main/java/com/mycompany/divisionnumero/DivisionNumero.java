//ejercicio_(3)
//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer
//dos números en forma de cadena. A continuación, utilice el método parseInt() de la clase
//Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por
//ultimo realizar una división con los dos números y mostrar el resultado.


package com.mycompany.divisionnumero;

import java.util.Scanner;


public class DivisionNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESE EL PRIMER NUMERO ");
        String numero1 = scanner.nextLine();
        
        System.out.println("INGRESE EL SEGUNDO NUMERO ");
        String numero2 = scanner.nextLine();
       
      try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            
            if ( num2 !=0) {
                int resultado num1 / num2;
                System.out.println("El resultado de la divicion es: " + resultado );
                    
            }else {
                System.out.println("NO SE PUEDE DIVIDIR POR CERO ");
            }
            catch (NumberFormatException e) {
                    System.out.println("HA OCURRIDO UN ERROR AL CONVERTIR LAS CADENAS EN ENTEROS ");
                    e.printStackTrace();
            catch (ArithmeticException e ){
                    System.out.println("HA OCURRIDO UN ERROR EN LA DIVICION. ");
                    e.printStackTrace();
                    }        
        } finally {
                System.out.println("FINAL");
        }
           
        }  
            
        
    }
}
