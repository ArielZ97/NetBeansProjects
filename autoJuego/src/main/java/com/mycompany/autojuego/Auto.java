/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autojuego;

/**
 *
 * @author Ariel Zurita
 */
public class Auto {
    private int posicionX;
    private int posicionY;
    private boolean chocado;

    // Constructor
    public Auto(int posX, int posY) {
        this.posicionX = posX;
        this.posicionY = posY;
        this.chocado = false;
    }

    // Métodos para mover el auto
    public void moverArriba() {
        if (!chocado && posicionY < 22) {
            posicionY++;
            verificarColision();
        }
    }

    public void moverAbajo() {
        if (!chocado && posicionY > 0) {
            posicionY--;
            verificarColision();
        }
    }

    public void moverIzquierda() {
        if (!chocado && posicionX > 0) {
            posicionX--;
            verificarColision();
        }
    }

    public void moverDerecha() {
        if (!chocado && posicionX < 80) {
            posicionX++;
            verificarColision();
        }
    }

    // Método para verificar colisión
    private void verificarColision() {
        if (posicionX <= 0 || posicionX >= 80 || posicionY <= 0 || posicionY >= 22) {
            chocado = true;
            System.out.println("El auto se ha chocado.");
        }
    }

    // Método para obtener la posición X
    public int getPosicionX() {
        return posicionX;
    }

    // Método para obtener la posición Y
    public int getPosicionY() {
        return posicionY;
    }

    // Método para verificar si el auto está chocado
    public boolean estaChocado() {
        return chocado;
    }

    // Método para reiniciar la posición del auto
    public void reiniciar() {
        posicionX = 0;
        posicionY = 0;
        chocado = false;
    }

    // Método para obtener la representación del auto como String
    @Override
    public String toString() {
        return "Auto en posición (" + posicionX + ", " + posicionY + ")";

  }  
}
