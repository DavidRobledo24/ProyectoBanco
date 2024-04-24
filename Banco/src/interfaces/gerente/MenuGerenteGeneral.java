package interfaces.gerente;

import interfaces.InicioSesion;
import static java.awt.Color.white;
import utils.ConexionBD;


public class MenuGerenteGeneral extends javax.swing.JFrame {
    
    ConexionBD database;
    String documentoGerente;
    
    public MenuGerenteGeneral(ConexionBD database, String documentoGerente) {
        this.database = database;
        this.documentoGerente = documentoGerente;
        initComponents();
        initAlternComponets();
    }
    
    private void initAlternComponets(){
        
        btnCerrarSesion.setBackground(white);
        btnEstadisticas.setBackground(white);
        btnRevisarCreditos.setBackground(white);
        btnSucursales.setBackground(white);
        
        setVisible(true);
        setTitle("Menu");
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSucursales = new javax.swing.JButton();
        btnRevisarCreditos = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(39, 64, 115));

        btnSucursales.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSucursales.setText("Sucursales");
        btnSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalesActionPerformed(evt);
            }
        });

        btnRevisarCreditos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRevisarCreditos.setText("Revisar Creditos");
        btnRevisarCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarCreditosActionPerformed(evt);
            }
        });

        btnEstadisticas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(39, 64, 115));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRevisarCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(btnRevisarCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalesActionPerformed
        cambiarPanelSucursal();
    }//GEN-LAST:event_btnSucursalesActionPerformed

    public void cambiarPanelSucursal(){
       jPanel2.removeAll();
       MenuGerenteSucursales nuevo = new MenuGerenteSucursales(database, documentoGerente, this);
       nuevo.setSize(jPanel2.getSize());
       nuevo.setPreferredSize(jPanel2.getPreferredSize());
       jPanel2.add(nuevo);
       repaint();
       revalidate(); 
    }
    
    public void cambiarPanelDetalleSucursal(String id){
        jPanel2.removeAll();
        MenuGerenteDetalleSucursal nuevo = new MenuGerenteDetalleSucursal(database, this, id);
        nuevo.setSize(jPanel2.getSize());
        nuevo.setPreferredSize(jPanel2.getPreferredSize());
        jPanel2.add(nuevo);
        repaint();
        revalidate();
    }
    
    public void cambiarPanelAgregarSucursal(){
        jPanel2.removeAll();
        MenuGerenteAgregarSucursal nuevo = new MenuGerenteAgregarSucursal(database, this, documentoGerente);
        nuevo.setSize(jPanel2.getSize());
        nuevo.setPreferredSize(jPanel2.getPreferredSize());
        jPanel2.add(nuevo);
        repaint();
        revalidate();
    }
    
    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        jPanel2.removeAll();
        MenuGerenteEstadisticas nuevo = new MenuGerenteEstadisticas(database, this);
        nuevo.setSize(jPanel2.getSize());
        nuevo.setPreferredSize(jPanel2.getPreferredSize());
        jPanel2.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
        
        new InicioSesion(database);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRevisarCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarCreditosActionPerformed
        jPanel2.removeAll();
        MenuGerenteRevisarCreditos nuevo = new MenuGerenteRevisarCreditos(database);
        nuevo.setSize(840, 226);
        nuevo.setPreferredSize(jPanel2.getPreferredSize());
        jPanel2.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btnRevisarCreditosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnRevisarCreditos;
    private javax.swing.JButton btnSucursales;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
