/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practica_1.Front;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author cheji
 */
public class Graficos extends javax.swing.JFrame {

    /**
     * Creates new form Graficos
     */
    
    private Lectura lectura;
    
    public Graficos() {
        initComponents();
    }

    public void setLectura(Lectura lectura){
        this.lectura = lectura;
    }
    
    /*
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(new Color(154, 10, 156));
        g.drawLine(20, 100, 900, 350);
        
        g.drawString("Linea", 20, 100);
    }*/
    public void repintar(){
        Graphics g = jPanelFiguras.getGraphics();
        jPanelFiguras.paint(g);
    }
    
    public void graficarCirculo(int posx,int posy, int radio, Color color){
        Graphics g = jPanelFiguras.getGraphics();
        g.setColor(color);
        g.fillOval(posx, posy, radio*2, radio*2);
    }
    
    public void graficarCuadrado(int posx,  int posy, int tamlado, Color color){
        Graphics g = jPanelFiguras.getGraphics();
        g.setColor(color);
        g.fillRect(posx, posy, tamlado, tamlado);
    }
    
    public void graficarRectangulo(int posx, int posy, int ancho, int alto, Color color){
        Graphics g = jPanelFiguras.getGraphics();
        g.setColor(color);
        g.fillRect(posx, posy, ancho, alto);
    }
    
    public void graficarLinea(int x1, int y1,  int x2, int y2, Color color){
        Graphics g = jPanelFiguras.getGraphics();
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
    
    public void graficarPoligono(int posx, int posy, int cantlados, int alto, int ancho, Color color){
        int []  ladosX = new int [cantlados];
        int []  ladosY = new int [cantlados];
        
        for(int i = 0; i<cantlados; i++){
            ladosX[i] = posx + (int)(ancho * Math.cos(2 * Math.PI * i / cantlados));
            ladosY[i] = posy + (int)(alto * Math.sin(2 * Math.PI * i / cantlados));
        }
        
        Graphics g = jPanelFiguras.getGraphics();
        g.setColor(color);
        g.drawPolygon(ladosX, ladosY, cantlados);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelFiguras = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelFigurasLayout = new javax.swing.GroupLayout(jPanelFiguras);
        jPanelFiguras.setLayout(jPanelFigurasLayout);
        jPanelFigurasLayout.setHorizontalGroup(
            jPanelFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        jPanelFigurasLayout.setVerticalGroup(
            jPanelFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelFiguras);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(85, 85, 85)
                        .addComponent(jButton1)
                        .addGap(178, 178, 178)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lectura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanelFiguras;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
