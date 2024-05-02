package interfaces.vendedor;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import utils.ConexionBD;


public class MenuVendedorEditarCliente extends javax.swing.JPanel {

    ConexionBD database; 
    MenuVendedorGeneral ventana;
    String documentoABuscar;
    
    public MenuVendedorEditarCliente(MenuVendedorGeneral ventana, ConexionBD database) {
        this.ventana = ventana;
        this.database = database; 
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
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(255, 255, 255));
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("Nombre:");

        campoNombre.setBackground(new java.awt.Color(153, 153, 153));
        campoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoNombre.setEnabled(false);

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTelefono.setText("Telefono:");

        campoTelefono.setBackground(new java.awt.Color(153, 153, 153));
        campoTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoTelefono.setEnabled(false);

        etqEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(255, 255, 255));
        etqEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqEmail.setText("Email:");

        campoEmail.setBackground(new java.awt.Color(153, 153, 153));
        campoEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoEmail.setEnabled(false);

        etqClave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqClave.setForeground(new java.awt.Color(255, 255, 255));
        etqClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqClave.setText("Clave:");

        campoClave.setBackground(new java.awt.Color(153, 153, 153));
        campoClave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoClave.setEnabled(false);

        btnAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        documentoABuscar = campoDocumento.getText();
        
        if(documentoABuscar.equals("")){
            JOptionPane.showMessageDialog(null, "Documento vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String datoTemp = database.darDatoCliente(documentoABuscar, "nombre");
        
        if(datoTemp.equals("")){
            campoNombre.setText("");
            campoNombre.setBackground(new Color(153,153,153));
            campoNombre.setEnabled(false);
            campoTelefono.setText("");
            campoTelefono.setBackground(new Color(153,153,153));
            campoTelefono.setEnabled(false);
            campoEmail.setText("");
            campoEmail.setBackground(new Color(153,153,153));
            campoEmail.setEnabled(false);
            campoClave.setText("");
            campoClave.setBackground(new Color(153,153,153));
            campoClave.setEnabled(false);
            btnEditar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Documento no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            campoNombre.setText(datoTemp);
            campoNombre.setBackground(new Color(255, 255, 255));
            campoNombre.setEnabled(true);
            
            campoTelefono.setText(database.darDatoCliente(documentoABuscar, "telefono"));
            campoTelefono.setBackground(new Color(255, 255, 255));
            campoTelefono.setEnabled(true);
            
            campoEmail.setText(database.darDatoCliente(documentoABuscar, "email"));
            campoEmail.setBackground(new Color(255, 255, 255));
            campoEmail.setEnabled(true);
            
            String cuentaBancaria = database.darDatoCliente(documentoABuscar, "idCuentaBancaria");
            campoClave.setText(database.darDatoCuentaBancaria(cuentaBancaria, "clave"));
            campoClave.setBackground(new Color(255, 255, 255));
            campoClave.setEnabled(true);
            btnEditar.setEnabled(true);
        } 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String nombre = campoNombre.getText();  
        String telefono = campoTelefono.getText();  
        String email = campoEmail.getText();
        String clave = campoClave.getText();
        
        Pattern regexNums = Pattern.compile("\\d");
        Pattern regexLetras = Pattern.compile("[A-Za-z]");
        Pattern regexCorreo = Pattern.compile(".+@.+\\..+");
        
        Matcher matcherNombre = regexLetras.matcher(nombre);
        Matcher matcherTelefono = regexNums.matcher(telefono);
        Matcher matcherEmail = regexCorreo.matcher(email);
        Matcher matcherClave = regexNums.matcher(clave);
        
        boolean matchNombre = matcherNombre.find();
        boolean matchTelefono = matcherTelefono.find();
        boolean matchEmail = matcherEmail.find();
        boolean matchClave = matcherClave.find();
        
        if(matchNombre && matchTelefono && matchEmail && matchClave){
            if(database.editarCliente(documentoABuscar, nombre, telefono, email, clave)){
                documentoABuscar = "";
                campoDocumento.setText("");
                campoNombre.setText("");
                campoNombre.setBackground(new Color(153,153,153));
                campoNombre.setEnabled(false);
                campoTelefono.setText("");
                campoTelefono.setBackground(new Color(153,153,153));
                campoTelefono.setEnabled(false);
                campoEmail.setText("");
                campoEmail.setBackground(new Color(153,153,153));
                campoEmail.setEnabled(false);
                campoClave.setText("");
                campoClave.setBackground(new Color(153,153,153));
                campoClave.setEnabled(false);
                btnEditar.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Editado con exito: ", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            String errores = "";
                errores+=(matchNombre ? "" : "*Solo ingrese letras en el nombre");
                errores+=(errores.equals("") && matchTelefono ? "" : "\n") + (matchTelefono ? "" : "*Solo ingrese numeros en el telefono");
                errores+=(errores.equals("") && matchEmail ? "" : "\n") + (matchEmail ? "" : "*Ingrese un email valido");
                errores+=(errores.equals("") && matchClave ? "" : "\n") + (matchClave ? "" : "*Solo ingrese numeros en la clave");
                JOptionPane.showMessageDialog(null, errores, "Error", JOptionPane.ERROR_MESSAGE);
        }

//        String cedulaAEditar = campoDocumento.getText();
//        String nombreNuevo = campoNombre.getText();
//        String telefonoNuevo = campoTelefono.getText();
//        String correoNuevo = campoEmail.getText();
//        String claveNueva = campoClave.getText();
//        database.editarCliente(cedulaAEditar,nombreNuevo,telefonoNuevo,correoNuevo,claveNueva);
//        
//        campoDocumento.setText("");
//        String datoTemp = campoDocumento.getText();
//        if(datoTemp.equals("")){
//            campoNombre.setText("");
//            campoNombre.setBackground(new Color(153,153,153));
//            campoNombre.setEnabled(false);
//            campoTelefono.setText("");
//            campoTelefono.setBackground(new Color(153,153,153));
//            campoTelefono.setEnabled(false);
//            campoEmail.setText("");
//            campoEmail.setBackground(new Color(153,153,153));
//            campoEmail.setEnabled(false);
//            campoClave.setText("");
//            campoClave.setBackground(new Color(153,153,153));
//            campoClave.setEnabled(false);
//            btnEditar.setEnabled(false);
//        }else{
//            campoNombre.setText(datoTemp);
//            campoNombre.setBackground(new Color(255, 255, 255));
//            campoNombre.setEnabled(true);
//            
//            campoTelefono.setText("");
//            campoTelefono.setBackground(new Color(255, 255, 255));
//            campoTelefono.setEnabled(true);
//            
//            campoEmail.setText("");
//            campoEmail.setBackground(new Color(255, 255, 255));
//            campoEmail.setEnabled(true);
//            campoClave.setText("");
//            
//            campoClave.setBackground(new Color(255, 255, 255));
//            campoClave.setEnabled(true);
//            btnEditar.setEnabled(true);
//        }
        
    }//GEN-LAST:event_btnEditarActionPerformed


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
