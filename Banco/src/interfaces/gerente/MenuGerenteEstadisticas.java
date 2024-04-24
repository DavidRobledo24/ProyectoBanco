package interfaces.gerente;

import utils.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class MenuGerenteEstadisticas extends javax.swing.JPanel {
    
    ConexionBD database;
    MenuGerenteGeneral ventanaActual;
    
    public MenuGerenteEstadisticas(ConexionBD database, MenuGerenteGeneral ventanaActual) {
        this.database = database;
        this.ventanaActual = ventanaActual;
        initComponents();
        initAlternComponents();
    }
    
    private void initAlternComponents(){
        Estadisticas();
        
    }
    
    public void Estadisticas() {
        Map<String, Double> sucursales = new HashMap<>();
        database.llenarEstadisticas(sucursales);
        
        sucursalConMasDinero(sucursales);
        sucursalConMenosDinero(sucursales);
        mostrarSumaBalances(sucursales);
    }
    
    public void sucursalConMasDinero(Map<String, Double> sucursales) {
        double mayorBalance = Double.MIN_VALUE;
        String nomSucursal = null;

        for (Map.Entry<String, Double> entry : sucursales.entrySet()) {
            String sucursal = entry.getKey();
            double balance = entry.getValue();
            if (balance > mayorBalance) {
                mayorBalance = balance;
                nomSucursal = sucursal;
            }
        }

        if (nomSucursal != null) {
            etqMasDinero.setText(nomSucursal +" Saldo: $" + mayorBalance);
            System.out.println("La sucursal con el mayor balance es: " + nomSucursal);
        } else {
            System.out.println("No hay sucursales en el mapa.");
        }
    }
    
    public void sucursalConMenosDinero(Map<String, Double> sucursales) {
    double menorbalance = Double.MAX_VALUE;
    String nomSucursal1 = null;
    
    for (Map.Entry<String, Double> entry : sucursales.entrySet()) {
        String sucursal = entry.getKey();
        double balance = entry.getValue();
        if (balance < menorbalance) {
            menorbalance = balance;
            nomSucursal1 = sucursal;
        }
    }
    
    if (nomSucursal1 != null) {
        etqMenosDinero1.setText(nomSucursal1 +" Saldo: $" + menorbalance);
        System.out.println("La sucursal con el menor balance es: " + nomSucursal1);
    } else {
        System.out.println("No hay sucursales en el mapa.");
    }
}
    
    public void mostrarSumaBalances(Map<String, Double> sucursales) {
    double sumaBalances = 0.0;
    for (double balance : sucursales.values()) {
        sumaBalances += balance;
    }

    etqMenosDinero2.setText("$"+sumaBalances);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etqMasDinero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etqMenosDinero1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etqMenosDinero2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(39, 64, 152));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sucursal con mas dinero:");

        etqMasDinero.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        etqMasDinero.setForeground(new java.awt.Color(255, 255, 255));
        etqMasDinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMasDinero.setText("----------------------------------");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sucursal con menos dinero:");

        etqMenosDinero1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        etqMenosDinero1.setForeground(new java.awt.Color(255, 255, 255));
        etqMenosDinero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenosDinero1.setText("----------------------------------");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total dinero del banco:");

        etqMenosDinero2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        etqMenosDinero2.setForeground(new java.awt.Color(255, 255, 255));
        etqMenosDinero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenosDinero2.setText("----------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqMenosDinero2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqMenosDinero1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqMasDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqMasDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqMenosDinero1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqMenosDinero2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqMasDinero;
    private javax.swing.JLabel etqMenosDinero1;
    private javax.swing.JLabel etqMenosDinero2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
