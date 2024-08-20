/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1.Reportes;

/**
 *
 * @author cheji
 */
public class Movimientos {
    public static int
                cantMovCurva = 0,
                cantMovLinea = 0;
    private String tipo;

    public Movimientos(String tipo) {
        this.tipo = tipo;
        sumarMovimientos(tipo);
    }
    
    private void sumarMovimientos(String tipo){
        switch (tipo) {
            case "Lineal":
                cantMovLinea++;
                break;
            case "Curva":
                cantMovCurva++;
                break;
        }
    }

    public String getTipo() {
        return tipo;
    }
    
    public static int getCant(String tipo){
        if (tipo == "Lineal") {
            return cantMovLinea;
        } else {
            return cantMovCurva;
        }
    }
    
    public static void reiniciarContadores(){
        cantMovLinea = 0;
        cantMovCurva = 0;
    }
}
