//En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de métodos estáticos:
// dibujaCuadrado(): Este método recibe un número entero N, y dibujará un
//cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//
//* * * *
//* *
//* *
//* * * *
//
// elMayorEs(): Este método recibe 3 números enteros y mostrará por consola cual es el
//mayor. En caso de ser iguales lo deberá informar.
// elDiaEs(): Se espera que este método reciba un numero entero entre 1 y 7 que
//corresponderá a un día de la semana, retornando el nombre que le corresponda, por
//ejemplo: 1 Lunes, 2Martes, 3Miércoles, 4Jueves, 5Viernes, 6Sábado, 7
//Domingo. Si recibe un valor distinto retornará “No existe ese día!!!”.
//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//
//Utilizando los métodos estáticos de Utilitario:
//a) Dibujar un cuadrado de 5 elementos.
//b) Mostrar el mayor entre (20,75 y 40)
//c) Mostrar el nombre del día 5.

package com.mycompany.ejer5parte2;


class Utilitario {
    public static void dibujaCuadrado(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void elMayorEs(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Los números son iguales.");
        } else {
            int max = Math.max(a, Math.max(b, c));
            System.out.println("El mayor es: " + max);
        }
    }

    public static String elDiaEs(int numeroDia) {
        switch (numeroDia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "No existe ese día!!!";
        }
    }
}



   
