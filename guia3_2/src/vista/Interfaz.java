
package vista;

import java.awt.Insets;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import modelo.Departamento;
import modelo.Empresa;

public class Interfaz extends javax.swing.JFrame {

    private final Empresa empresa;
    
    public Interfaz() {
        
        
        initComponents();
        this.empresa = new Empresa("Mi empresa");
        this.cambiarTitulo();
        
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPaneMenu = new javax.swing.JTabbedPane();
        PanelDepartamentos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNombreDep = new javax.swing.JTextField();
        botonAgregarDep = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoListadoDeptos = new javax.swing.JTextArea();
        PanelEmpleados = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("FramePrincipal"); // NOI18N
        setResizable(false);

        TabbedPaneMenu.setAlignmentX(0.0F);
        TabbedPaneMenu.setAlignmentY(0.0F);

        PanelDepartamentos.setAlignmentX(0.0F);
        PanelDepartamentos.setAlignmentY(0.0F);

        jLabel1.setText("Agregar Departamento: ");

        jLabel2.setText("Nombre: ");

        botonAgregarDep.setText("Agregar");
        botonAgregarDep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarDepActionPerformed(evt);
            }
        });

        textoListadoDeptos.setEditable(false);
        textoListadoDeptos.setColumns(20);
        textoListadoDeptos.setRows(5);
        textoListadoDeptos.setAlignmentX(0.0F);
        textoListadoDeptos.setAlignmentY(0.0F);
        jScrollPane1.setViewportView(textoListadoDeptos);

        javax.swing.GroupLayout PanelDepartamentosLayout = new javax.swing.GroupLayout(PanelDepartamentos);
        PanelDepartamentos.setLayout(PanelDepartamentosLayout);
        PanelDepartamentosLayout.setHorizontalGroup(
            PanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelDepartamentosLayout.createSequentialGroup()
                .addGroup(PanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDepartamentosLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(PanelDepartamentosLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombreDep, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarDep))
                    .addGroup(PanelDepartamentosLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        PanelDepartamentosLayout.setVerticalGroup(
            PanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombreDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarDep))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        TabbedPaneMenu.addTab("Departamentos", PanelDepartamentos);

        javax.swing.GroupLayout PanelEmpleadosLayout = new javax.swing.GroupLayout(PanelEmpleados);
        PanelEmpleados.setLayout(PanelEmpleadosLayout);
        PanelEmpleadosLayout.setHorizontalGroup(
            PanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        PanelEmpleadosLayout.setVerticalGroup(
            PanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        TabbedPaneMenu.addTab("Empleados", PanelEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPaneMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPaneMenu)
        );

        TabbedPaneMenu.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarDepActionPerformed
        String nombreDep = this.campoNombreDep.getText();
        
        if (nombreDep != null && !nombreDep.equals("")) {
            if (this.empresa.addDepartamento(new Departamento(nombreDep))) {
                String msj = "Se creó el Departamento de " + nombreDep + " con éxito.";
                JOptionPane.showMessageDialog(this, msj);
                this.campoNombreDep.setText("");
                this.actualizarListadoDeptos();
            }
            else {
                String msj = "Error: El Departamento de " + nombreDep + " ya existe.";
                JOptionPane.showMessageDialog(this, msj);
            }
        }
        else {
                String msj = "Error: El campo nombre del Departamento está vacío";
                JOptionPane.showMessageDialog(this, msj);
        }
    }//GEN-LAST:event_botonAgregarDepActionPerformed

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
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDepartamentos;
    private javax.swing.JPanel PanelEmpleados;
    private javax.swing.JTabbedPane TabbedPaneMenu;
    private javax.swing.JButton botonAgregarDep;
    private javax.swing.JTextField campoNombreDep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea textoListadoDeptos;
    // End of variables declaration//GEN-END:variables

    private void actualizarListadoDeptos() {
        this.textoListadoDeptos.setText("");
        this.textoListadoDeptos.append(this.empresa.listado());
    }
    
     private void cambiarTitulo() {
        this.setTitle(this.empresa.getNombre());
    } 

}
