/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1.Reportes;

public class Figuras {
    
     private String tipo;
        public static int 
                cantLineas = 0,
                cantCuadrados = 0,
                cantRectangulos = 0,
                cantCirculos = 0,
                cantPoligonos = 0,
                cantMovCurva = 0,
                cantMovLinea = 0;
    
        public Figuras(String tipo) {
        this.tipo = tipo;
            sumarFiguras(tipo);
        }
        
        private void sumarFiguras(String tipo){
            switch (tipo) {
                case "Circulo":
                    cantCirculos++;
                    break;
                case "Cuadrado":
                    cantCuadrados++;
                    break;
                case "Recatangulo":
                    cantRectangulos++;
                    break;
                case "Linea":
                    cantLineas++;
                    break;
                case "Curva":
                    cantMovCurva++;
                    break;
                case "Lineal":
                    cantMovLinea++;
                    break;
                case "Poligono":
                    cantPoligonos++;
                    break;
            }
        }
        
        public static int getCant(String tipo){
            switch (tipo) {
                case "Circulo":
                    return cantCirculos;
                case "Cuadrado":
                    return cantCuadrados;
                case "Recatangulo":
                    return cantRectangulos;
                case "Linea":
                    return cantLineas;
                case "Curva":
                    return cantMovCurva;
                case "Lineal":
                    return cantMovLinea;
                case "Poligono":
                    return cantPoligonos;
                default:
                    return 0;
            }
        }
        
        public String getNombre(){
            return tipo;
        }
        
        public static void limpiarContdores(){
                cantLineas = 0;
                cantCuadrados = 0;
                cantRectangulos = 0;
                cantCirculos = 0;
                cantPoligonos = 0;
                cantMovCurva = 0;
                cantMovLinea = 0;
        }
}
