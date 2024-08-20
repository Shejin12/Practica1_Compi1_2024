/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_1;

import com.mycompany.practica_1.Front.Graficos;
import com.mycompany.practica_1.Front.Lectura;

/**
 *
 * @author cheji
 */
public class Practica_1 {

    private static Lectura lectura;
    private static Graficos graficos = new Graficos();
    public static void main(String[] args) {
        
        lectura = new Lectura(graficos);
        lectura.setLocationRelativeTo(null);
        lectura.setVisible(true);
        graficos.setLocationRelativeTo(null);
    }
}
