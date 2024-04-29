package interfaces.gerente;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import utils.ConexionBD;


public class MenuGerenteRevisarCreditos extends javax.swing.JPanel {

    ConexionBD database;
    String documentoGerente;
    MenuGerenteGeneral ventanaAnterior;
    
    public MenuGerenteRevisarCreditos(ConexionBD database, String documentoGerente, MenuGerenteGeneral ventanaAnterior) {
        this.database = database;
        this.documentoGerente = documentoGerente;
        this.ventanaAnterior = ventanaAnterior;
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents(){
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        
        int cantCreditos = database.contarCreditos(documentoGerente).length;
        int altoVentana = cantCreditos < 2 ? 550 : ((cantCreditos - 2) * 226) + 550;
        
        panelCreditos.setLayout(new GridBagLayout());
        GridBagConstraints r = new GridBagConstraints();
        r.fill = GridBagConstraints.HORIZONTAL;
        r.gridwidth = 1;
        r.gridheight = 1;
        r.gridy = 0;
        r.gridx = 0;
        r.weightx = 1;
        r.weighty = 1;
        r.anchor = GridBagConstraints.NORTH;
        
        panelCreditos.setPreferredSize(new Dimension(810, altoVentana));
        if(cantCreditos > 0){
            BotonMenuGerenteCreditos[] vectorSucursales = database.darCreditos(documentoGerente);
            for(int i = 0; i < cantCreditos; i++){
                vectorSucursales[i].setSize(810, 226);
                vectorSucursales[i].setPreferredSize(new Dimension(810, 226));
                panelCreditos.add(vectorSucursales[i], r);
                r.gridy++;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelCreditos = new javax.swing.JPanel();

        setBackground(new java.awt.Color(39, 64, 115));

        panelCreditos.setBackground(new java.awt.Color(39, 64, 115));

        javax.swing.GroupLayout panelCreditosLayout = new javax.swing.GroupLayout(panelCreditos);
        panelCreditos.setLayout(panelCreditosLayout);
        panelCreditosLayout.setHorizontalGroup(
            panelCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        panelCreditosLayout.setVerticalGroup(
            panelCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelCreditos);

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
    private javax.swing.JPanel panelCreditos;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
