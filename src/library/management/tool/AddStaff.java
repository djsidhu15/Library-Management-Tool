/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.tool;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author devac
 */
public class AddStaff extends javax.swing.JFrame {

    /**
     * Creates new form AddStaff
     */
    String JDBCdriver = "com.mysql.jdbc.Driver";
    String dbserver = "jdbc:mysql://localhost:3306/library?zeroDateTimeBehavior=convertToNull";
    String dbusername = "root";
    String dbpassword = "root";
    public AddStaff() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfstaffid = new javax.swing.JTextField();
        tfname = new javax.swing.JTextField();
        badd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Staff detail :");

        jLabel2.setText("Staff id :");

        jLabel3.setText("Staff name :");

        badd.setText("Add");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfstaffid)
                            .addComponent(tfname, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(badd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstaffid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(48, 48, 48)
                .addComponent(badd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(116, 116, 116))
        );

        jLabel1.setFont (jLabel1.getFont().deriveFont (22.0f));
        jLabel2.setFont (jLabel2.getFont().deriveFont (22.0f));
        jLabel3.setFont (jLabel3.getFont().deriveFont (22.0f));
        tfstaffid.setFont (tfstaffid.getFont().deriveFont (22.0f));
        tfname.setFont (tfname.getFont().deriveFont (22.0f));
        badd.setFont (badd.getFont().deriveFont (22.0f));
        jButton1.setFont (jButton1.getFont().deriveFont (22.0f));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        // TODO add your handling code here:
        String sid = tfstaffid.getText().toString();
        String name = tfname.getText().toString();
        
        try{
            Class.forName(JDBCdriver);
        Connection con = DriverManager.getConnection(dbserver,dbusername,dbpassword);
        
        if(con!=null)
            System.out.print("Success");
        
        Statement stmt = con.createStatement();
        String sql = "select * from staff where sid = '"+sid+"';";
        ResultSet rs = stmt.executeQuery(sql);
        
        rs.last();
        int records = rs.getRow();
        rs.beforeFirst();
        
        if(records == 0){
            String sql2 = "insert into staff (sid,sname) values('"+sid+"','"+name+"')";
            int action = 0;
            action = stmt.executeUpdate(sql2);
            
            if(action>0){
            
            JLabel label = new JLabel("Insertion of "+name+" is successful");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            JOptionPane.showMessageDialog(null,label,"Error",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JLabel label = new JLabel("A staff with the same staff id already exists");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            JOptionPane.showMessageDialog(null,label,"Error",JOptionPane.ERROR_MESSAGE);
        
        }
        
        con.close();
        }catch(SQLException err){
            System.out.print("SQL exception - "+err.getMessage());
        }catch(ClassNotFoundException exp){
            System.out.print("Class not found exception - "+exp+"\n");
        }
    }//GEN-LAST:event_baddActionPerformed

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
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfstaffid;
    // End of variables declaration//GEN-END:variables
}
