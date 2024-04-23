
package interfaces.vendedor;

import interfaces.InicioSesion;
import static java.awt.Color.white;
import utils.ConexionBD;

public class MenuVendedorGeneral extends javax.swing.JFrame {

    ConexionBD database;
    
    public MenuVendedorGeneral(ConexionBD database) {
        this.database = database;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnManejoDinero = new javax.swing.JButton();
        btnSolicitudCreditos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        contentPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentMenu.setBackground(new java.awt.Color(39, 64, 115));

        btnCerrarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnManejoDinero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnManejoDinero.setText("Manejo Dinero");
        btnManejoDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManejoDineroActionPerformed(evt);
            }
        });

        btnSolicitudCreditos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSolicitudCreditos.setText("Solicitud de creditos");
        btnSolicitudCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudCreditosActionPerformed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManejoDinero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSolicitudCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(contentMenuLayout.createSequentialGroup()
                        .addComponent(btnCerrarSesion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnSolicitudCreditos)
                .addGap(90, 90, 90)
                .addComponent(btnManejoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnCerrarSesion)
                .addGap(15, 15, 15))
        );

        contentPrincipal.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initAlternComponents(){
        btnCerrarSesion.setBackground(white);   
        btnClientes.setBackground(white);
        btnHistorial.setBackground(white);
        btnManejoDinero.setBackground(white);
        btnSolicitudCreditos.setBackground(white);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Menu CRUD");
        
}
    
    public void cambiarPanelClientes(){
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorClientes nuevo = new MenuVendedorClientes(this);
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }
            
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        cambiarPanelClientes();
    }//GEN-LAST:event_btnClientesActionPerformed

    public void cambiarSolicitudCreditosActionPerformed() {                                                     
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorCrearCliente nuevo = new MenuVendedorCrearCliente(database, this);
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }
    
    public void cambiarLeerClientesActionPerformed() {                                                     
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorLeerClientes nuevo = new MenuVendedorLeerClientes(this);
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }
    
    public void cambiarEditarClientesActionPerformed() {                                                     
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorEditarCliente nuevo = new MenuVendedorEditarCliente(this);
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Rend erizar la ventana
        
        revalidate();
        repaint();
    }
    
    public void cambiarEliminarClientesActionPerformed() {                                                     
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorEliminarCliente nuevo = new MenuVendedorEliminarCliente(this);
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }
    
    private void btnSolicitudCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudCreditosActionPerformed
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorIngresarDinero nuevo = new MenuVendedorIngresarDinero();
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }//GEN-LAST:event_btnSolicitudCreditosActionPerformed

    private void btnManejoDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManejoDineroActionPerformed
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorVisualizarBalance nuevo = new MenuVendedorVisualizarBalance();
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }//GEN-LAST:event_btnManejoDineroActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
        
        new InicioSesion(database);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorHistorialSucursal nuevo = new MenuVendedorHistorialSucursal();
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }//GEN-LAST:event_btnHistorialActionPerformed

    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVendedorGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVendedorGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVendedorGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVendedorGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnManejoDinero;
    private javax.swing.JButton btnSolicitudCreditos;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
