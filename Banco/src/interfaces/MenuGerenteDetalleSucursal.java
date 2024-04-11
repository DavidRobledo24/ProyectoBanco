package interfaces;

import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import utils.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import utils.ButtonEditor;
import utils.ButtonRenderer;

public class MenuGerenteDetalleSucursal extends javax.swing.JPanel {

    ConexionBD database;
    DefaultTableModel modelo;
    
    Image iconoEditar;
    Image iconoEliminar;
    
    public MenuGerenteDetalleSucursal(String nombreSucursal, String direccionSucursal, String telefonoSucursal, ConexionBD database) {
        this.database = database;
        modelo = (DefaultTableModel)tablaVendedores.getModel();
        initComponents();
        initAlternComponents(nombreSucursal, direccionSucursal, telefonoSucursal);
    }

    private void initAlternComponents(String nombreSucursal, String direccionSucursal, String telefonoSucursal){
        labelNombreSucursal.setText(nombreSucursal);
        labelDireccionSucursal.setText(direccionSucursal);
        labelTelefonoSucursal.setText(telefonoSucursal);
        
        tablaVendedores.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaVendedores.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        
        tablaVendedores.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaVendedores.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        iconoEditar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/botonEditar.png")).getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        iconoEliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/botonEliminar.png")).getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        
        tablaVendedores.getColumnModel().getColumn(0).setPreferredWidth(1);
        tablaVendedores.getColumnModel().getColumn(1).setPreferredWidth(80);
        tablaVendedores.getColumnModel().getColumn(2).setPreferredWidth(80);
        tablaVendedores.getColumnModel().getColumn(3).setPreferredWidth(80);
        tablaVendedores.getColumnModel().getColumn(4).setPreferredWidth(80);
        tablaVendedores.getColumnModel().getColumn(5).setPreferredWidth(80);
        tablaVendedores.getColumnModel().getColumn(6).setPreferredWidth(80);
        
        
        actualizarTabla();
    }
    
    public void actualizarTabla(){
        modelo.setRowCount(0);
        try{
            String peticion = "SELECT * FROM vendedor";
            ResultSet vendedores = database.manipular.executeQuery(peticion);
            int contador = 1;
            if(vendedores.getRow() == 1){
                do{
                    JButton botonEditar = new JButton();
                    JButton botonEliminar = new JButton();
                    //TO-DO
                    modelo.addRow(new Object[]{contador, vendedores.getString("documento"), vendedores.getString("nombre"), vendedores.getString("telefono"), vendedores.getString("codigoAcceso")});
                }while(vendedores.next());
            }
            else{
                System.out.println("Tabla vacia");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombreSucursal = new javax.swing.JLabel();
        labelDireccionSucursal = new javax.swing.JLabel();
        labelTelefonoSucursal = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        botonAgregarVendedor = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        labelBalanceSucursal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(39, 64, 115));

        labelNombreSucursal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        botonEliminar.setBackground(new java.awt.Color(116, 16, 35));
        botonEliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("ELIMINAR");

        botonEditar.setBackground(new java.awt.Color(51, 102, 255));
        botonEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonEditar.setText("EDITAR");

        tablaVendedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Documento", "Nombre", "Telefono", "Codigo de acceso", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVendedores);

        botonAgregarVendedor.setBackground(new java.awt.Color(101, 132, 65));
        botonAgregarVendedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonAgregarVendedor.setText("Agregar vendedor");

        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("<-       Atrás           ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefonoSucursal)
                    .addComponent(labelDireccionSucursal)
                    .addComponent(labelNombreSucursal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(botonAgregarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelBalanceSucursal)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDireccionSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(labelTelefonoSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBalanceSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarVendedor;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBalanceSucursal;
    private javax.swing.JLabel labelDireccionSucursal;
    private javax.swing.JLabel labelNombreSucursal;
    private javax.swing.JLabel labelTelefonoSucursal;
    private javax.swing.JTable tablaVendedores;
    // End of variables declaration//GEN-END:variables
}
