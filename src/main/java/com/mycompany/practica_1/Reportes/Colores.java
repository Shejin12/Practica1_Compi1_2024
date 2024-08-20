/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1.Reportes;

/**
 *
 * @author cheji
 */
public class Colores {
        private String tipo;
        public static int 
                cantRojos = 0,
                cantAmarillos = 0,
                cantAzules = 0,
                cantVerdes = 0,
                cantNaranjas = 0,
                cantCelestes = 0,
                cantTurquesas = 0,
                cantMorados = 0,
                cantRosados = 0;
    
        public Colores(String tipo) {
        this.tipo = tipo;
            sumar(tipo);
        }
        
        private void sumar(String tipo){
            switch (tipo) {
                case "rojo":
                    cantRojos++;
                    break;
                case "amarillo":
                    cantAmarillos++;
                    break;
                case "azul":
                    cantAzules++;
                    break;
                case "verde":
                    cantVerdes++;
                    break;
                case "naranja":
                    cantNaranjas++;
                    break;
                case "morado":
                    cantMorados++;
                    break;
                case "celeste":
                    cantCelestes++;
                    break;
                case "turquesa":
                    cantTurquesas++;
                    break;
                case "rosado":
                    cantRosados++;
                    break;
            }
        }
        
        public String getColor(){
            return tipo;
        }
        
        public static int getCant(String color){
            switch (color) {
                case "rojo":
                    return cantRojos;
                case "amarillo":
                    return cantAmarillos;
                case "azul":
                    return cantAzules;
                case "verde":
                    return cantVerdes;
                case "naranja":
                    return cantNaranjas;
                case "morado":
                    return cantMorados;
                case "celeste":
                    return cantCelestes;
                case "turquesa":
                    return cantTurquesas;
                case "rosado":
                    return cantRosados;
                default:
                    return 0;
            }
        }
        
        public static void limpiarContadores(){
                cantRojos = 0;
                cantAmarillos = 0;
                cantAzules = 0;
                cantVerdes = 0;
                cantNaranjas = 0;
                cantCelestes = 0;
                cantTurquesas = 0;
                cantMorados = 0;
                cantRosados = 0;
        }
}
