package interfaces.vendedor;

import java.awt.Color;
import utils.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class MenuVendedorSolicitudCreditos extends javax.swing.JPanel {

    ConexionBD database;
    String cuentaBuscar;
    
    public MenuVendedorSolicitudCreditos(ConexionBD database) {
        this.database = database;
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        etqDocumento = new javax.swing.JLabel();
        campoDocumentoCredito = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        etqDineroPrestar = new javax.swing.JLabel();
        etqCupoPrestamo = new javax.swing.JLabel();
        campoDineroPrestar = new javax.swing.JTextField();
        etqClaveSolicitarCredito = new javax.swing.JLabel();
        campoClavePrestamo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        etqCliente = new javax.swing.JLabel();
        etqNombreCliente = new javax.swing.JLabel();
        etqDocuemtno = new javax.swing.JLabel();
        etqDocumentoCliente = new javax.swing.JLabel();
        etqCampoDeuda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(39, 64, 115));

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(255, 255, 255));
        etqDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDocumento.setText("Cuenta Bancaria");

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etqDineroPrestar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqDineroPrestar.setForeground(new java.awt.Color(255, 255, 255));
        etqDineroPrestar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDineroPrestar.setText("Dinero a prestar: ");

        etqCupoPrestamo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCupoPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        etqCupoPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCupoPrestamo.setText("Deuda actual:");

        campoDineroPrestar.setBackground(new java.awt.Color(153, 153, 153));
        campoDineroPrestar.setEnabled(false);

        etqClaveSolicitarCredito.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqClaveSolicitarCredito.setForeground(new java.awt.Color(255, 255, 255));
        etqClaveSolicitarCredito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqClaveSolicitarCredito.setText("Clave:\n");

        campoClavePrestamo.setBackground(new java.awt.Color(153, 153, 153));
        campoClavePrestamo.setEnabled(false);

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Solicitar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        etqCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCliente.setForeground(new java.awt.Color(255, 255, 255));
        etqCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCliente.setText("Cliente:");

        etqNombreCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        etqNombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        etqDocuemtno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqDocuemtno.setForeground(new java.awt.Color(255, 255, 255));
        etqDocuemtno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDocuemtno.setText("Documento:");

        etqDocumentoCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqDocumentoCliente.setForeground(new java.awt.Color(255, 255, 255));
        etqDocumentoCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        etqCampoDeuda.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        etqCampoDeuda.setForeground(new java.awt.Color(255, 255, 255));
        etqCampoDeuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCampoDeuda.setText("-------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(etqCupoPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoClavePrestamo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(campoDineroPrestar, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etqDineroPrestar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(etqClaveSolicitarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(19, 19, 19))))
                                .addGap(293, 293, 293))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoDocumentoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(179, 179, 179))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etqNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etqDocuemtno, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etqCampoDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoDocumentoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDocuemtno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(etqCupoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqCampoDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(etqDineroPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDineroPrestar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqClaveSolicitarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoClavePrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cuentaBuscar = campoDocumentoCredito.getText();
        String temp1 = database.encontrarDocumentoCliente(cuentaBuscar);
        String temp2 = database.darDatoCliente(temp1, "nombre");
        String temp3 = database.darDatoCuentaBancaria(cuentaBuscar, "deuda");
    
        if (cuentaBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la cedula de la persona.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String datoTemp = database.darDatoCuentaBancaria(cuentaBuscar, "idCuentaBancaria");
     
        if(datoTemp.equals("")){
            etqCampoDeuda.setText("-------------------------------");
            etqNombreCliente.setText("");
            etqDocumentoCliente.setText("");
            campoDineroPrestar.setText("");
            campoDineroPrestar.setBackground(new Color(153,153,153));
            campoDineroPrestar.setEnabled(false);
            campoClavePrestamo.setText("");
            campoClavePrestamo.setBackground(new Color(153,153,153));
            campoClavePrestamo.setEnabled(false);
            jButton2.setEnabled(false);
        }
        else{
            etqCampoDeuda.setText("-------------------------------");
            etqNombreCliente.setText("");
            etqDocumentoCliente.setText("");
            campoDineroPrestar.setText("");
            campoDineroPrestar.setBackground(new Color(255, 255, 255));
            campoDineroPrestar.setEnabled(true);
            campoClavePrestamo.setText("");
            campoClavePrestamo.setBackground(new Color(255, 255, 255));
            campoClavePrestamo.setEnabled(true);
            etqNombreCliente.setText(temp2);
            etqDocumentoCliente.setText(temp1);
            etqCampoDeuda.setText(temp3);
            jButton2.setEnabled(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String claveIngresada = campoClavePrestamo.getText();
        String dineroAprestar = campoDineroPrestar.getText();
        String cuentaBuscar = campoDocumentoCredito.getText();

        if (claveIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la clave de la cuenta.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean credito = database.agregarCredito(dineroAprestar, cuentaBuscar);
        
        campoDocumentoCredito.setText("");
        String datoTemp = campoDocumentoCredito.getText();
     
        if(datoTemp.equals("")){
            etqCampoDeuda.setText("-------------------------------");
            etqNombreCliente.setText("");
            etqDocumentoCliente.setText("");
            campoDineroPrestar.setText("");
            campoDineroPrestar.setBackground(new Color(153,153,153));
            campoDineroPrestar.setEnabled(false);
            campoClavePrestamo.setText("");
            campoClavePrestamo.setBackground(new Color(153,153,153));
            campoClavePrestamo.setEnabled(false);
            jButton2.setEnabled(false);
        }
        else{
            etqCampoDeuda.setText("-------------------------------");
            etqNombreCliente.setText("");
            etqDocumentoCliente.setText("");
            campoDineroPrestar.setText("");
            campoDineroPrestar.setBackground(new Color(255, 255, 255));
            campoDineroPrestar.setEnabled(true);
            campoClavePrestamo.setText("");
            campoClavePrestamo.setBackground(new Color(255, 255, 255));
            campoClavePrestamo.setEnabled(true);
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoClavePrestamo;
    private javax.swing.JTextField campoDineroPrestar;
    private javax.swing.JTextField campoDocumentoCredito;
    private javax.swing.JLabel etqCampoDeuda;
    private javax.swing.JLabel etqClaveSolicitarCredito;
    private javax.swing.JLabel etqCliente;
    private javax.swing.JLabel etqCupoPrestamo;
    private javax.swing.JLabel etqDineroPrestar;
    private javax.swing.JLabel etqDocuemtno;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqDocumentoCliente;
    private javax.swing.JLabel etqNombreCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
