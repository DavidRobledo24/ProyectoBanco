package interfaces.gerente;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import utils.ConexionBD;


public class MenuGerenteSucursales extends javax.swing.JPanel {

    ConexionBD database;
    String documentoGerente;
    MenuGerenteGeneral ventanaAnterior;
    
    public MenuGerenteSucursales(ConexionBD database, String documentoGerente, MenuGerenteGeneral ventanaAnterior) {
        this.database = database;
        this.documentoGerente = documentoGerente;
        this.ventanaAnterior = ventanaAnterior;
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents(){
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        int cantSucursales = database.contarSucursales(documentoGerente);
        int altoVentana = cantSucursales < 2 ? 550 : ((cantSucursales - 2) * 180) + 550;
        
        panelSucursales.setLayout(new GridBagLayout());
        GridBagConstraints r = new GridBagConstraints();
        r.fill = GridBagConstraints.HORIZONTAL;
        r.gridwidth = 1;
        r.gridheight = 1;
        r.gridy = 0;
        r.gridx = 0;
        r.weightx = 1;
        r.weighty = 1;
        r.anchor = GridBagConstraints.NORTH;
//        r.insets = new Insets(0, 5, 0, 5);
        
        panelSucursales.setPreferredSize(new Dimension(810, altoVentana));
        if(cantSucursales > 0){
            BotonMenuGerenteSucursal[] vectorSucursales = database.darSucursales(cantSucursales, documentoGerente, ventanaAnterior);
            for(int i = 0; i < cantSucursales; i++){
                vectorSucursales[i].setSize(810, 180);
                vectorSucursales[i].setPreferredSize(new Dimension(810, 180));
                panelSucursales.add(vectorSucursales[i], r);
                r.gridy++;
            }
        }
        BotonMenuGerenteSucursalAgregar botonAgregar = new BotonMenuGerenteSucursalAgregar(ventanaAnterior);
        botonAgregar.setSize(810, 180);
        botonAgregar.setPreferredSize(new Dimension(810, 180));
//        r.insets = new Insets(3, 1, 3, 1);
        r.fill = GridBagConstraints.BOTH;
        panelSucursales.add(botonAgregar, r);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelSucursales = new javax.swing.JPanel();

        setBackground(new java.awt.Color(39, 64, 115));

        panelSucursales.setBackground(new java.awt.Color(39, 64, 115));

        javax.swing.GroupLayout panelSucursalesLayout = new javax.swing.GroupLayout(panelSucursales);
        panelSucursales.setLayout(panelSucursalesLayout);
        panelSucursalesLayout.setHorizontalGroup(
            panelSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        panelSucursalesLayout.setVerticalGroup(
            panelSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelSucursales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelSucursales;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
