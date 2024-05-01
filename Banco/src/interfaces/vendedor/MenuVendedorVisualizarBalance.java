
package interfaces.vendedor;

import java.awt.Color;
import utils.ConexionBD;

public class MenuVendedorVisualizarBalance extends javax.swing.JPanel {
    
    ConexionBD database;
    MenuVendedorGeneral ventanaAnterior;
    
    public MenuVendedorVisualizarBalance(ConexionBD database, MenuVendedorGeneral ventanaAnterior) {
        this.database = database;
        this.ventanaAnterior = ventanaAnterior;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnAtras = new javax.swing.JButton();
        etqDocumento = new javax.swing.JLabel();
        fieldCuentaBancaria = new javax.swing.JTextField();
        etqClave = new javax.swing.JLabel();
        fieldClave = new javax.swing.JTextField();
        campoBalance = new javax.swing.JLabel();
        etqBalance = new javax.swing.JLabel();
        btnBuscarDocumento = new javax.swing.JButton();
        btnVerBalance = new javax.swing.JButton();

        setBackground(new java.awt.Color(39, 64, 115));

        btnAtras.setText("<-- Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(255, 255, 255));
        etqDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDocumento.setText("Cuenta bancaria:");

        etqClave.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqClave.setForeground(new java.awt.Color(255, 255, 255));
        etqClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqClave.setText("Clave:");

        fieldClave.setBackground(new java.awt.Color(153, 153, 153));
        fieldClave.setEnabled(false);

        campoBalance.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        campoBalance.setForeground(new java.awt.Color(255, 255, 255));
        campoBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campoBalance.setText("------------------------------------------");

        etqBalance.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqBalance.setForeground(new java.awt.Color(255, 255, 255));
        etqBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqBalance.setText("Balance:");

        btnBuscarDocumento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBuscarDocumento.setText("Buscar");
        btnBuscarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDocumentoActionPerformed(evt);
            }
        });

        btnVerBalance.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVerBalance.setText("Ver balance");
        btnVerBalance.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAtras)
                                        .addGap(462, 462, 462))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(fieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVerBalance)
                                    .addComponent(btnBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 161, Short.MAX_VALUE))
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(etqClave)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoBalance)
                .addGap(248, 248, 248))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(etqBalance))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(etqDocumento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqDocumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(etqClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ventanaAnterior.cambiarPanelManejoDeDinero();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocumentoActionPerformed
        String datoTemp = database.darDatoCuentaBancaria(fieldCuentaBancaria.getText(), "idCuentaBancaria");
        if(datoTemp.equals("")){
            fieldClave.setText("");
            fieldClave.setBackground(new Color(153,153,153));
            fieldClave.setEnabled(false);
            btnVerBalance.setEnabled(true);
            
            campoBalance.setText("------------------------------------------");
        }
        else{
            fieldClave.setText("");
            fieldClave.setBackground(new Color(255, 255, 255));
            fieldClave.setEnabled(true);
            btnVerBalance.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarDocumentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarDocumento;
    private javax.swing.JButton btnVerBalance;
    private javax.swing.JLabel campoBalance;
    private javax.swing.JLabel etqBalance;
    private javax.swing.JLabel etqClave;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JTextField fieldClave;
    private javax.swing.JTextField fieldCuentaBancaria;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
