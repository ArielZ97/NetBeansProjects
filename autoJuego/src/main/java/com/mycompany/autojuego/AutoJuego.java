/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.autojuego;

/**
 *
 * @author Ariel Zurita
 */
public class AutoJuego {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Auto miAuto = new Auto(0, 0);

        System.out.println(miAuto);

        miAuto.moverDerecha();
        miAuto.moverArriba();
        miAuto.moverDerecha();
        miAuto.moverDerecha();
        miAuto.moverArriba();
        miAuto.moverArriba();
        miAuto.moverArriba();
        miAuto.moverIzquierda();
        miAuto.moverArriba();
        miAuto.moverArriba();

        System.out.println(miAuto);
    }
    
}
