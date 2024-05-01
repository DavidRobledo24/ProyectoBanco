package interfaces.vendedor;

import java.awt.Color;

public class MenuVendedorManejoDeDinero extends javax.swing.JPanel {

    MenuVendedorGeneral ventanaAnterior;
    
    public MenuVendedorManejoDeDinero(MenuVendedorGeneral ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
        initComponents();
        initAlternComponents();
    }

    private void initAlternComponents(){
        btnHistorialDeMovimientos.setBackground(Color.white);
        btnIngresarDinero.setBackground(Color.white);
        btnRetirarDinero.setBackground(Color.white);
        btnVisualizarBalance.setBackground(Color.white);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVisualizarBalance = new javax.swing.JButton();
        btnIngresarDinero = new javax.swing.JButton();
        btnRetirarDinero = new javax.swing.JButton();
        btnHistorialDeMovimientos = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(39, 64, 115));

        btnVisualizarBalance.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVisualizarBalance.setText("Visualizar Balance");
        btnVisualizarBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarBalanceActionPerformed(evt);
            }
        });

        btnIngresarDinero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIngresarDinero.setText("Ingresar Dinero");
        btnIngresarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDineroActionPerformed(evt);
            }
        });

        btnRetirarDinero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRetirarDinero.setText("Retirar Dinero");
        btnRetirarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarDineroActionPerformed(evt);
            }
        });

        btnHistorialDeMovimientos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnHistorialDeMovimientos.setText("Historial de movimientos");
        btnHistorialDeMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialDeMovimientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHistorialDeMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnVisualizarBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnIngresarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnRetirarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnHistorialDeMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
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

    private void btnVisualizarBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarBalanceActionPerformed
        ventanaAnterior.cambiarPanelVisualizarBalance();
    }//GEN-LAST:event_btnVisualizarBalanceActionPerformed

    private void btnIngresarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDineroActionPerformed
        ventanaAnterior.cambiarPanelIngresarDinero();
    }//GEN-LAST:event_btnIngresarDineroActionPerformed

    private void btnRetirarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarDineroActionPerformed
        ventanaAnterior.cambiarPanelRetirarDinero();
    }//GEN-LAST:event_btnRetirarDineroActionPerformed

    private void btnHistorialDeMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialDeMovimientosActionPerformed
        ventanaAnterior.cambiarPanelHistorialDeMovimientos();
    }//GEN-LAST:event_btnHistorialDeMovimientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorialDeMovimientos;
    private javax.swing.JButton btnIngresarDinero;
    private javax.swing.JButton btnRetirarDinero;
    private javax.swing.JButton btnVisualizarBalance;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
