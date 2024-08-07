package interfaces.vendedor;

public class MenuVendedorClientes extends javax.swing.JPanel {

    MenuVendedorGeneral ventana;
    
    public MenuVendedorClientes(MenuVendedorGeneral ventana) {
        this.ventana = ventana;
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents(){
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        btnLeerClientes = new javax.swing.JButton();
        btnCrearCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarClientes = new javax.swing.JButton();

        contenedorPrincipal.setBackground(new java.awt.Color(39, 64, 115));

        btnLeerClientes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLeerClientes.setText("LEER CLIENTE");
        btnLeerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerClientesActionPerformed(evt);
            }
        });

        btnCrearCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCrearCliente.setText("CREAR CLIENTE");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEditarCliente.setText("EDITAR CLIENTE");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarClientes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarClientes.setText("ELIMINAR CLIENTE");
        btnEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnLeerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerClientesActionPerformed

       this.ventana.cambiarLeerClientesActionPerformed();
    }//GEN-LAST:event_btnLeerClientesActionPerformed

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed


        this.ventana.cambiarPanelCrearCliente();

    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        this.ventana.cambiarEditarClientesActionPerformed();
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClientesActionPerformed
        this.ventana.cambiarEliminarClientesActionPerformed();
    }//GEN-LAST:event_btnEliminarClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarClientes;
    private javax.swing.JButton btnLeerClientes;
    private javax.swing.JPanel contenedorPrincipal;
    // End of variables declaration//GEN-END:variables
}
