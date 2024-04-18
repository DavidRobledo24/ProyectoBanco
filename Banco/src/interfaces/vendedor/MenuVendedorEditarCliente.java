
package interfaces.vendedor;


public class MenuVendedorEditarCliente extends javax.swing.JPanel {

    
    MenuVendedorGeneral ventana;
    public MenuVendedorEditarCliente(MenuVendedorGeneral ventana) {
        this.ventana = ventana;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        etqClave = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        contenedorPrincipal.setBackground(new java.awt.Color(39, 64, 115));

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(255, 255, 255));
        etqDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDocumento.setText("Documento:");

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");

        etqNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(255, 255, 255));
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("Nombre:");

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTelefono.setText("Telefono:");

        etqEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(255, 255, 255));
        etqEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqEmail.setText("Email:");

        etqClave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqClave.setForeground(new java.awt.Color(255, 255, 255));
        etqClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqClave.setText("Clave:");

        btnAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEditar.setText("BUSCAR");

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(etqClave, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqClave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventana.cambiarPanelClientes();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel etqClave;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
