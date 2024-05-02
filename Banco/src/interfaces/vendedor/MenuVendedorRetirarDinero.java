package interfaces.vendedor;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import utils.ConexionBD;

public class MenuVendedorRetirarDinero extends javax.swing.JPanel {

    ConexionBD database;
    MenuVendedorGeneral ventanaAnterior;
    String cuentaBancaria;
    String idSucursal;
    
    public MenuVendedorRetirarDinero(ConexionBD database, MenuVendedorGeneral ventanaAnterior, String idSucursal) {
        this.database = database;
        this.ventanaAnterior = ventanaAnterior;
        this.idSucursal = idSucursal;
        initComponents();
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
        etqCuentaBancaria4 = new javax.swing.JLabel();
        fieldCantidadRetirar = new javax.swing.JTextField();

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
        fieldClave.setEnabled(false);

        btnRetirar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.setEnabled(false);
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        etqCuentaBancaria4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCuentaBancaria4.setForeground(new java.awt.Color(255, 255, 255));
        etqCuentaBancaria4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCuentaBancaria4.setText("Cantidad a retirar:");

        fieldCantidadRetirar.setBackground(new java.awt.Color(153, 153, 153));
        fieldCantidadRetirar.setEnabled(false);

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(etqCuentaBancaria1)
                                .addGap(23, 23, 23))
                            .addComponent(labelDineroDisponible)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(etqCuentaBancaria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCantidadRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(etqCuentaBancaria3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addComponent(etqCuentaBancaria4)))
                        .addGap(8, 8, 8)))
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
                .addGap(18, 18, 18)
                .addComponent(etqCuentaBancaria1)
                .addGap(18, 18, 18)
                .addComponent(labelDineroDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(etqCuentaBancaria4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldCantidadRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(etqCuentaBancaria3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldClave, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(40, 40, 40))
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
        cuentaBancaria = fieldCuentaBancaria.getText();
        
        if(cuentaBancaria.equals("")){
            JOptionPane.showMessageDialog(null, "Cuenta bancaria vacia", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String datoTemp = database.darDatoCuentaBancaria(cuentaBancaria, "idCuentaBancaria");
        if(datoTemp.equals("")){
            labelDineroDisponible.setText("- - - - - - - - - - - - - - - - - - -");
            fieldCantidadRetirar.setText("");
            fieldCantidadRetirar.setBackground(new Color(153, 153, 153));
            fieldCantidadRetirar.setEnabled(false);
            fieldClave.setText("");
            fieldClave.setBackground(new Color(153, 153, 153));
            fieldClave.setEnabled(false);
            btnRetirar.setEnabled(false);
        }
        else{
            labelDineroDisponible.setText(database.darDatoCuentaBancaria(cuentaBancaria, "balance"));
            fieldCantidadRetirar.setText("");
            fieldCantidadRetirar.setBackground(new Color(255, 255, 255));
            fieldCantidadRetirar.setEnabled(true);
            fieldClave.setText("");
            fieldClave.setBackground(new Color(255, 255, 255));
            fieldClave.setEnabled(true);
            btnRetirar.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        String cantRetirar = fieldCantidadRetirar.getText();
        int cantRetirarInt = Integer.parseInt(cantRetirar);
        cantRetirarInt = cantRetirarInt < 0 ? 0 : cantRetirarInt;
        cantRetirar = cantRetirarInt+"";
        String clave = fieldClave.getText();
        
        Pattern regex = Pattern.compile("\\d+");
        
        Matcher matcherRetirar = regex.matcher(cantRetirar);
        Matcher matcherClave = regex.matcher(clave);
        
        boolean matchRetirar = matcherRetirar.find();
        boolean matchClave = matcherClave.find();
        
        if(matchRetirar && matchClave){
            if(database.retirarDineroCuentaBancaria(cuentaBancaria, cantRetirar, clave, idSucursal)){
                database.actualizarHistorial(cuentaBancaria, "cuentabancaria", "R_"+cantRetirar+"_No hay detalles");
                database.actualizarHistorial(idSucursal, "sucursal", "Deposito_"+cantRetirar+"_Cuenta: "+cuentaBancaria);
                labelDineroDisponible.setText("- - - - - - - - - - - - - - - - - - -");
                fieldCantidadRetirar.setText("");
                fieldCantidadRetirar.setBackground(new Color(153, 153, 153));
                fieldCantidadRetirar.setEnabled(false);
                fieldClave.setText("");
                fieldClave.setBackground(new Color(153, 153, 153));
                fieldClave.setEnabled(false);
                btnRetirar.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Movimiento exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            String errores = "";
            errores+=(matchRetirar ? "" : "*Solo ingrese numeros en la cantidad a retirar");
            errores+=(errores.equals("") && matchClave ? "" : "\n") + (matchClave ? "" : "*Solo ingrese numeros en la clave");
            JOptionPane.showMessageDialog(null, errores, "Error", JOptionPane.ERROR_MESSAGE);
        }
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
    private javax.swing.JLabel etqCuentaBancaria4;
    private javax.swing.JTextField fieldCantidadRetirar;
    private javax.swing.JTextField fieldClave;
    private javax.swing.JTextField fieldCuentaBancaria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDineroDisponible;
    // End of variables declaration//GEN-END:variables
}
