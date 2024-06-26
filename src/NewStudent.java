
import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;

public class NewStudent extends javax.swing.JFrame {
    
    public void clear() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jComboBox1.removeAllItems();
        roomNumber();
    }
    
    // This method searches for room number and when its available allotes it.
    public void roomNumber() {
        int i = 0;
        try {
            Connection con = ConnectionProvider.getCon(); // establish connection with database
            Statement st = con.createStatement(); // creates statement
            ResultSet rs = st.executeQuery("select * from room where activate='Yes' and roomStatus='Not Booked'");
            while(rs.next()) {
                i = 1;
                jComboBox1.addItem(rs.getString(1));
            }
            // Incase we don't have any room Number free i = 0
            if (i == 0) {
                jButton2.setVisible(false);
                JOptionPane.showMessageDialog(null, "All Rooms are already Booked");
                setVisible(false);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Creates new form NewStudent
     */
    public NewStudent() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close all jframe.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel1.setText("Mobile Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 42, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 88, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 134, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel4.setText("Mother Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 226, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel6.setText("Permanent Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 272, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel7.setText("College Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 318, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel8.setText("Enrollment Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 364, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel9.setText("Room Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 410, -1, -1));

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 39, 325, -1));

        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 85, 325, -1));

        jTextField3.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 131, 325, -1));

        jTextField4.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 177, 325, -1));

        jTextField5.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 223, 325, -1));

        jTextField6.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 269, 325, -1));

        jTextField7.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 315, 325, -1));

        jTextField8.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 361, 325, -1));

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 407, 325, -1));

        jButton2.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 451, -1, -1));

        jButton3.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 451, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pages_background.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        roomNumber();
    }//GEN-LAST:event_formComponentShown

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // ActionPerformed code for exit button
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Code to savae new Student data in database
        String mobileNumber = jTextField1.getText();
        String name = jTextField2.getText();
        String fatherName = jTextField3.getText();
        String motherName = jTextField4.getText();
        String email = jTextField5.getText();
        String address = jTextField6.getText();
        String college = jTextField7.getText();
        String enrollment = jTextField8.getText();
        String roomNumber = (String)jComboBox1.getSelectedItem();
        String status = "living";
        
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, mobileNumber);
            ps.setString(2, name);
            ps.setString(3, fatherName);
            ps.setString(4, motherName);
            ps.setString(5, email);
            ps.setString(6, address);
            ps.setString(7, college);
            ps.setString(8, enrollment);
            ps.setString(9, roomNumber);
            ps.setString(10, status);
            ps.executeUpdate(); // will execute query
            
            // Database queries / code to update room status
            PreparedStatement ps1 = con.prepareStatement("update room set roomStatus='Booked' where number=?");
            ps1.setString(1, roomNumber);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            clear();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Code for the clear button to clear all the fields
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
