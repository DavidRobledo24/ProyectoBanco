package interfaces.gerente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.ConexionBD;

public class MenuGerenteEditarVendedor extends javax.swing.JFrame {

    JFrame ventanaAnterior;
    MenuGerenteDetalleSucursal ventanaActual;
    ConexionBD database;
    
    String documento;
    
    public MenuGerenteEditarVendedor(JFrame ventanaAnterior, String documento, ConexionBD database, MenuGerenteDetalleSucursal ventanaActual) {
        this.ventanaAnterior = ventanaAnterior;
        this.documento = documento;
        this.database = database;
        this.ventanaActual = ventanaActual;
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        labelDocumentoVendedor.setText(documento);
        fieldNombre.setText(database.darDatoVendedor(documento, "nombre"));
        fieldTelefono.setText(database.darDatoVendedor(documento, "telefono"));
        fieldCodigoAcceso.setText(database.darDatoVendedor(documento, "codigoAcceso"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldCodigoAcceso = new javax.swing.JTextField();
        botonEditar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        labelDocumentoVendedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 64, 115));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Documento");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo de acceso");

        botonEditar.setBackground(new java.awt.Color(51, 102, 255));
        botonEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(116, 16, 35));
        botonCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        labelDocumentoVendedor.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        labelDocumentoVendedor.setForeground(new java.awt.Color(153, 153, 153));
        labelDocumentoVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel1))
                            .addComponent(fieldCodigoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4))
                            .addComponent(labelDocumentoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDocumentoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(fieldCodigoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        String nombre = fieldNombre.getText();
        String telefono = fieldTelefono.getText();
        String codigoAcceso = fieldCodigoAcceso.getText();
        
        Pattern numRegex = Pattern.compile("\\d+");
        Pattern charRegex = Pattern.compile("[A-z]+");
        
        Matcher matcherDocumento = numRegex.matcher(documento);
        Matcher matcherNombre = charRegex.matcher(nombre);
        Matcher matcherTelefono = numRegex.matcher(telefono);
        Matcher matcherCodigoAcceso = numRegex.matcher(codigoAcceso);
        
        boolean matchDocumento = matcherDocumento.find();
        boolean matchNombre = matcherNombre.find();
        boolean matchTelefono = matcherTelefono.find();
        boolean matchCodigoAcceso = matcherCodigoAcceso.find();
        
        if(matchDocumento && matchNombre && matchTelefono && matchCodigoAcceso){
            if(database.editarVendedor(documento, nombre, telefono, codigoAcceso)){
                ventanaAnterior.setEnabled(true);
                ventanaActual.actualizarTabla();
                dispose();
            }
        }
        else{
            String errores = "";
            errores+=matchDocumento ? "" : "*Solo ingrese numeros en el documento";
            errores+=(!errores.equals("") && !matchNombre ? "\n" : "") + (matchNombre ? "" : "*Solo ingrese caracteres en el nombre");
            errores+=(!errores.equals("") && !matchTelefono ? "\n" : "") + (matchTelefono ? "" : "*Solo ingrese numeros en el telefono");
            errores+=(!errores.equals("") && !matchCodigoAcceso ? "\n" : "") + (matchCodigoAcceso ? "" : "*Solo ingrese numeros en el codigo de acceso");
            JOptionPane.showMessageDialog(null, errores, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        ventanaAnterior.setEnabled(false);
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JTextField fieldCodigoAcceso;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDocumentoVendedor;
    // End of variables declaration//GEN-END:variables
}
