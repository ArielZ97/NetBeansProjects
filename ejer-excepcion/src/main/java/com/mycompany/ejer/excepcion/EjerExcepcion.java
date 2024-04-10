
package com.mycompany.ejer.excepcion;


public class EjerExcepcion {
//Demuestre como provocar intencionalmente una excepción del tipo
//NullPointerException, luego agregue las sentencias try/catch para mostrar el mensaje de
//error.
//ejercicio_(1)
    public static void main(String[] args) {
//        // Provoquemos una NullPointerException
//        String letra = null;
//        try {
//            // Intentamos acceder a un método de un objeto nulo
//            System.out.println(letra.length());
//            
//        } catch (NullPointerException e) {
//            // Manejamos la excepción e imprimimos el mensaje de error
//            System.out.println("Se produjo una NullPointerException: " + e.getMessage());
//        }
//ejercicio_(2)

//Demuestre como provocar intencionalmente una excepción del tipo
//ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango); luego agregue las
//sentencias try/catch para mostrar lo que devuelve el método fillInStackTrace.

//        int[] array = {1, 2, 3};
//
//        try {
//            // Provocamos una ArrayIndexOutOfBoundsException
//            int valor = array[5];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // Manejamos la excepción e imprimimos la información proporcionada por fillInStackTrace
//            System.out.println("Se produjo una ArrayIndexOutOfBoundsException.");
//            System.out.println("Información adicional: " + e.fillInStackTrace());
//        }

    }
    
}
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