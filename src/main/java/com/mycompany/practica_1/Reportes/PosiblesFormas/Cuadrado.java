/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1.Reportes.PosiblesFormas;

import com.mycompany.practica_1.Front.Graficos;
import com.mycompany.practica_1.Reportes.Formas;
import java.awt.Color;

public class Cuadrado extends Formas{

    private int lado;
    
    public Cuadrado(int inicioX, int inicioY, Graficos gr, Color color, int lado) {
        super(inicioX, inicioY, gr, color);
        this.lado = lado;
    }
    
    @Override
    public void graficar(){
        gr.graficarCuadrado(inicioX, inicioY, lado, col);
    }
    
}
