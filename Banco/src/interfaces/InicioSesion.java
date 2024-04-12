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
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldDocumento = new javax.swing.JTextField();
        fieldCodigoDeAcceso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(39, 64, 115));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banco");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Documento:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldCodigoDeAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldCodigoDeAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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
            if(database.encontrarLogin("gerente", documentoTemp, codigoDeAccesoTemp)){
                new MenuGerenteGeneral();
//            try{
//                String peticion = "SELECT * FROM gerente";
//                ResultSet gerentes = database.manipular.executeQuery(peticion);
//                gerentes.next();
//                boolean encontrado = false;
//                if(gerentes.getRow() == 1){
//                    do{
//                        if(gerentes.getString("documento").equals(documentoTemp)){
//                            encontrado = true;
//                            if(gerentes.getString("codigoAcceso").equals(codigoDeAccesoTemp)) {
//                                botonIngresar.addActionListener(new ActionListener() {
//                                    @Override
//                                    public void actionPerformed(ActionEvent e) {
//                                        MenuGerenteGeneral ventana = new MenuGerenteGeneral(database);
//                                    }
//                                });
//                            }
//                            else JOptionPane.showMessageDialog(null, "Codigo de acceso incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
//                            break;
//                        }
//                    }while(gerentes.next());
//                    if(!encontrado) JOptionPane.showMessageDialog(null, "No se ha encontrado el documento", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//                else{
//                    JOptionPane.showMessageDialog(null, "No hay gerentes registrados", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
            else if(database.encontrarLogin("vendedor", documentoTemp, codigoDeAccesoTemp)){
                new MenuVendedorGeneral();
            }
            //ARREGLAR
        }
        else{
            JOptionPane.showMessageDialog(null, (matchDocumento ? "" : "* Documento debe contener almenos 5 numeros") + (matchCodigoDeAcceso ? "" : "\n* Codigo de acceso debe contener almenos 5 numeros"), "Error", JOptionPane.ERROR_MESSAGE);
        }
//        JOptionPane.showMessageDialog(null, "Error", "Error!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botonIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JTextField fieldCodigoDeAcceso;
    private javax.swing.JTextField fieldDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
