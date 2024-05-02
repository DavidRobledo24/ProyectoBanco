package interfaces.vendedor;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import utils.ConexionBD;

public class MenuVendedorIngresarDinero extends javax.swing.JPanel {
    
    ConexionBD database;
    MenuVendedorGeneral ventanaAnterior;
    String cuentaBancaria;
    String idSucursal;

    public MenuVendedorIngresarDinero(ConexionBD database, MenuVendedorGeneral ventanaAnterior, String idSucursal) {
        this.database = database;
        this.ventanaAnterior = ventanaAnterior;
        this.idSucursal = idSucursal;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqCuentaBancaria = new javax.swing.JLabel();
        campoCuentaBancaria = new javax.swing.JTextField();
        btnBuscarCuenta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoIngresarDinero = new javax.swing.JTextField();
        btnIngresarDinero = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        labelTitular = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(39, 64, 115));

        etqCuentaBancaria.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqCuentaBancaria.setForeground(new java.awt.Color(255, 255, 255));
        etqCuentaBancaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCuentaBancaria.setText("Cuenta Bancaria:");

        btnBuscarCuenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBuscarCuenta.setText("Buscar");
        btnBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etqCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCuentaBancaria, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(39, 64, 115));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dinero a ingresar:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Titular:");

        campoIngresarDinero.setBackground(new java.awt.Color(153, 153, 153));
        campoIngresarDinero.setEnabled(false);

        btnIngresarDinero.setBackground(new java.awt.Color(101, 132, 65));
        btnIngresarDinero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnIngresarDinero.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarDinero.setText("Ingresar");
        btnIngresarDinero.setEnabled(false);
        btnIngresarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDineroActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtras.setText("<- Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        labelTitular.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTitular.setForeground(new java.awt.Color(255, 255, 255));
        labelTitular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitular.setText("------------------------------------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 300, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoIngresarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(294, 294, 294))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnAtras)
                .addContainerGap(727, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIngresarDinero)
                        .addGap(368, 368, 368))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoIngresarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnIngresarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ventanaAnterior.cambiarPanelManejoDeDinero();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCuentaActionPerformed
        cuentaBancaria = campoCuentaBancaria.getText();
        if(cuentaBancaria.equals("")){
            JOptionPane.showMessageDialog(null, "Cuenta bancaria vacia", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String datoTemp = database.darDatoCuentaBancaria(cuentaBancaria, "idCuentaBancaria");
        if(datoTemp.equals("")){
            JOptionPane.showMessageDialog(null, "Cuenta bancaria no existe", "Error", JOptionPane.ERROR_MESSAGE);
            labelTitular.setText("------------------------------------");
            campoIngresarDinero.setText("");
            campoIngresarDinero.setEnabled(false);
            campoIngresarDinero.setBackground(new Color(153, 153, 153));
            btnIngresarDinero.setEnabled(false);
        }
        else{
            String documentoCliente = database.encontrarDocumentoCliente(cuentaBancaria);
            labelTitular.setText(database.darDatoCliente(documentoCliente, "nombre"));
            campoIngresarDinero.setText("");
            campoIngresarDinero.setEnabled(true);
            campoIngresarDinero.setBackground(new Color(255, 255, 255));
            btnIngresarDinero.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarCuentaActionPerformed

    private void btnIngresarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDineroActionPerformed
        String dinero = campoIngresarDinero.getText();
        int dineroInt = Integer.parseInt(dinero);
        dineroInt = dineroInt < 0 ? 0 : dineroInt;
        dinero = dineroInt+"";
        
        Pattern regex = Pattern.compile("\\d+");
        
        Matcher matcher = regex.matcher(dinero);
        
        boolean matchDinero = matcher.find();
        
        if(matchDinero){
            if(database.ingresarDinero(cuentaBancaria, dinero)){
                database.actualizarHistorial(cuentaBancaria, "cuentabancaria", "Deposito_"+dinero+"_No hay detalles");
                database.actualizarHistorial(idSucursal, "sucursal", "Deposito_"+dinero+"_Cuenta: "+cuentaBancaria);
                labelTitular.setText("------------------------------------");
                campoIngresarDinero.setText("");
                campoIngresarDinero.setEnabled(false);
                campoIngresarDinero.setBackground(new Color(153, 153, 153));
                btnIngresarDinero.setEnabled(false);
                campoCuentaBancaria.setText("");
                cuentaBancaria = "";
                JOptionPane.showMessageDialog(null, "Movimiento exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                System.out.println("ERROR DESCONOCIDO");
            }
        }
        else{
            
        }
    }//GEN-LAST:event_btnIngresarDineroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarCuenta;
    private javax.swing.JButton btnIngresarDinero;
    private javax.swing.JTextField campoCuentaBancaria;
    private javax.swing.JTextField campoIngresarDinero;
    private javax.swing.JLabel etqCuentaBancaria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitular;
    // End of variables declaration//GEN-END:variables
}
