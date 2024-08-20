package com.mycompany.practica_1.Reportes;

public class Operadores {
    private String texto;
    private String tipo;
    private int fila, columna;

    public Operadores(String texto, String tipo, int fila, int columna) {
        this.texto = texto;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }
    
    
    
    public String operacion(){
        return texto;
    }
    
    public int fila(){
        return fila;
    }
    
    public int colum(){
        return columna;
    }
    
    public String tipo(){
        return tipo;
    }
    
}
