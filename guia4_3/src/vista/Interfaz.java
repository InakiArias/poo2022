/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Infusion;
import modelo.Ingrediente;
import modelo.MaquinaExpendedora;
import modelo.MaquinaExpendedoraTipo1;
import modelo.MaquinaExpendedoraTipo2;
import modelo.MaquinaExpendedoraTipo3;

/**
 *
 * @author Usuario
 */
public class Interfaz extends javax.swing.JFrame {

    private final MaquinaExpendedora m1 = new MaquinaExpendedoraTipo1("m1");
    private final MaquinaExpendedora m2 = new MaquinaExpendedoraTipo2("m2");
    private final MaquinaExpendedora m3 = new MaquinaExpendedoraTipo3("m3");

    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTipo1 = new javax.swing.JPanel();
        panelRecarga1 = new javax.swing.JPanel();
        botonRecargaCacao1 = new javax.swing.JButton();
        campoRecargaCacao1 = new javax.swing.JTextField();
        botonRecargaCafe1 = new javax.swing.JButton();
        campoRecargaCafe1 = new javax.swing.JTextField();
        botonRecargaLeche1 = new javax.swing.JButton();
        campoRecargaLeche1 = new javax.swing.JTextField();
        botonRecargaTe1 = new javax.swing.JButton();
        campoRecargaTe1 = new javax.swing.JTextField();
        panelEstado1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textEstado1 = new javax.swing.JTextArea();
        panelEntrega1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonCafe1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonCafecl1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botonChocolate1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botonTe1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        botonTecl1 = new javax.swing.JButton();
        panelTipo2 = new javax.swing.JPanel();
        panelRecarga2 = new javax.swing.JPanel();
        botonRecargaCacao2 = new javax.swing.JButton();
        campoRecargaCacao2 = new javax.swing.JTextField();
        botonRecargaCafe2 = new javax.swing.JButton();
        campoRecargaCafe2 = new javax.swing.JTextField();
        botonRecargaCrema2 = new javax.swing.JButton();
        campoRecargaCrema2 = new javax.swing.JTextField();
        botonRecargaTe2 = new javax.swing.JButton();
        campoRecargaTe2 = new javax.swing.JTextField();
        panelEstado2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textEstado2 = new javax.swing.JTextArea();
        panelEntrega2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        botonCafe2 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        botonCapuchino2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        botonTe2 = new javax.swing.JButton();
        panelTipo3 = new javax.swing.JPanel();
        panelRecarga3 = new javax.swing.JPanel();
        botonRecargaYerba3 = new javax.swing.JButton();
        campoRecargaYerba3 = new javax.swing.JTextField();
        panelEstado3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textEstado3 = new javax.swing.JTextArea();
        panelEntrega3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        botonMate3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquinas Expendedoras");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(772, 474));
        setMinimumSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new java.awt.GridLayout(1, 3, 10, 200));

        panelTipo1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Expendedora Tipo 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 20))); // NOI18N
        panelTipo1.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        panelRecarga1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Recarga de Depósitos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N

        botonRecargaCacao1.setText("Cacao");
        botonRecargaCacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaCacao1ActionPerformed(evt);
            }
        });

        botonRecargaCafe1.setText("Café");
        botonRecargaCafe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaCafe1ActionPerformed(evt);
            }
        });

        botonRecargaLeche1.setText("Leche");
        botonRecargaLeche1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaLeche1ActionPerformed(evt);
            }
        });

        botonRecargaTe1.setText("Té");
        botonRecargaTe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaTe1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRecarga1Layout = new javax.swing.GroupLayout(panelRecarga1);
        panelRecarga1.setLayout(panelRecarga1Layout);
        panelRecarga1Layout.setHorizontalGroup(
            panelRecarga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecarga1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRecarga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRecargaCafe1)
                    .addComponent(botonRecargaCacao1)
                    .addComponent(botonRecargaTe1)
                    .addComponent(botonRecargaLeche1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRecarga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoRecargaCafe1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRecargaCacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRecargaTe1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRecargaLeche1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelRecarga1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoRecargaCacao1, campoRecargaCafe1, campoRecargaLeche1, campoRecargaTe1});

        panelRecarga1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonRecargaCacao1, botonRecargaCafe1, botonRecargaLeche1, botonRecargaTe1});

        panelRecarga1Layout.setVerticalGroup(
            panelRecarga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecarga1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRecarga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaCacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaCacao1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRecarga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaCafe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaCafe1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRecarga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaLeche1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaLeche1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRecarga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaTe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaTe1))
                .addGap(16, 16, 16))
        );

        panelTipo1.add(panelRecarga1);

        panelEstado1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estado de los Depósitos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N
        panelEstado1.setLayout(new java.awt.BorderLayout());

        textEstado1.setEditable(false);
        textEstado1.setColumns(20);
        textEstado1.setRows(5);
        jScrollPane1.setViewportView(textEstado1);

        panelEstado1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelTipo1.add(panelEstado1);

        panelEntrega1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Entregar Bebida", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N
        panelEntrega1.setLayout(new java.awt.GridLayout(0, 2));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        botonCafe1.setText("Café");
        botonCafe1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCafe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCafe1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonCafe1, new java.awt.GridBagConstraints());

        panelEntrega1.add(jPanel1);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        botonCafecl1.setText("Café con leche");
        botonCafecl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCafecl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCafecl1ActionPerformed(evt);
            }
        });
        jPanel2.add(botonCafecl1, new java.awt.GridBagConstraints());

        panelEntrega1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        botonChocolate1.setText("Chocolate");
        botonChocolate1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonChocolate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonChocolate1ActionPerformed(evt);
            }
        });
        jPanel3.add(botonChocolate1, new java.awt.GridBagConstraints());

        panelEntrega1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        botonTe1.setText("Té");
        botonTe1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTe1ActionPerformed(evt);
            }
        });
        jPanel4.add(botonTe1, new java.awt.GridBagConstraints());

        panelEntrega1.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        botonTecl1.setText("Té con leche");
        botonTecl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTecl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTecl1ActionPerformed(evt);
            }
        });
        jPanel5.add(botonTecl1, new java.awt.GridBagConstraints());

        panelEntrega1.add(jPanel5);

        panelTipo1.add(panelEntrega1);

        getContentPane().add(panelTipo1);

        panelTipo2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Expendedora Tipo 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 20))); // NOI18N
        panelTipo2.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        panelRecarga2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Recarga de Depósitos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N

        botonRecargaCacao2.setText("Cacao");
        botonRecargaCacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaCacao2ActionPerformed(evt);
            }
        });

        botonRecargaCafe2.setText("Café");
        botonRecargaCafe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaCafe2ActionPerformed(evt);
            }
        });

        botonRecargaCrema2.setText("Crema");
        botonRecargaCrema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaCrema2ActionPerformed(evt);
            }
        });

        botonRecargaTe2.setText("Té");
        botonRecargaTe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaTe2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRecarga2Layout = new javax.swing.GroupLayout(panelRecarga2);
        panelRecarga2.setLayout(panelRecarga2Layout);
        panelRecarga2Layout.setHorizontalGroup(
            panelRecarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecarga2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRecarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRecargaCafe2)
                    .addComponent(botonRecargaCacao2)
                    .addComponent(botonRecargaTe2)
                    .addComponent(botonRecargaCrema2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRecarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoRecargaCafe2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRecargaCacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRecargaTe2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRecargaCrema2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelRecarga2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonRecargaCacao2, botonRecargaCafe2, botonRecargaCrema2, botonRecargaTe2});

        panelRecarga2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoRecargaCacao2, campoRecargaCafe2, campoRecargaCrema2, campoRecargaTe2});

        panelRecarga2Layout.setVerticalGroup(
            panelRecarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecarga2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRecarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaCacao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaCacao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRecarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaCafe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaCafe2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRecarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaCrema2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaCrema2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRecarga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaTe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaTe2))
                .addGap(16, 16, 16))
        );

        panelTipo2.add(panelRecarga2);

        panelEstado2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estado de los Depósitos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N
        panelEstado2.setLayout(new java.awt.BorderLayout());

        textEstado2.setEditable(false);
        textEstado2.setColumns(20);
        textEstado2.setRows(5);
        jScrollPane2.setViewportView(textEstado2);

        panelEstado2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelTipo2.add(panelEstado2);

        panelEntrega2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Entregar Bebida", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N
        panelEntrega2.setLayout(new java.awt.GridLayout(3, 2));

        jPanel7.setLayout(new java.awt.GridBagLayout());

        botonCafe2.setText("Café");
        botonCafe2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCafe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCafe2ActionPerformed(evt);
            }
        });
        jPanel7.add(botonCafe2, new java.awt.GridBagConstraints());

        panelEntrega2.add(jPanel7);

        jPanel12.setLayout(new java.awt.GridBagLayout());

        botonCapuchino2.setText("Capuchino");
        botonCapuchino2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCapuchino2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCapuchino2ActionPerformed(evt);
            }
        });
        jPanel12.add(botonCapuchino2, new java.awt.GridBagConstraints());

        panelEntrega2.add(jPanel12);

        jPanel10.setLayout(new java.awt.GridBagLayout());

        botonTe2.setText("Té");
        botonTe2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTe2ActionPerformed(evt);
            }
        });
        jPanel10.add(botonTe2, new java.awt.GridBagConstraints());

        panelEntrega2.add(jPanel10);

        panelTipo2.add(panelEntrega2);

        getContentPane().add(panelTipo2);

        panelTipo3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Expendedora Tipo 3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 20))); // NOI18N
        panelTipo3.setMaximumSize(new java.awt.Dimension(339, 474));
        panelTipo3.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        panelRecarga3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Recarga de Depósitos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N

        botonRecargaYerba3.setText("Yerba");
        botonRecargaYerba3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargaYerba3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRecarga3Layout = new javax.swing.GroupLayout(panelRecarga3);
        panelRecarga3.setLayout(panelRecarga3Layout);
        panelRecarga3Layout.setHorizontalGroup(
            panelRecarga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecarga3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonRecargaYerba3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoRecargaYerba3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRecarga3Layout.setVerticalGroup(
            panelRecarga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecarga3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRecarga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRecargaYerba3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecargaYerba3))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        panelTipo3.add(panelRecarga3);

        panelEstado3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estado de los Depósitos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N
        panelEstado3.setLayout(new java.awt.BorderLayout());

        textEstado3.setEditable(false);
        textEstado3.setColumns(20);
        textEstado3.setRows(5);
        jScrollPane3.setViewportView(textEstado3);

        panelEstado3.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        panelTipo3.add(panelEstado3);

        panelEntrega3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Entregar Bebida", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 204))); // NOI18N
        panelEntrega3.setLayout(new java.awt.GridLayout(3, 2));

        jPanel6.setLayout(new java.awt.GridBagLayout());

        botonMate3.setText("Mate cocido");
        botonMate3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMate3ActionPerformed(evt);
            }
        });
        jPanel6.add(botonMate3, new java.awt.GridBagConstraints());

        panelEntrega3.add(jPanel6);

        panelTipo3.add(panelEntrega3);

        getContentPane().add(panelTipo3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarEstados() {
        this.textEstado1.setText(m1.detalleDepositos());
        this.textEstado2.setText(m2.detalleDepositos());
        this.textEstado3.setText(m3.detalleDepositos());
    }

    private void mensajeEntrega(Infusion infusion) {
        if (infusion == null) {
            JOptionPane.showMessageDialog(this, "No se pudo preparar la infusión por falta de ingredientes.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "Que disfrutes de tu " + infusion.getNombre() + "!", "COMPLETADO", JOptionPane.INFORMATION_MESSAGE);
            this.refrescarEstados();
        }
    }

    private void botonCafe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCafe1ActionPerformed
        Infusion infusion = this.m1.prepararInfusion("Café");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonCafe1ActionPerformed

    private void botonCafecl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCafecl1ActionPerformed
        Infusion infusion = this.m1.prepararInfusion("Café con leche");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonCafecl1ActionPerformed

    private void botonChocolate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonChocolate1ActionPerformed
        Infusion infusion = this.m1.prepararInfusion("Chocolate");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonChocolate1ActionPerformed

    private void botonTe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTe1ActionPerformed
        Infusion infusion = this.m1.prepararInfusion("Té");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonTe1ActionPerformed

    private void botonTecl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTecl1ActionPerformed
        Infusion infusion = this.m1.prepararInfusion("Té con leche");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonTecl1ActionPerformed

    private void procesaCarga(MaquinaExpendedora m, Ingrediente ingrediente, double cant) {
        if (cant == 0) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar el ingrediente por campo inválido.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (m.depositoLleno(ingrediente.getNombre())) {
            JOptionPane.showMessageDialog(this, "El depósito está lleno", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            double exceso = m.cargar(ingrediente, cant);
            String mensaje = "Se cargó el depósito con éxito";

            if (exceso > 0) {
                mensaje += "\nSobraron " + (int) exceso + " gramos";
            }

            JOptionPane.showMessageDialog(this, mensaje, "COMPLETADO", JOptionPane.INFORMATION_MESSAGE);
            this.refrescarEstados();
        }

    }

    private double validaCant(String cant) {
        double cantd;

        try {
            cantd = Double.parseDouble(cant);
        }
        catch (Exception e) {
            cantd = 0;
        }

        if (cantd >= 1) {
            return cantd;
        }
        else {
            return 0;
        }
    }

    private void botonRecargaCacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaCacao1ActionPerformed
        double cant = validaCant(this.campoRecargaCacao1.getText());
        procesaCarga(m1, new Ingrediente("Cacao"), cant);
    }//GEN-LAST:event_botonRecargaCacao1ActionPerformed

    private void botonRecargaCafe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaCafe1ActionPerformed
        double cant = validaCant(this.campoRecargaCafe1.getText());
        procesaCarga(m1, new Ingrediente("Café"), cant);
    }//GEN-LAST:event_botonRecargaCafe1ActionPerformed

    private void botonRecargaLeche1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaLeche1ActionPerformed
        double cant = validaCant(this.campoRecargaLeche1.getText());
        procesaCarga(m1, new Ingrediente("Leche"), cant);
    }//GEN-LAST:event_botonRecargaLeche1ActionPerformed

    private void botonRecargaTe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaTe1ActionPerformed
        double cant = validaCant(this.campoRecargaTe1.getText());
        procesaCarga(m1, new Ingrediente("Té"), cant);
    }//GEN-LAST:event_botonRecargaTe1ActionPerformed

    private void botonRecargaYerba3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaYerba3ActionPerformed
        double cant = validaCant(this.campoRecargaYerba3.getText());
        procesaCarga(m3, new Ingrediente("Yerba"), cant);
    }//GEN-LAST:event_botonRecargaYerba3ActionPerformed

    private void botonMate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMate3ActionPerformed
        Infusion infusion = this.m3.prepararInfusion("Mate cocido");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonMate3ActionPerformed

    private void botonRecargaCacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaCacao2ActionPerformed
        double cant = validaCant(this.campoRecargaCacao2.getText());
        procesaCarga(m2, new Ingrediente("Cacao"), cant);
    }//GEN-LAST:event_botonRecargaCacao2ActionPerformed

    private void botonRecargaCafe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaCafe2ActionPerformed
        double cant = validaCant(this.campoRecargaCafe2.getText());
        procesaCarga(m2, new Ingrediente("Café"), cant);
    }//GEN-LAST:event_botonRecargaCafe2ActionPerformed

    private void botonRecargaCrema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaCrema2ActionPerformed
        double cant = validaCant(this.campoRecargaCrema2.getText());
        procesaCarga(m2, new Ingrediente("Crema"), cant);
    }//GEN-LAST:event_botonRecargaCrema2ActionPerformed

    private void botonRecargaTe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargaTe2ActionPerformed
        double cant = validaCant(this.campoRecargaTe2.getText());
        procesaCarga(m2, new Ingrediente("Té"), cant);
    }//GEN-LAST:event_botonRecargaTe2ActionPerformed

    private void botonCafe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCafe2ActionPerformed
        Infusion infusion = this.m2.prepararInfusion("Café");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonCafe2ActionPerformed

    private void botonTe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTe2ActionPerformed
        Infusion infusion = this.m2.prepararInfusion("Té");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonTe2ActionPerformed

    private void botonCapuchino2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCapuchino2ActionPerformed
        Infusion infusion = this.m2.prepararInfusion("Capuchino");

        this.mensajeEntrega(infusion);
    }//GEN-LAST:event_botonCapuchino2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz i = new Interfaz();
                i.setLocationRelativeTo(null);
                i.refrescarEstados();
                i.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCafe1;
    private javax.swing.JButton botonCafe2;
    private javax.swing.JButton botonCafecl1;
    private javax.swing.JButton botonCapuchino2;
    private javax.swing.JButton botonChocolate1;
    private javax.swing.JButton botonMate3;
    private javax.swing.JButton botonRecargaCacao1;
    private javax.swing.JButton botonRecargaCacao2;
    private javax.swing.JButton botonRecargaCafe1;
    private javax.swing.JButton botonRecargaCafe2;
    private javax.swing.JButton botonRecargaCrema2;
    private javax.swing.JButton botonRecargaLeche1;
    private javax.swing.JButton botonRecargaTe1;
    private javax.swing.JButton botonRecargaTe2;
    private javax.swing.JButton botonRecargaYerba3;
    private javax.swing.JButton botonTe1;
    private javax.swing.JButton botonTe2;
    private javax.swing.JButton botonTecl1;
    private javax.swing.JTextField campoRecargaCacao1;
    private javax.swing.JTextField campoRecargaCacao2;
    private javax.swing.JTextField campoRecargaCafe1;
    private javax.swing.JTextField campoRecargaCafe2;
    private javax.swing.JTextField campoRecargaCrema2;
    private javax.swing.JTextField campoRecargaLeche1;
    private javax.swing.JTextField campoRecargaTe1;
    private javax.swing.JTextField campoRecargaTe2;
    private javax.swing.JTextField campoRecargaYerba3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelEntrega1;
    private javax.swing.JPanel panelEntrega2;
    private javax.swing.JPanel panelEntrega3;
    private javax.swing.JPanel panelEstado1;
    private javax.swing.JPanel panelEstado2;
    private javax.swing.JPanel panelEstado3;
    private javax.swing.JPanel panelRecarga1;
    private javax.swing.JPanel panelRecarga2;
    private javax.swing.JPanel panelRecarga3;
    private javax.swing.JPanel panelTipo1;
    private javax.swing.JPanel panelTipo2;
    private javax.swing.JPanel panelTipo3;
    private javax.swing.JTextArea textEstado1;
    private javax.swing.JTextArea textEstado2;
    private javax.swing.JTextArea textEstado3;
    // End of variables declaration//GEN-END:variables
}