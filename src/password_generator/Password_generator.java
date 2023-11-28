/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password_generator;

import javax.swing.JOptionPane;

/**
 *
 * @author Hanseeka Dhingana
 */
public class Password_generator extends javax.swing.JFrame {

    /**
     * Creates new form Password_generator
     */
    public Password_generator() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label_title = new javax.swing.JLabel();
        label_length = new javax.swing.JLabel();
        check_symbol = new javax.swing.JCheckBox();
        check_number = new javax.swing.JCheckBox();
        check_smallLetter = new javax.swing.JCheckBox();
        check_capitalLetter = new javax.swing.JCheckBox();
        btn_generate = new javax.swing.JButton();
        txt_generate = new javax.swing.JTextField();
        txt_length = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(211, 229, 229));
        jPanel4.setLayout(null);

        label_title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        label_title.setText("Password Generator ");
        jPanel4.add(label_title);
        label_title.setBounds(99, 11, 341, 66);

        label_length.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label_length.setText("Enter Length for Password");
        jPanel4.add(label_length);
        label_length.setBounds(99, 88, 308, 33);

        check_symbol.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        check_symbol.setText("Special Character (!@#$%&*...)");
        check_symbol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_symbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_symbolActionPerformed(evt);
            }
        });
        jPanel4.add(check_symbol);
        check_symbol.setBounds(99, 319, 374, 37);

        check_number.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        check_number.setText("Number (0-9)");
        check_number.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_number.setName(""); // NOI18N
        check_number.setPreferredSize(new java.awt.Dimension(171, 50));
        check_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_numberActionPerformed(evt);
            }
        });
        jPanel4.add(check_number);
        check_number.setBounds(99, 187, 209, 44);

        check_smallLetter.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        check_smallLetter.setText("Small Letters (a-z)");
        check_smallLetter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_smallLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_smallLetterActionPerformed(evt);
            }
        });
        jPanel4.add(check_smallLetter);
        check_smallLetter.setBounds(99, 231, 242, 37);

        check_capitalLetter.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        check_capitalLetter.setText("Capital Letters (A-Z)");
        check_capitalLetter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_capitalLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_capitalLetterActionPerformed(evt);
            }
        });
        jPanel4.add(check_capitalLetter);
        check_capitalLetter.setBounds(99, 275, 253, 37);

        btn_generate.setBackground(new java.awt.Color(0, 51, 102));
        btn_generate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_generate.setForeground(new java.awt.Color(255, 255, 255));
        btn_generate.setText("Generate");
        btn_generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateActionPerformed(evt);
            }
        });
        jPanel4.add(btn_generate);
        btn_generate.setBounds(99, 374, 363, 44);

        txt_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_generateActionPerformed(evt);
            }
        });
        jPanel4.add(txt_generate);
        txt_generate.setBounds(99, 440, 363, 44);

        txt_length.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt_length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lengthActionPerformed(evt);
            }
        });
        jPanel4.add(txt_length);
        txt_length.setBounds(99, 121, 88, 33);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("_____________________________ ");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(99, 127, 363, 55);

        btn_clear.setBackground(new java.awt.Color(0, 51, 102));
        btn_clear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel4.add(btn_clear);
        btn_clear.setBounds(330, 495, 132, 33);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(33, 77, 550, 638);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_generator/lock_pic.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1298, 814);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        txt_generate.setText("");          txt_length.setText("");

        check_number.setSelected(false);      check_smallLetter.setSelected(false);
        check_capitalLetter.setSelected(false);    check_symbol.setSelected(false);

    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lengthActionPerformed

    private void txt_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_generateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_generateActionPerformed

    private void btn_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateActionPerformed

        int length=0;
        String printpass;
        if(txt_length.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the Length for password ");
        }
        else
        {
            length = Integer.valueOf(txt_length.getText());
            StringBuilder sb = new StringBuilder(length);

            String getChar = check();

            for(int i=0; i<length; i++)
            {
                int index = (int)(getChar.length() * Math.random());

                sb.append(getChar.charAt(index));

            }

            printpass=sb.toString();

            txt_generate.setText(printpass);

        }

    }//GEN-LAST:event_btn_generateActionPerformed

    private void check_capitalLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_capitalLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_capitalLetterActionPerformed

    private void check_smallLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_smallLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_smallLetterActionPerformed

    private void check_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_numberActionPerformed

    }//GEN-LAST:event_check_numberActionPerformed

    private void check_symbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_symbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_symbolActionPerformed

    private String check()
    {
        StringBuilder inputChar = new StringBuilder();
        if(check_number.isSelected() || check_smallLetter.isSelected() || check_capitalLetter.isSelected()
                || check_symbol.isSelected())
        {
               if(check_number.isSelected())
                   inputChar.append("012345689");
               
               if(check_smallLetter.isSelected())
                   inputChar.append("abcdefghijklmnopqrstuvwxyz");
               
               if(check_capitalLetter.isSelected())
                   inputChar.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
               
               if(check_symbol.isSelected())
                   inputChar.append("!@#$%&*...");
        }  
        else
        {
             JOptionPane.showMessageDialog(this,"Select Any one Character Set ");
        }
        
        return inputChar.toString();
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
            java.util.logging.Logger.getLogger(Password_generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password_generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password_generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password_generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password_generator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_generate;
    private javax.swing.JCheckBox check_capitalLetter;
    private javax.swing.JCheckBox check_number;
    private javax.swing.JCheckBox check_smallLetter;
    private javax.swing.JCheckBox check_symbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label_length;
    private javax.swing.JLabel label_title;
    private javax.swing.JTextField txt_generate;
    private javax.swing.JTextField txt_length;
    // End of variables declaration//GEN-END:variables
}
