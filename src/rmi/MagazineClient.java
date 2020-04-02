/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rmi.AllMagazines;
import rmi.AllMagazines;
import rmi.IMagazine;
import rmi.IMagazine;
import thread.CountdownThread;

/**
 *
 * @author ADMIN
 */
public class MagazineClient extends javax.swing.JFrame {
    AllMagazines allMaz;
    IMagazine iMagazine;
    Vector data = new Vector();
    Vector<String> header = new Vector<>();
    
    /**
     * Creates new form MagazineClient
     */
    public MagazineClient() {
        initComponents();
        header.add("Magazine ID");
        header.add("Title");
        header.add("Publisher");
        header.add("Price");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBtn = new javax.swing.JPanel();
        btnGetAll = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaz = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 300));

        pBtn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5));

        btnGetAll.setText("Get All");
        btnGetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllActionPerformed(evt);
            }
        });
        pBtn.add(btnGetAll);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pBtn.add(btnExit);

        getContentPane().add(pBtn, java.awt.BorderLayout.PAGE_END);

        pTable.setLayout(new java.awt.GridLayout(1, 0));

        tableMaz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Magazine ID", "Title", "Publisher", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMaz);
        if (tableMaz.getColumnModel().getColumnCount() > 0) {
            tableMaz.getColumnModel().getColumn(0).setResizable(false);
            tableMaz.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableMaz.getColumnModel().getColumn(1).setResizable(false);
            tableMaz.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableMaz.getColumnModel().getColumn(2).setResizable(false);
            tableMaz.getColumnModel().getColumn(2).setPreferredWidth(120);
            tableMaz.getColumnModel().getColumn(3).setResizable(false);
            tableMaz.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        pTable.add(jScrollPane1);

        getContentPane().add(pTable, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllActionPerformed
        // TODO add your handling code here:
        try {
            iMagazine = (IMagazine) Naming.lookup("rmi://localhost:5001/MagazineServer");
            allMaz = iMagazine.getAllMagazines();
            data = allMaz.getAllMagazines();
        
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel) this.tableMaz.getModel();
            tblModel.setDataVector(data, header);

            jScrollPane1.setViewportView(tableMaz);
            if (tableMaz.getColumnModel().getColumnCount() > 0) {
                tableMaz.getColumnModel().getColumn(0).setPreferredWidth(30);
                tableMaz.getColumnModel().getColumn(1).setPreferredWidth(150);
                tableMaz.getColumnModel().getColumn(2).setPreferredWidth(120);
                tableMaz.getColumnModel().getColumn(3).setPreferredWidth(50);
            }

            pTable.add(jScrollPane1);
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            Logger.getLogger(MagazineClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnGetAllActionPerformed
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MagazineClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MagazineClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MagazineClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MagazineClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MagazineClient().setVisible(true);
            }
        });
        
        CountdownThread counter = new CountdownThread("Client");
        Thread thread = new Thread(counter);
        thread.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGetAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pBtn;
    private javax.swing.JPanel pTable;
    private javax.swing.JTable tableMaz;
    // End of variables declaration//GEN-END:variables
}