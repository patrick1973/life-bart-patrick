/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DataAcces.Opslag;
import Models.SimulatieModel;

/**
 *
 * @author Bart Janisse
 */
public class SimulatieControllerView extends javax.swing.JPanel {

    SimulatieModel model;
    /**
     * Creates new form ControlPanel
     */
    public SimulatieControllerView() {
        initComponents();
    }
    
    public void setModel(SimulatieModel model) {
        this.model = model;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoadSimulation = new javax.swing.JButton();
        btnSaveSimultation = new javax.swing.JButton();
        btnStartSimulation = new javax.swing.JButton();
        btnNewSimulation = new javax.swing.JButton();
        btnPauzeSimulation = new javax.swing.JButton();
        btnExitSimulation = new javax.swing.JButton();
        jSliderSimulationSpeed = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        btnLoadSimulation.setText("Load simulatie");
        btnLoadSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadSimulationActionPerformed(evt);
            }
        });

        btnSaveSimultation.setText("Save simulatie");
        btnSaveSimultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSimultationActionPerformed(evt);
            }
        });

        btnStartSimulation.setText("Start simulatie");

        btnNewSimulation.setText("Nieuwe simulatie");

        btnPauzeSimulation.setText("Pauze simulatie");

        btnExitSimulation.setText("Exit ");
        btnExitSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitSimulationActionPerformed(evt);
            }
        });

        jSliderSimulationSpeed.setValue(0);
        jSliderSimulationSpeed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(" Simulatie snelheid ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaveSimultation, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnLoadSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPauzeSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnStartSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExitSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderSimulationSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoadSimulation)
                            .addComponent(btnNewSimulation)
                            .addComponent(btnStartSimulation))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPauzeSimulation)
                            .addComponent(btnSaveSimultation)
                            .addComponent(btnExitSimulation)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSliderSimulationSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadSimulationActionPerformed
        // TODO add your handling code here:
        
        Opslag opslag = new Opslag();
        
        model.setWereld(opslag.LoadWereld());
    }//GEN-LAST:event_btnLoadSimulationActionPerformed

    private void btnSaveSimultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSimultationActionPerformed
        // TODO add your handling code here:
        
        Opslag opslag = new Opslag();
        
        opslag.SaveWereld(model.getWereld());
    }//GEN-LAST:event_btnSaveSimultationActionPerformed

    private void btnExitSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitSimulationActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitSimulationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitSimulation;
    private javax.swing.JButton btnLoadSimulation;
    private javax.swing.JButton btnNewSimulation;
    private javax.swing.JButton btnPauzeSimulation;
    private javax.swing.JButton btnSaveSimultation;
    private javax.swing.JButton btnStartSimulation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider jSliderSimulationSpeed;
    // End of variables declaration//GEN-END:variables
}
