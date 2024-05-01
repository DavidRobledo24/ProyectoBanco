
package interfaces.vendedor;

import utils.ConexionBD;


public class MenuVendedorCrearCliente extends javax.swing.JPanel {

    
    
    MenuVendedorGeneral ventana;
    ConexionBD database;
    
    public MenuVendedorCrearCliente(MenuVendedorGeneral ventana,ConexionBD database) {
        this.ventana = ventana;
        this.database = database;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        etqNombre = new javax.swing.JLabel();
        etqDocumento = new javax.swing.JLabel();
        etqEmail = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        etqClave = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        campoClave = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        contenedorPrincipal.setBackground(new java.awt.Color(39, 64, 115));

        etqNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(255, 255, 255));
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("Nombre:");

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(255, 255, 255));
        etqDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDocumento.setText("Documento:");

        etqEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(255, 255, 255));
        etqEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqEmail.setText("Email:");

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTelefono.setText("Telefono:");

        etqClave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqClave.setForeground(new java.awt.Color(255, 255, 255));
        etqClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqClave.setText("Clave:");

        btnCrear.setBackground(new java.awt.Color(101, 132, 65));
        btnCrear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(248, 248, 248))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(245, 245, 245))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(etqClave, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))))
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqClave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
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

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
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
    // End of variables declaration//GEN-END:variables
}
