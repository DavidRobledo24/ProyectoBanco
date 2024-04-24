package interfaces.gerente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import utils.ConexionBD;


public class MenuGerenteAgregarSucursal extends javax.swing.JPanel {
    
    ConexionBD database;
    MenuGerenteGeneral ventanaAnterior;
    String documentoGerente;
    
    public MenuGerenteAgregarSucursal(ConexionBD database, MenuGerenteGeneral ventanaAnterior, String documentoGerente) {
        this.database = database;
        this.ventanaAnterior = ventanaAnterior;
        this.documentoGerente = documentoGerente;
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldTelefono = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setBackground(new java.awt.Color(39, 64, 115));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dirección");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teléfono");

        botonAgregar.setBackground(new java.awt.Color(101, 132, 65));
        botonAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonAtras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonAtras.setText("<-       Atrás           ");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        String nombre = fieldNombre.getText();
        String direccion = fieldDireccion.getText();
        String telefono = fieldTelefono.getText();
        
        Pattern numRegex = Pattern.compile("\\d+");
        
        Matcher matcherTelefono = numRegex.matcher(telefono);
        
        boolean matchTelefono = matcherTelefono.find();
        
        if(!nombre.equals("") && !direccion.equals("") && matchTelefono){
            if(database.agregarSucursal(nombre, direccion, telefono, documentoGerente)){
                JOptionPane.showMessageDialog(null, "Sucursal creada con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                ventanaAnterior.cambiarPanelSucursal();
            }
            else JOptionPane.showMessageDialog(null, "Error grave", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String errores = "";
            errores+=!nombre.equals("") ? "" : "*Nombre vacio";
            errores+=(!errores.equals("") && direccion.equals("") ? "\n" : "") + (!direccion.equals("") ? "" : "*Direccion vacia");
            errores+=(!errores.equals("") && !matchTelefono ? "\n" : "") + (matchTelefono ? "" : "*Solo ingrese numeros en el telefono");
            JOptionPane.showMessageDialog(null, errores, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        ventanaAnterior.cambiarPanelSucursal();
    }//GEN-LAST:event_botonAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
