/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1.Reportes;

/**
 *
 * @author cheji
 */
public class Errores {
    private String texto;
    private int fila, columna;

    public Errores(String texto, int fila, int columna) {
        this.texto = texto;
        this.fila = fila;
        this.columna = columna;
    }
    
    public String getError(){
        return texto;
    }

    public int getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }
    
    
    
    
}
