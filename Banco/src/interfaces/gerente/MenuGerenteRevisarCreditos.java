package interfaces.gerente;

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
        
        int cantCreditos = database.contarCreditos(documentoGerente);
        
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
