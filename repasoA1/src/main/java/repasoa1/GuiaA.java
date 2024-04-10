
package repasoa1;

import java.util.Scanner;


public class GuiaA {
    
    public static void ejer1(){
        Scanner leer = new Scanner (System.in);
        int num1, num2;
        
        System.out.println("ingrese el primer numero: ");
        num1= leer.nextInt();
        System.out.println("ingrese el segundo numero: ");
        num2= leer.nextInt();
        int total = num1 + num2;
        System.out.println("Resultado: " + total);
        
    }
    
    public static void ejer2(){
        Scanner leer = new Scanner (System.in);
        String nomb;
        
        System.out.println("Ingrese su nombre: ");
        nomb = leer.nextLine();
        System.out.println("Hola como estas " + nomb + "!!");
    }
    
    public static void ejer3(){
        Scanner leer = new Scanner(System.in); 
        System.out.print("Ingresa una frase: ");
        String frase = leer.nextLine();
        
        // Convertir la frase a mayúsculas
        String mayusculas = frase.toUpperCase();
        
        // Convertir la frase a minúsculas
        String minusculas = frase.toLowerCase();
        
        System.out.println("En mayúsculas: " + mayusculas);
        System.out.println("En minúsculas: " + minusculas);
        
        
    } 
        public static double ejer4(double gradosCelsius) {
        double gradosFahrenheit = 32 + (9 * gradosCelsius / 5);
        return gradosFahrenheit;
//        
    }
        
        
        public static void ejer5(){
        double raiz = Math.sqrt(36);
        System.out.println("La raiz cuadrada es: " + raiz + " Decime una mas dificil ");
        
        Scanner leer = new Scanner (System.in);
        int n1;
        
        System.out.println("ingrese un numero: ");
        n1= leer.nextInt();
        int total = n1 *2; 
        System.out.println( "El DOBLE DE ESE NUMERO ES : "+ total);
        System.out.println("ingrese otro numero: ");
        n1= leer.nextInt();
        int totales = n1 *3; 
        System.out.println( "El TRIPLE DE ESE NUMERO ES : "+ totales);
        
        
        } 
        
        
            
        
       
           
      
}
