/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1.Reportes.PosiblesFormas;

import com.mycompany.practica_1.Front.Graficos;
import com.mycompany.practica_1.Reportes.Formas;
import java.awt.Color;

/**
 *
 * @author cheji
 */
public class Rectangulo extends Formas{
    
    private int ancho, alto;
    
    public Rectangulo(int posx, int posy, Graficos gr, Color col, int alto, int ancho){
        super(posx, posy, gr, col);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public void graficar(){
        gr.graficarRectangulo(inicioX, inicioY, ancho, alto, col);
    }
    
}
