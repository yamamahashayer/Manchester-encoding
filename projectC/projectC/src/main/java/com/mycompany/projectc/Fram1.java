/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hp
 */
public class Fram1 extends javax.swing.JFrame {
 String data = "";
Graphics g;

    public Fram1() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel1.setText("Binary number :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(14, 35, 90, 21);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(115, 32, 208, 20);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jButton1.setText("select file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 30, 100, 20);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jButton2.setText("Genareat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(108, 70, 310, 28);

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setColumnHeaderView(null);
        jScrollPane2.setName(""); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(3);
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextArea2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jTextArea2ComponentMoved(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 220, 740, 140);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 740, 45);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel3.setText("data in binary:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 102, 21);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(660, 130, 90, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (jTextField1.getText().isEmpty())
       {
            JOptionPane.showMessageDialog(this, "Empty Fields!", "Error", JOptionPane.ERROR_MESSAGE);
                
       }
       data = "";
       for (int j = 0; j < jTextField1.getText().length(); j++) 
       {
        if (jTextField1.getText().charAt(j) != '0' && jTextField1.getText().charAt(j) != '1') 
         {
            JOptionPane.showMessageDialog(this, "Invalid Binary Data!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
         } 
         else 
         {
            data += jTextField1.getText().charAt(j) - 48;
         } 
        
       }
           jTextArea1.setText(data);
           System.out.println(data);
           
        
       
         
          
            g =jScrollPane2. getGraphics();
         
            int period = 40;
            for (int i = 0; i < data.length(); i++) {
                if (data.charAt(i) == '1') {
                    g.setColor(Color.blue);
                    g.drawString(data.charAt(i) + "", i * period + 14, 40);
                    g.drawLine(i * period, 100, i * period + 20, 100);
                    g.drawLine(i * period + 20, 100, i * period + 20, 60);
                    g.drawLine(i * period + 20, 60, i * period + 40, 60);
                }

                else if (data.charAt(i) == '0') {
                    g.setColor(Color.red);
                    g.drawString(data.charAt(i) + "", i * period + 14, 45);
                    g.drawLine(i * period, 60, i * period + 20, 60);
                    g.drawLine(i * period + 20, 60, i * period + 20, 100);
                    g.drawLine(i * period + 20, 100, i * period + 40, 100);
                }

                g.setColor(Color.black);
                if (i + 1 < data.length())
                    if (data.charAt(i) == data.charAt(i + 1))
                        g.drawLine(i * period + 40, 100, i * period + 40, 60);

                
                
            }
           
           
           System.out.println("yaamamama");
           
           
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        data="";
     
        jScrollPane2. repaint();
        jTextArea1.setText("");
         jTextField1.setText("");
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser choice = new JFileChooser(System.getProperty("user.dir"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents (*.txt)", "txt");
        choice.setFileFilter(filter);
        choice.setDialogTitle("Select a file to send");
        int option = choice.showOpenDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            File file = choice.getSelectedFile();
            byte[] fileData;
            try {
                fileData = Files.readAllBytes(file.toPath());
                FileInputStream in = new FileInputStream(file);
                in.read(fileData);
                in.close();
            }

            catch (IOException e) {
                JOptionPane.showMessageDialog(this, "File Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            data = "";
             byte b;
          for (int i=0;i<fileData.length-2;i++ )
          { 
              b=fileData[i];
             data += getBits(b);
          }
            System.out.println( data );

        }

        jTextArea1.setText(data);
        g =jScrollPane2. getGraphics();

        int period = 40;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '1') {
                g.setColor(Color.blue);
                g.drawString(data.charAt(i) + "", i * period + 14, 40);
                g.drawLine(i * period, 100, i * period + 20, 100);
                g.drawLine(i * period + 20, 100, i * period + 20, 60);
                g.drawLine(i * period + 20, 60, i * period + 40, 60);
            }

            else if (data.charAt(i) == '0') {
                g.setColor(Color.red);
                g.drawString(data.charAt(i) + "", i * period + 14, 45);
                g.drawLine(i * period, 60, i * period + 20, 60);
                g.drawLine(i * period + 20, 60, i * period + 20, 100);
                g.drawLine(i * period + 20, 100, i * period + 40, 100);
            }

            g.setColor(Color.black);
            if (i + 1 < data.length())
            if (data.charAt(i) == data.charAt(i + 1))
            g.drawLine(i * period + 40, 100, i * period + 40, 60);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextArea2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2ComponentMoved
    
    
    public String getBits(byte b) {
        String result = "";
        for (int i = 0; i < 8; i++)
            result += (b & (1 << i)) == 0 ? "0" : "1";

        return result;
    }
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
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fram1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
