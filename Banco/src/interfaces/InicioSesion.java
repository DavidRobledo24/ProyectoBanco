package interfaces;

import interfaces.gerente.MenuGerenteGeneral;
import interfaces.vendedor.MenuVendedorGeneral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import utils.ConexionBD;
import java.sql.SQLException;
import java.sql.ResultSet;

public class InicioSesion extends javax.swing.JFrame {

    ConexionBD database;
    
    public InicioSesion(ConexionBD database) {
        this.database = database;
        initComponents();
        radioGerente.setActionCommand("gerente");
        radioVendedor.setActionCommand("vendedor");
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    private void activarCampos(){
        fieldDocumento.setEnabled(true);
        fieldCodigoDeAcceso.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldDocumento = new javax.swing.JTextField();
        fieldCodigoDeAcceso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        radioGerente = new javax.swing.JRadioButton();
        radioVendedor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(39, 64, 115));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banco");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Documento:");

        fieldDocumento.setEnabled(false);

        fieldCodigoDeAcceso.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo de acceso:");

        botonIngresar.setBackground(new java.awt.Color(101, 132, 65));
        botonIngresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        radioGerente.setBackground(new java.awt.Color(39, 64, 115));
        grupoBotones.add(radioGerente);
        radioGerente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioGerente.setForeground(new java.awt.Color(255, 255, 255));
        radioGerente.setText("Gerente");
        radioGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGerenteActionPerformed(evt);
            }
        });

        radioVendedor.setBackground(new java.awt.Color(39, 64, 115));
        grupoBotones.add(radioVendedor);
        radioVendedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioVendedor.setForeground(new java.awt.Color(255, 255, 255));
        radioVendedor.setText("Vendedor");
        radioVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(radioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(radioVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldCodigoDeAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(205, 205, 205))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioVendedor)
                    .addComponent(radioGerente))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldCodigoDeAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
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

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        String documentoTemp = fieldDocumento.getText();
        String codigoDeAccesoTemp = fieldCodigoDeAcceso.getText();
        

        Pattern regex = Pattern.compile("\\d\\d\\d\\d\\d+");
        
        Matcher matcherDocumento = regex.matcher(documentoTemp);
        Matcher matcherCodigoDeAcceso = regex.matcher(codigoDeAccesoTemp);
        
        boolean matchDocumento = matcherDocumento.find();
        boolean matchCodigoDeAcceso = matcherCodigoDeAcceso.find();
        
        if(matchDocumento && matchCodigoDeAcceso){
            String seleccionRadio = grupoBotones.getSelection().getActionCommand();
            if(database.encontrarLogin(seleccionRadio, documentoTemp, codigoDeAccesoTemp)){
                if(seleccionRadio.equals("gerente")){
                    new MenuGerenteGeneral(database);
                    dispose();
                }
                else{
                    new MenuVendedorGeneral();
                    dispose();
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, (matchDocumento ? "" : "* Documento debe contener almenos 5 numeros") + (matchCodigoDeAcceso ? "" : "\n* Codigo de acceso debe contener almenos 5 numeros"), "Error", JOptionPane.ERROR_MESSAGE);
        }
//        JOptionPane.showMessageDialog(null, "Error", "Error!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void radioVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVendedorActionPerformed
        activarCampos();
    }//GEN-LAST:event_radioVendedorActionPerformed

    private void radioGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGerenteActionPerformed
        activarCampos();
    }//GEN-LAST:event_radioGerenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JTextField fieldCodigoDeAcceso;
    private javax.swing.JTextField fieldDocumento;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioGerente;
    private javax.swing.JRadioButton radioVendedor;
    // End of variables declaration//GEN-END:variables
}
