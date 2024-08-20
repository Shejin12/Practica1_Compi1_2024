/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1.Reportes.PosiblesFormas;

import com.mycompany.practica_1.Front.Graficos;
import com.mycompany.practica_1.Reportes.Formas;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cheji
 */
public class Linea extends Formas{
    private int finx, finy;
    
    public Linea(int posx, int posy, Graficos gr, Color col, int finx, int finy){
        super(posx, posy, gr, col);
        this.finx = finx;
        this.finy = finy;
    }
    
    @Override
    public void graficar(){
        gr.graficarLinea(inicioX, inicioY, finx, finx, col);
    }
    
    public void AnimarLinea(String tipo,int destinoX, int destinoY, int orden){
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
                    finx += sumax;
                    finy += sumay;
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
}
