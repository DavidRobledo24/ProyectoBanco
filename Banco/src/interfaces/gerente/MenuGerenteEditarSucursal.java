package interfaces.gerente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.ConexionBD;

public class MenuGerenteEditarSucursal extends javax.swing.JFrame {
    
    ConexionBD database;
    JFrame ventanaAnterior;
    MenuGerenteDetalleSucursal ventanaActual;
    String id;
    
    public MenuGerenteEditarSucursal(ConexionBD database, JFrame ventanaAnterior, MenuGerenteDetalleSucursal ventanaActual, String id) {
        this.database = database;
        this.ventanaAnterior = ventanaAnterior;
        this.ventanaActual = ventanaActual;
        this.id = id;
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        fieldNombre.setText(database.darDatoSucursal(id, "nombre"));
        fieldDireccion.setText(database.darDatoSucursal(id, "direccion"));
        fieldTelefono.setText(database.darDatoSucursal(id, "telefono"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldTelefono = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar sucursal");

        jPanel1.setBackground(new java.awt.Color(39, 64, 115));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dirección");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teléfono");

        botonCancelar.setBackground(new java.awt.Color(116, 16, 35));
        botonCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonEditar.setBackground(new java.awt.Color(51, 102, 255));
        botonEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1))
                            .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
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

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        ventanaAnterior.setEnabled(true);
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        String nombre = fieldNombre.getText();
        String direccion = fieldDireccion.getText();
        String telefono = fieldTelefono.getText();
        
        Pattern numRegex = Pattern.compile("\\d+");
        
        Matcher matcherTelefono = numRegex.matcher(telefono);
        
        boolean matchTelefono = matcherTelefono.find();
        
        if(!nombre.equals("") && !direccion.equals("") && matchTelefono){
            if(database.editarSucursal(id, nombre, direccion, telefono)){
                JOptionPane.showMessageDialog(null, "Sucursal editada con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                ventanaAnterior.setEnabled(true);
                ventanaActual.actualizarDatos();
                dispose();
            }
            else JOptionPane.showMessageDialog(null, "Error grave", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String errores = "";
            errores+=!nombre.equals("") ? "" : "*Nombre vacio";
            errores+=(!errores.equals("") && direccion.equals("") ? "\n" : "") + (!direccion.equals("") ? "" : "*Direccion vacia");
            errores+=(!errores.equals("") && !matchTelefono ? "\n" : "") + (matchTelefono ? "" : "*Solo ingrese numeros en el telefono");
            JOptionPane.showMessageDialog(null, errores, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
