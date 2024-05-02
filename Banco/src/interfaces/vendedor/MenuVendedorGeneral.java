package interfaces.vendedor;
import interfaces.InicioSesion;
import static java.awt.Color.white;
import utils.ConexionBD;

import static java.awt.Color.white;

import interfaces.InicioSesion;

public class MenuVendedorGeneral extends javax.swing.JFrame {

    ConexionBD database;

    String documentoVendedor;
    String id;
    
    public MenuVendedorGeneral(ConexionBD database, String documentoVendedor) {
        this.database = database;
        this.documentoVendedor = documentoVendedor;
        id = database.darDatoVendedor(documentoVendedor, "idSucursal");
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

    
    public void cambiarPanelCrearCliente(){
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor


        MenuVendedorCrearCliente nuevo = new MenuVendedorCrearCliente(this, database, id);

        
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
        MenuVendedorLeerClientes nuevo = new MenuVendedorLeerClientes(this,database);
        
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
        MenuVendedorEditarCliente nuevo = new MenuVendedorEditarCliente(this, database, id);
        
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
        MenuVendedorEliminarCliente nuevo = new MenuVendedorEliminarCliente(this,database);
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }
    
    public void cambiarPanelVisualizarBalance(){
        contentPrincipal.removeAll();
        MenuVendedorVisualizarBalance nuevo = new MenuVendedorVisualizarBalance(database, this);
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        contentPrincipal.add(nuevo);
        repaint();
        revalidate(); 
    }
    
    public void cambiarPanelIngresarDinero(){
        contentPrincipal.removeAll();
        MenuVendedorIngresarDinero nuevo = new MenuVendedorIngresarDinero(database, this, id);
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        contentPrincipal.add(nuevo);
        repaint();
        revalidate(); 
    }
    
    public void cambiarPanelRetirarDinero(){
        contentPrincipal.removeAll();
        MenuVendedorRetirarDinero nuevo = new MenuVendedorRetirarDinero(database, this, id);
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        contentPrincipal.add(nuevo);
        repaint();
        revalidate(); 
    }
    public void cambiarPanelHistorialDeMovimientos(){
        contentPrincipal.removeAll();
        MenuVendedorHistorialCliente nuevo = new MenuVendedorHistorialCliente(database, this);
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        contentPrincipal.add(nuevo);
        repaint();
        revalidate(); 
    }
    
    public void cambiarPanelManejoDeDinero(){
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorManejoDeDinero nuevo = new MenuVendedorManejoDeDinero(this);
        
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
        MenuVendedorSolicitudCreditos nuevo = new MenuVendedorSolicitudCreditos(database, id);
        
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
        cambiarPanelManejoDeDinero();
    }//GEN-LAST:event_btnManejoDineroActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
        
        new InicioSesion(database);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        //Eliminar contenido actual
        contentPrincipal.removeAll();
        
        //Crear una instancia del nuevo contenedor
        MenuVendedorHistorialSucursal nuevo = new MenuVendedorHistorialSucursal(database, id);
        
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        
        //Agregar el nuevo contenedor dentro del contenedor principal
        
        contentPrincipal.add(nuevo);
        //Renderizar la ventana
        
        revalidate();
        repaint();
    }//GEN-LAST:event_btnHistorialActionPerformed

    

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
