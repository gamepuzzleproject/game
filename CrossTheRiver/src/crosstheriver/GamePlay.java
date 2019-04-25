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
import java.awt.event.MouseListener;
import javax.swing.Timer;

/**
 *
 * @author nosai
 */
public class GamePlay extends javax.swing.JFrame {

    private boolean position = true;//true->left.
    Timer tm;

    /**
     * Creates new form GamePlay
     */
    public GamePlay() {
        initComponents();

    }

    /*@Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        tm.start();
        
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        farmerLabel = new javax.swing.JLabel();
        wolfLabel = new javax.swing.JLabel();
        goatLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        boatContainerPane = new javax.swing.JLayeredPane();
        Boat = new javax.swing.JLabel();
        farmerOnBoat = new javax.swing.JLabel();
        objectOnBoat = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

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

        jButton1.setText("Move");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 120, 59, 40);

        Boat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crosstheriver/boat (4).png"))); // NOI18N
        boatContainerPane.add(Boat);
        Boat.setBounds(40, 120, 270, 130);
        boatContainerPane.add(farmerOnBoat);
        farmerOnBoat.setBounds(50, 30, 130, 160);

        objectOnBoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                objectOnBoatMouseClicked(evt);
            }
        });
        boatContainerPane.add(objectOnBoat);
        objectOnBoat.setBounds(190, 100, 100, 80);

        jPanel1.add(boatContainerPane);
        boatContainerPane.setBounds(320, 380, 330, 250);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

       Timer tm = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (boatContainerPane.getLocation().x != 720) {
                    boatContainerPane.setLocation(boatContainerPane.getLocation().x + 5, boatContainerPane.getLocation().y);

                }

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
    private javax.swing.JLayeredPane boatContainerPane;
    private javax.swing.JLabel farmerLabel;
    private javax.swing.JLabel farmerOnBoat;
    private javax.swing.JLabel goatLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel objectOnBoat;
    private javax.swing.JLabel wolfLabel;
    // End of variables declaration//GEN-END:variables
}
