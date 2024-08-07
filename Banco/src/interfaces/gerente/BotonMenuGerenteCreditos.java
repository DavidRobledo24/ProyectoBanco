package interfaces.gerente;

import javax.swing.JOptionPane;
import utils.ConexionBD;


public class BotonMenuGerenteCreditos extends javax.swing.JPanel {
    
    ConexionBD database;
    String idCredito;
    String idCuentaBancaria;
    MenuGerenteGeneral ventanaAnterior;
 
    public BotonMenuGerenteCreditos(ConexionBD database, String idCredito, MenuGerenteGeneral ventanaAnterior) {
        this.database = database;
        this.idCredito = idCredito;
        this.ventanaAnterior = ventanaAnterior;
        initComponents();
        initAlternComponents();
    }

    private void initAlternComponents(){
        idCuentaBancaria = database.darDatoCredito(idCredito, "idCuentaBancaria");
        String documentoCliente = database.encontrarDocumentoCliente(idCuentaBancaria);
        etqNombreTitular.setText(database.darDatoCliente(documentoCliente, "nombre"));
        etqEmailTitular.setText(database.darDatoCliente(documentoCliente, "email"));
        etqTelefonoTitular.setText(database.darDatoCliente(documentoCliente, "telefono"));
        etqDeuda.setText(database.darDatoCuentaBancaria(idCuentaBancaria, "deuda"));
        etqBalance.setText(database.darDatoCuentaBancaria(idCuentaBancaria, "balance"));
        etqPrestamoSolicitado.setText(database.darDatoCredito(idCredito, "valorPrestamo"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etqNombreTitular = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etqEmailTitular = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etqTelefonoTitular = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etqBalance = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etqPrestamoSolicitado = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnDenegar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        etqDeuda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(39, 64, 152));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Titular:");

        etqNombreTitular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqNombreTitular.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");

        etqEmailTitular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqEmailTitular.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono:");

        etqTelefonoTitular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqTelefonoTitular.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Balance:");

        etqBalance.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqBalance.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prestamo solicitado:");

        etqPrestamoSolicitado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqPrestamoSolicitado.setForeground(new java.awt.Color(255, 255, 255));

        btnAceptar.setBackground(new java.awt.Color(101, 132, 65));
        btnAceptar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnDenegar.setBackground(new java.awt.Color(116, 16, 35));
        btnDenegar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDenegar.setForeground(new java.awt.Color(255, 255, 255));
        btnDenegar.setText("Denegar");
        btnDenegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenegarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Deuda:");

        etqDeuda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqDeuda.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqPrestamoSolicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqEmailTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqTelefonoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDenegar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqEmailTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqTelefonoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqPrestamoSolicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnDenegar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String documentoCliente = database.encontrarDocumentoCliente(idCuentaBancaria);
        String valorPrestamo = database.darDatoCredito(idCredito, "valorPrestamo");
        int tempInt = Integer.parseInt(valorPrestamo);
        tempInt-=(tempInt*2);
        if(database.modificarDineroSucursal(database.darDatoCliente(documentoCliente, "idSucursales"), tempInt)){
            database.editarDeudaCuentaBancaria(idCuentaBancaria, valorPrestamo);
            database.editarBalanceCuentaBancaria(idCuentaBancaria, valorPrestamo);
            database.actualizarHistorial(idCuentaBancaria, "cuentabancaria", "Credito_"+valorPrestamo+"_Aceptado");
            database.actualizarHistorial(database.darDatoCliente(documentoCliente, "idSucursales"), "sucursal", "Credito_"+valorPrestamo+"_Aceptado en cuenta: "+idCuentaBancaria);
            database.eliminarCredito(idCredito);
            ventanaAnterior.cambiarPanelCreditos();
            JOptionPane.showMessageDialog(null, "Credito aceptado", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Dinero insuficiente en la sucursal", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnDenegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenegarActionPerformed
        String documentoCliente = database.encontrarDocumentoCliente(idCuentaBancaria);
        String valorPrestamo = database.darDatoCredito(idCredito, "valorPrestamo");
        database.actualizarHistorial(idCuentaBancaria, "cuentabancaria", "Credito_"+valorPrestamo+"_Rechazado");
        database.actualizarHistorial(database.darDatoCliente(documentoCliente, "idSucursales"), "sucursal", "Credito_"+valorPrestamo+"_Rechazado en cuenta: "+idCuentaBancaria);
        database.eliminarCredito(idCredito);
        ventanaAnterior.cambiarPanelCreditos();
        JOptionPane.showMessageDialog(null, "Credito rechazado", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDenegarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnDenegar;
    private javax.swing.JLabel etqBalance;
    private javax.swing.JLabel etqDeuda;
    private javax.swing.JLabel etqEmailTitular;
    private javax.swing.JLabel etqNombreTitular;
    private javax.swing.JLabel etqPrestamoSolicitado;
    private javax.swing.JLabel etqTelefonoTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
