package interfaces.gerente;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import utils.ConexionBD;


public class MenuGerenteSucursales extends javax.swing.JPanel {

    ConexionBD database;
    
    public MenuGerenteSucursales(ConexionBD database) {
        this.database = database;
        
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents(){
//        JPanel panelCosas = new JPanel();
        panelCosas.setLayout(new GridLayout());
//        panelCosas.setSize(new Dimension(840, 580));
        panelCosas.setPreferredSize(new Dimension(740, 480));
//        JScrollPane scroll = new JScrollPane(panelCosas);
//        panelCosas.setAutoscrolls(true);
//        scroll.setPreferredSize(new Dimension(840, 580));
        for(int i = 0; i < 1000; i++){
            panelCosas.add(new JButton(i+""));
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelCosas = new javax.swing.JPanel();

        setBackground(new java.awt.Color(39, 64, 115));

        panelCosas.setBackground(new java.awt.Color(39, 64, 115));

        javax.swing.GroupLayout panelCosasLayout = new javax.swing.GroupLayout(panelCosas);
        panelCosas.setLayout(panelCosasLayout);
        panelCosasLayout.setHorizontalGroup(
            panelCosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        panelCosasLayout.setVerticalGroup(
            panelCosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelCosas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCosas;
    // End of variables declaration//GEN-END:variables
}
