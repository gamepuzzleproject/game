/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crosstheriver;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.MenuComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author nosai
 */
public class GamePlay extends javax.swing.JFrame {

    private int isEmpty = 0;
    public int xLabel = 0;
    public int yLabel = 0;

    /**
     * Creates new form GamePlay
     */
    public GamePlay() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boatContainerPanel = new javax.swing.JPanel();
        Boat = new javax.swing.JLabel();
        objectOnBoat = new javax.swing.JLabel();
        farmerOnBoat = new javax.swing.JLabel();
        farmerLabel = new javax.swing.JLabel();
        wolfLabel = new javax.swing.JLabel();
        goatLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        boatContainerPanel.setBackground(new java.awt.Color(204, 255, 255));
        boatContainerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boatContainerPanelMouseClicked(evt);
            }
        });
        boatContainerPanel.setLayout(null);

        Boat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crosstheriver/boat (4).png"))); // NOI18N
        boatContainerPanel.add(Boat);
        Boat.setBounds(20, 80, 280, 130);

        objectOnBoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                objectOnBoatMouseClicked(evt);
            }
        });
        boatContainerPanel.add(objectOnBoat);
        objectOnBoat.setBounds(160, 60, 100, 80);
        boatContainerPanel.add(farmerOnBoat);
        farmerOnBoat.setBounds(30, 0, 130, 160);

        jPanel1.add(boatContainerPanel);
        boatContainerPanel.setBounds(320, 420, 320, 210);

        farmerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crosstheriver/128Framer.png"))); // NOI18N
        farmerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                farmerLabelMouseClicked(evt);
            }
        });
        jPanel1.add(farmerLabel);
        farmerLabel.setBounds(20, 400, 90, 140);

        wolfLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crosstheriver/64wolf.png"))); // NOI18N
        wolfLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wolfLabelMouseClicked(evt);
            }
        });
        jPanel1.add(wolfLabel);
        wolfLabel.setBounds(110, 460, 80, 60);

        goatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crosstheriver/64boat.png"))); // NOI18N
        goatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goatLabelMouseClicked(evt);
            }
        });
        jPanel1.add(goatLabel);
        goatLabel.setBounds(170, 450, 70, 64);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 120, 73, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crosstheriver/1200x720.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, -270, 1930, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void farmerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_farmerLabelMouseClicked
        // TODO add your handling code here:

        farmerOnBoat.setIcon(farmerLabel.getIcon());
        farmerLabel.setIcon(null);


    }//GEN-LAST:event_farmerLabelMouseClicked

    private void objectOnBoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_objectOnBoatMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_objectOnBoatMouseClicked

    private void wolfLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wolfLabelMouseClicked
        // TODO add your handling code here:
        objectOnBoat.setIcon(wolfLabel.getIcon());
        wolfLabel.setIcon(null);
    }//GEN-LAST:event_wolfLabelMouseClicked

    private void goatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goatLabelMouseClicked
        // TODO add your handling code here:

        objectOnBoat.setIcon(goatLabel.getIcon());
        goatLabel.setIcon(null);
    }//GEN-LAST:event_goatLabelMouseClicked

    private void boatContainerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boatContainerPanelMouseClicked

        //boatContainerPanel.setLocation(boatContainerPanel.getLocation().x + 1, boatContainerPanel.getLocation().y);

    }//GEN-LAST:event_boatContainerPanelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Timer tm = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int xLabel = 320;
                int yLabel = 420;

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
                    xLabel+=5;
                    boatContainerPanel.setLocation(xLabel, yLabel);
                    boatContainerPanel.repaint();

               

            }
        });
        tm.start();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Boat;
    private javax.swing.JPanel boatContainerPanel;
    private javax.swing.JLabel farmerLabel;
    private javax.swing.JLabel farmerOnBoat;
    private javax.swing.JLabel goatLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel objectOnBoat;
    private javax.swing.JLabel wolfLabel;
    // End of variables declaration//GEN-END:variables
}
