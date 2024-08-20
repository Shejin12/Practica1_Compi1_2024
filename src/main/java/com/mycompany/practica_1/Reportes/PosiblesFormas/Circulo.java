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
public class Circulo extends Formas{
    private int radio;
    
    
    public Circulo(int inicioX, int inicioY, Graficos gr, int radio, Color col) {
        super(inicioX, inicioY, gr, col);
        this.radio = radio;
    }
    
    @Override
    public void graficar(){
        gr.graficarCirculo(inicioX, inicioY, radio, col);
    }
    
    
    
    
    
}
