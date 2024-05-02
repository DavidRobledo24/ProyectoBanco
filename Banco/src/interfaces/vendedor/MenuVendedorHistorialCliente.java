package interfaces.vendedor;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.ConexionBD;


public class MenuVendedorHistorialCliente extends javax.swing.JPanel {

    ConexionBD database;
    MenuVendedorGeneral ventanaAnterior;
    String cuentaBancaria;
    DefaultTableModel modelo;
    
    public MenuVendedorHistorialCliente(ConexionBD database, MenuVendedorGeneral ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
        this.database = database;
        initComponents();
        modelo = (DefaultTableModel)tablaHistorial.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        etqCuentaBancaria = new javax.swing.JLabel();
        campoCuentaBancaria = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        etqClave = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        etqHistorial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();

        contenedorPrincipal.setBackground(new java.awt.Color(39, 64, 115));

        btnAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtras.setText("Atrás");
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
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqClave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqClave.setForeground(new java.awt.Color(255, 255, 255));
        etqClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqClave.setText("Clave:");

        campoClave.setBackground(new java.awt.Color(153, 153, 153));
        campoClave.setEnabled(false);

        btnIngresar.setBackground(new java.awt.Color(101, 132, 65));
        btnIngresar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setEnabled(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        etqHistorial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqHistorial.setForeground(new java.awt.Color(255, 255, 255));
        etqHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqHistorial.setText("Historial");

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Tipo de transacción", "Dinero", "Detalles"
            }
        ));
        jScrollPane1.setViewportView(tablaHistorial);

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(campoClave)
                                .addGap(18, 18, 18)
                                .addComponent(btnIngresar))
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(campoCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(etqClave))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(etqCuentaBancaria))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(etqHistorial)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqCuentaBancaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(etqClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoClave, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(etqHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cuentaBancaria = campoCuentaBancaria.getText();
        
        if(cuentaBancaria.equals("")){
            JOptionPane.showMessageDialog(null, "Cuenta bancaria vacia", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String datoTemp = database.darDatoCuentaBancaria(cuentaBancaria, "idCuentaBancaria");
        
        if(datoTemp.equals("")){
            JOptionPane.showMessageDialog(null, "Cuenta bancaria no existe", "Error", JOptionPane.ERROR_MESSAGE);
            campoClave.setText("");
            campoClave.setBackground(new Color(153, 153, 153));
            campoClave.setEnabled(false);
            btnIngresar.setEnabled(false);
        }
        else{
            campoClave.setText("");
            campoClave.setBackground(new Color(255, 255, 255));
            campoClave.setEnabled(true);
            btnIngresar.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String clave = campoClave.getText();
        
        if(clave.equals(database.darDatoCuentaBancaria(cuentaBancaria, "clave"))) database.llenarTablaHistorial(modelo, cuentaBancaria, "cuentabancaria");
        else modelo.setRowCount(0);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ventanaAnterior.cambiarPanelManejoDeDinero();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextField campoCuentaBancaria;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel etqClave;
    private javax.swing.JLabel etqCuentaBancaria;
    private javax.swing.JLabel etqHistorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHistorial;
    // End of variables declaration//GEN-END:variables
}
