package interfaces.vendedor;

import utils.ConexionBD;

public class MenuVendedorRetirarDinero extends javax.swing.JPanel {

    ConexionBD database;
    MenuVendedorGeneral ventanaAnterior;
    
    public MenuVendedorRetirarDinero(ConexionBD database, MenuVendedorGeneral ventanaAnterior) {
        this.database = database;
        this.ventanaAnterior = ventanaAnterior;
        initComponents();
    }

    private void initAlternComponents(){
        fieldClave.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        etqCuentaBancaria = new javax.swing.JLabel();
        fieldCuentaBancaria = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        etqCuentaBancaria1 = new javax.swing.JLabel();
        labelDineroDisponible = new javax.swing.JLabel();
        etqCuentaBancaria3 = new javax.swing.JLabel();
        fieldClave = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(39, 64, 115));

        btnAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        etqCuentaBancaria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCuentaBancaria.setForeground(new java.awt.Color(255, 255, 255));
        etqCuentaBancaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCuentaBancaria.setText("Cuenta Bancaria:");

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqCuentaBancaria1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCuentaBancaria1.setForeground(new java.awt.Color(255, 255, 255));
        etqCuentaBancaria1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCuentaBancaria1.setText("Dinero Disponible:");

        labelDineroDisponible.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelDineroDisponible.setForeground(new java.awt.Color(255, 255, 255));
        labelDineroDisponible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDineroDisponible.setText("- - - - - - - - - - - - - - - - - - -");

        etqCuentaBancaria3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCuentaBancaria3.setForeground(new java.awt.Color(255, 255, 255));
        etqCuentaBancaria3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCuentaBancaria3.setText("Clave:");

        fieldClave.setBackground(new java.awt.Color(153, 153, 153));

        btnRetirar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(fieldCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                .addGap(131, 131, 131))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etqCuentaBancaria1)
                .addGap(353, 353, 353))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(etqCuentaBancaria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(labelDineroDisponible))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(etqCuentaBancaria3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(etqCuentaBancaria)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldCuentaBancaria)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(etqCuentaBancaria1)
                .addGap(18, 18, 18)
                .addComponent(labelDineroDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(etqCuentaBancaria3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldClave, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(79, 79, 79)
                .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ventanaAnterior.cambiarPanelManejoDeDinero();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel etqCuentaBancaria;
    private javax.swing.JLabel etqCuentaBancaria1;
    private javax.swing.JLabel etqCuentaBancaria3;
    private javax.swing.JTextField fieldClave;
    private javax.swing.JTextField fieldCuentaBancaria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDineroDisponible;
    // End of variables declaration//GEN-END:variables
}
