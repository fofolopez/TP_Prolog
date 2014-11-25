/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.util.Hashtable;
import jpl.Query;

/**
 *
 * @author adolfo
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public UI() {
        initComponents();
        limpiarSeleccion();
        inicializarPreguntas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoP1 = new javax.swing.ButtonGroup();
        grupoP2 = new javax.swing.ButtonGroup();
        grupoP3 = new javax.swing.ButtonGroup();
        grupoP4 = new javax.swing.ButtonGroup();
        grupoP5 = new javax.swing.ButtonGroup();
        grupoP6 = new javax.swing.ButtonGroup();
        grupoP7 = new javax.swing.ButtonGroup();
        grupoP8 = new javax.swing.ButtonGroup();
        grupoP9 = new javax.swing.ButtonGroup();
        grupoP10 = new javax.swing.ButtonGroup();
        grupoP11 = new javax.swing.ButtonGroup();
        grupoP12 = new javax.swing.ButtonGroup();
        dialogoAyuda = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        panelPreguntas = new javax.swing.JPanel();
        etP1 = new javax.swing.JLabel();
        opcionP1Si = new javax.swing.JRadioButton();
        opcionP1No = new javax.swing.JRadioButton();
        opcionP1NA = new javax.swing.JRadioButton();
        etP2 = new javax.swing.JLabel();
        opcionP2Si = new javax.swing.JRadioButton();
        opcionP2No = new javax.swing.JRadioButton();
        opcionP2NA = new javax.swing.JRadioButton();
        etP3 = new javax.swing.JLabel();
        opcionP3Si = new javax.swing.JRadioButton();
        opcionP3No = new javax.swing.JRadioButton();
        opcionP3NA = new javax.swing.JRadioButton();
        etP4 = new javax.swing.JLabel();
        opcionP4Si = new javax.swing.JRadioButton();
        opcionP4No = new javax.swing.JRadioButton();
        opcionP4NA = new javax.swing.JRadioButton();
        etP5 = new javax.swing.JLabel();
        opcionP5Si = new javax.swing.JRadioButton();
        opcionP5No = new javax.swing.JRadioButton();
        opcionP5NA = new javax.swing.JRadioButton();
        etP6 = new javax.swing.JLabel();
        opcionP6Si = new javax.swing.JRadioButton();
        opcionP6No = new javax.swing.JRadioButton();
        opcionP6NA = new javax.swing.JRadioButton();
        etP7 = new javax.swing.JLabel();
        opcionP7Si = new javax.swing.JRadioButton();
        opcionP7No = new javax.swing.JRadioButton();
        opcionP7NA = new javax.swing.JRadioButton();
        etP8 = new javax.swing.JLabel();
        opcionP8Si = new javax.swing.JRadioButton();
        opcionP8No = new javax.swing.JRadioButton();
        opcionP8NA = new javax.swing.JRadioButton();
        etP9 = new javax.swing.JLabel();
        opcionP9Si = new javax.swing.JRadioButton();
        opcionP9No = new javax.swing.JRadioButton();
        opcionP9NA = new javax.swing.JRadioButton();
        etP10 = new javax.swing.JLabel();
        opcionP10Si = new javax.swing.JRadioButton();
        opcionP10No = new javax.swing.JRadioButton();
        opcionP10NA = new javax.swing.JRadioButton();
        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonLimpiarOpciones = new javax.swing.JButton();
        botonRespuesta = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();

        dialogoAyuda.setTitle("Ayuda");
        dialogoAyuda.setMinimumSize(new java.awt.Dimension(350, 160));
        dialogoAyuda.setPreferredSize(new java.awt.Dimension(350, 160));
        dialogoAyuda.setResizable(false);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jTextArea1.setText("1. Seleccione las opciones de acuerdo a la aplicación \nweb que desea realizar.\n2. Presione el botón \"Siguiente\" para verificar las \nherramientas recomendadas para utilizar.");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextArea1.setEnabled(false);
        jTextArea1.setMinimumSize(new java.awt.Dimension(305, 89));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ayuda");

        javax.swing.GroupLayout dialogoAyudaLayout = new javax.swing.GroupLayout(dialogoAyuda.getContentPane());
        dialogoAyuda.getContentPane().setLayout(dialogoAyudaLayout);
        dialogoAyudaLayout.setHorizontalGroup(
            dialogoAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAyudaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogoAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap())
        );
        dialogoAyudaLayout.setVerticalGroup(
            dialogoAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAyudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        dialogoAyuda.getAccessibleContext().setAccessibleParent(panelPreguntas);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aplicaciones Web");
        setResizable(false);

        etP1.setText("jLabel1");

        grupoP1.add(opcionP1Si);
        opcionP1Si.setText("Si");

        grupoP1.add(opcionP1No);
        opcionP1No.setText("No");

        grupoP1.add(opcionP1NA);
        opcionP1NA.setText("Sin relevancia");

        etP2.setText("jLabel1");

        grupoP2.add(opcionP2Si);
        opcionP2Si.setText("Si");

        grupoP2.add(opcionP2No);
        opcionP2No.setText("No");

        grupoP2.add(opcionP2NA);
        opcionP2NA.setText("Sin relevancia");

        etP3.setText("jLabel1");

        grupoP3.add(opcionP3Si);
        opcionP3Si.setText("Si");

        grupoP3.add(opcionP3No);
        opcionP3No.setText("No");

        grupoP3.add(opcionP3NA);
        opcionP3NA.setText("Sin relevancia");

        etP4.setText("jLabel1");

        grupoP4.add(opcionP4Si);
        opcionP4Si.setText("Si");

        grupoP4.add(opcionP4No);
        opcionP4No.setText("No");

        grupoP4.add(opcionP4NA);
        opcionP4NA.setText("Sin relevancia");

        etP5.setText("jLabel1");

        grupoP5.add(opcionP5Si);
        opcionP5Si.setText("Si");

        grupoP5.add(opcionP5No);
        opcionP5No.setText("No");

        grupoP5.add(opcionP5NA);
        opcionP5NA.setText("Sin relevancia");

        etP6.setText("jLabel1");

        grupoP6.add(opcionP6Si);
        opcionP6Si.setText("Si");

        grupoP6.add(opcionP6No);
        opcionP6No.setText("No");

        grupoP6.add(opcionP6NA);
        opcionP6NA.setText("Sin relevancia");

        etP7.setText("jLabel1");

        grupoP7.add(opcionP7Si);
        opcionP7Si.setText("Si");

        grupoP7.add(opcionP7No);
        opcionP7No.setText("No");

        grupoP7.add(opcionP7NA);
        opcionP7NA.setText("Sin relevancia");

        etP8.setText("jLabel1");

        grupoP8.add(opcionP8Si);
        opcionP8Si.setText("Si");

        grupoP8.add(opcionP8No);
        opcionP8No.setText("No");

        grupoP8.add(opcionP8NA);
        opcionP8NA.setText("Sin relevancia");

        etP9.setText("jLabel1");

        grupoP9.add(opcionP9Si);
        opcionP9Si.setText("Si");

        grupoP9.add(opcionP9No);
        opcionP9No.setText("No");

        grupoP9.add(opcionP9NA);
        opcionP9NA.setText("Sin relevancia");

        etP10.setText("jLabel1");

        grupoP10.add(opcionP10Si);
        opcionP10Si.setText("Si");

        grupoP10.add(opcionP10No);
        opcionP10No.setText("No");

        grupoP10.add(opcionP10NA);
        opcionP10NA.setText("Sin relevancia");

        javax.swing.GroupLayout panelPreguntasLayout = new javax.swing.GroupLayout(panelPreguntas);
        panelPreguntas.setLayout(panelPreguntasLayout);
        panelPreguntasLayout.setHorizontalGroup(
            panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP1Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP1No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP1NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP2, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP2Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP2No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP2NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP3, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP3Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP3No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP3NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP4, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP4Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP4No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP4NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP5, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP5Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP5No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP5NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP6, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP6Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP6No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP6NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP7, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP7Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP7No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP7NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP8, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP8Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP8No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP8NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP9, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP9Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP9No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP9NA))
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(etP10, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP10Si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP10No)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionP10NA))
        );
        panelPreguntasLayout.setVerticalGroup(
            panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP1)
                    .addComponent(opcionP1Si)
                    .addComponent(opcionP1No)
                    .addComponent(opcionP1NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP2)
                    .addComponent(opcionP2Si)
                    .addComponent(opcionP2No)
                    .addComponent(opcionP2NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP3)
                    .addComponent(opcionP3Si)
                    .addComponent(opcionP3No)
                    .addComponent(opcionP3NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP4)
                    .addComponent(opcionP4Si)
                    .addComponent(opcionP4No)
                    .addComponent(opcionP4NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP5)
                    .addComponent(opcionP5Si)
                    .addComponent(opcionP5No)
                    .addComponent(opcionP5NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP6)
                    .addComponent(opcionP6Si)
                    .addComponent(opcionP6No)
                    .addComponent(opcionP6NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP7)
                    .addComponent(opcionP7Si)
                    .addComponent(opcionP7No)
                    .addComponent(opcionP7NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP8)
                    .addComponent(opcionP8Si)
                    .addComponent(opcionP8No)
                    .addComponent(opcionP8NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP9)
                    .addComponent(opcionP9Si)
                    .addComponent(opcionP9No)
                    .addComponent(opcionP9NA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etP10)
                    .addComponent(opcionP10Si)
                    .addComponent(opcionP10No)
                    .addComponent(opcionP10NA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplicaciones Web");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        botonLimpiarOpciones.setText("Reiniciar");
        botonLimpiarOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarOpcionesActionPerformed(evt);
            }
        });

        botonRespuesta.setText("Siguiente");
        botonRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRespuestaActionPerformed(evt);
            }
        });

        botonAyuda.setText("Ayuda");
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonLimpiarOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAyuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRespuesta))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiarOpciones)
                    .addComponent(botonRespuesta)
                    .addComponent(botonAyuda)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPreguntas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void inicializarPreguntas(){
        String pregunta1 =  "1.¿Pretende desarrollar una aplicación muy grande?";
        String pregunta2 =  "2.¿Su aplicación requiere altos estándares de seguridad?";
        String pregunta3 =  "3.¿Prefiere trabajar con herramientas de pago?";
        String pregunta4 =  "4.¿Los datos que utilizará su aplicación son muy estructurados?";
        String pregunta5 =  "5.¿Su equipo de trabajo tiene mucha experiencia?";
        String pregunta6 =  "6.¿Le gustaría utilizar tecnologías emergentes?";
        String pregunta7 =  "7.¿Es importante que la configuración de las herramientas sea muy fácil?";
        String pregunta8 =  "8.¿Necesita trabajar en un ambiente multiplataforma?";
        String pregunta9 =  "9.¿La aplicación debe atender a un gran volumen de usuarios?";
        String pregunta10 = "10.¿Es la eficiencia su principal requerimiento?";
        String pregunta11 = "11.¿Esta bien?";
        String pregunta12 = "12.¿Esta bien?";
 
        etP1.setText(pregunta1);
        etP2.setText(pregunta2);
        etP3.setText(pregunta3);
        etP4.setText(pregunta4);
        etP5.setText(pregunta5);
        etP6.setText(pregunta6);
        etP7.setText(pregunta7);
        etP8.setText(pregunta8);
        etP9.setText(pregunta9);
        etP10.setText(pregunta10);

    }
    
    /* pone todas las opciona a "No importa"*/
    private void limpiarSeleccion(){
        opcionP1NA.setSelected(true);
        opcionP2NA.setSelected(true);
        opcionP3NA.setSelected(true);
        opcionP4NA.setSelected(true);
        opcionP5NA.setSelected(true);
        opcionP6NA.setSelected(true);
        opcionP7NA.setSelected(true);
        opcionP8NA.setSelected(true);
        opcionP9NA.setSelected(true);
        opcionP10NA.setSelected(true);
    }
    
    private void botonLimpiarOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarOpcionesActionPerformed
        limpiarSeleccion();
    }//GEN-LAST:event_botonLimpiarOpcionesActionPerformed

    private void botonRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRespuestaActionPerformed

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String t1 = "consult('src/prolog/lenguajes.pl')";
                Query q1 = new Query(t1);
                System.out.println(t1 + " " + (q1.hasSolution() ? "correcto" : "fallo"));
                String consulta = generarConsulta();
                Query q2 = new Query(consulta);
                System.out.println("La solución para " + consulta +" :");
                Hashtable s;
                String resultado = "";
                while(q2.hasMoreSolutions()){
                    s = q2.nextSolution();
                    resultado += "Lenguaje de programación: " + s.get("LENGUAJE")+"\n";
                    resultado += "Framework: " + s.get("FRAMEWORK")+"\n";
                    resultado += "Entorno de desarrollo (IDE): " + s.get("IDE")+"\n";
                    resultado += "Base de datos: " + s.get("BD")+"\n\n";
                    System.out.println(resultado);
                }
                VentanaResultados vr = new VentanaResultados();
                vr.setResultados(resultado);
                vr.setVisible(true);
            }
        });  
    }//GEN-LAST:event_botonRespuestaActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        dialogoAyuda.setVisible(true);
    }//GEN-LAST:event_botonAyudaActionPerformed
    
    private String generarConsulta(){
        String consulta = "";
        String tamaño, aprendizaje, comp_inst, seguridad, eficiencia, escalabilidad, licencia, mantenibilidad, tipo_bd;
        tamaño = obtenerTamaño();
        aprendizaje = obtenerAprendizaje();
        comp_inst = obtenerCompInst();
        seguridad = obtenerSeguridad();
        eficiencia = obtenerEficiencia();
        escalabilidad = obtenerEscalabilidad();
        licencia = obtenerLicencia();
        mantenibilidad = obtenerMantenibilidad();
        tipo_bd = obtenerTipoBD();

        consulta = "herramientas(LENGUAJE,"+tamaño+",FRAMEWORK,"+aprendizaje+","
                +comp_inst+",IDE,"+seguridad+","+eficiencia+","+escalabilidad+","
                +licencia+","+mantenibilidad+",BD,"+tipo_bd+")";
        return consulta;
    }
    
    private String obtenerTamaño(){
        String respuesta = "_"; 
        if(opcionP1Si.isSelected()){
            respuesta = "grande";
        }else if(opcionP1No.isSelected()){
            respuesta = "regular";
        }
        return respuesta;
    }
    
    private String obtenerAprendizaje(){
        String respuesta = "_"; 
        if(opcionP5Si.isSelected()){
            respuesta = "apr_normal";
        }else if(opcionP5No.isSelected()){
            respuesta = "apr_facil";
        }
        return respuesta;
    }
    
    private String obtenerCompInst() {
        String respuesta = "_"; 
        if(opcionP7Si.isSelected()){
            respuesta = "cmp_normal";
        }else if(opcionP7No.isSelected()){
            respuesta = "cmp_dificil";
        }
        return respuesta;    
    }

    private String obtenerSeguridad() {
        String respuesta = "_"; 
        if(opcionP2Si.isSelected()){
            respuesta = "seguro";
        }else if(opcionP2No.isSelected()){
            respuesta = "no_seguro";
        }
        return respuesta; 
    }

    private String obtenerEficiencia() {
        String respuesta = "_";  
        if(opcionP10Si.isSelected()){
            respuesta = "eficiente";
        }else if(opcionP10No.isSelected()){
            respuesta = "no_eficiente";
        }
        return respuesta; 
    }

    private String obtenerEscalabilidad() {
        String respuesta = "_"; 
        if(opcionP7Si.isSelected()){
            respuesta = "escalable";
        }else if(opcionP7No.isSelected()){
            respuesta = "no_escalable";
        }
        return respuesta; 
    }

    private String obtenerLicencia() {
        String respuesta = "_"; 
        if(opcionP3Si.isSelected()){
            respuesta = "pago";
        }else if(opcionP3No.isSelected()){
            respuesta = "gratis";
        }
        return respuesta; 
    }

    private String obtenerMantenibilidad() {
        String respuesta = "_"; 
        
        return respuesta; 
    }

    private String obtenerTipoBD(){
        String respuesta = "_"; 
        if(opcionP4Si.isSelected()){
            respuesta = "sql";
        }else if(opcionP4No.isSelected()){
            respuesta = "no_sql";
        }
        return respuesta; 
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonLimpiarOpciones;
    private javax.swing.JButton botonRespuesta;
    private javax.swing.JDialog dialogoAyuda;
    private javax.swing.JLabel etP1;
    private javax.swing.JLabel etP10;
    private javax.swing.JLabel etP2;
    private javax.swing.JLabel etP3;
    private javax.swing.JLabel etP4;
    private javax.swing.JLabel etP5;
    private javax.swing.JLabel etP6;
    private javax.swing.JLabel etP7;
    private javax.swing.JLabel etP8;
    private javax.swing.JLabel etP9;
    private javax.swing.ButtonGroup grupoP1;
    private javax.swing.ButtonGroup grupoP10;
    private javax.swing.ButtonGroup grupoP11;
    private javax.swing.ButtonGroup grupoP12;
    private javax.swing.ButtonGroup grupoP2;
    private javax.swing.ButtonGroup grupoP3;
    private javax.swing.ButtonGroup grupoP4;
    private javax.swing.ButtonGroup grupoP5;
    private javax.swing.ButtonGroup grupoP6;
    private javax.swing.ButtonGroup grupoP7;
    private javax.swing.ButtonGroup grupoP8;
    private javax.swing.ButtonGroup grupoP9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton opcionP10NA;
    private javax.swing.JRadioButton opcionP10No;
    private javax.swing.JRadioButton opcionP10Si;
    private javax.swing.JRadioButton opcionP1NA;
    private javax.swing.JRadioButton opcionP1No;
    private javax.swing.JRadioButton opcionP1Si;
    private javax.swing.JRadioButton opcionP2NA;
    private javax.swing.JRadioButton opcionP2No;
    private javax.swing.JRadioButton opcionP2Si;
    private javax.swing.JRadioButton opcionP3NA;
    private javax.swing.JRadioButton opcionP3No;
    private javax.swing.JRadioButton opcionP3Si;
    private javax.swing.JRadioButton opcionP4NA;
    private javax.swing.JRadioButton opcionP4No;
    private javax.swing.JRadioButton opcionP4Si;
    private javax.swing.JRadioButton opcionP5NA;
    private javax.swing.JRadioButton opcionP5No;
    private javax.swing.JRadioButton opcionP5Si;
    private javax.swing.JRadioButton opcionP6NA;
    private javax.swing.JRadioButton opcionP6No;
    private javax.swing.JRadioButton opcionP6Si;
    private javax.swing.JRadioButton opcionP7NA;
    private javax.swing.JRadioButton opcionP7No;
    private javax.swing.JRadioButton opcionP7Si;
    private javax.swing.JRadioButton opcionP8NA;
    private javax.swing.JRadioButton opcionP8No;
    private javax.swing.JRadioButton opcionP8Si;
    private javax.swing.JRadioButton opcionP9NA;
    private javax.swing.JRadioButton opcionP9No;
    private javax.swing.JRadioButton opcionP9Si;
    private javax.swing.JPanel panelPreguntas;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables

    
}
