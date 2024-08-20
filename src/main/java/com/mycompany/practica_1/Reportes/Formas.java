/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1.Reportes;

import com.mycompany.practica_1.Front.Graficos;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cheji
 */
public class Formas {
    protected int inicioX, inicioY, destinoX, destinoY, orden;
    protected Graficos gr;
    protected Color col;
    
    public Formas(int inicioX, int inicioY, Graficos gr, Color col) {
        this.inicioX = inicioX;
        this.inicioY = inicioY;
        this.gr = gr;
        this.col = col;
    }
    
    public void Animar(String tipo,int destinoX, int destinoY, int orden){
        this.destinoX = destinoX;
        this.destinoY = destinoY;
        this.orden = orden;
        tipo = tipo.toLowerCase();
        
        switch (tipo) {
            case "linea":
                int sumax = (destinoX - inicioX) / 5;
                int sumay = (destinoY - inicioY) / 5;
                
                for (int i = 0; i < 5; i++) {
                try {
                    gr.repintar();
                    inicioX += sumax;
                    inicioY += sumay;
                    graficar();
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Formas.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    
    
    
    public void graficar(){
        
    }
    
}
