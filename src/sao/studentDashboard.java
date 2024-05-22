/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sao;

import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;
import studentviolation.loginForm;

/**
 *
 * @author NiQby
 */
public class studentDashboard extends javax.swing.JFrame {

    /**
     * Creates new form usersForm
     */
    public studentDashboard() {
        initComponents();
        displayData();
    }

     public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_students");
            studTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-user-94.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 20, 94, 94);

        accname.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        accname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accname.setText("Current User Id :");
        jPanel2.add(accname);
        accname.setBounds(0, 360, 180, 30);

        acc_id.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        acc_id.setText("0");
        jPanel2.add(acc_id);
        acc_id.setBounds(80, 390, 10, 14);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel2.setText("BACK");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 0, 40, 20);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 440, 80, 20);

        acc_name.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        acc_name.setText("FIRST NAME");
        jPanel2.add(acc_name);
        acc_name.setBounds(40, 120, 110, 21);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("SAO");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(70, 150, 40, 21);

        print.setBackground(new java.awt.Color(255, 204, 204));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        print.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("PRINT");
        print.add(jLabel3);
        jLabel3.setBounds(70, 0, 50, 30);

        jPanel2.add(print);
        print.setBounds(0, 230, 180, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 180, 460);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(null);

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("STUDENT VIOLATION MANAGEMENT SYSTEM");
        jPanel8.add(jLabel14);
        jLabel14.setBounds(10, 0, 585, 50);

        jPanel4.add(jPanel8);
        jPanel8.setBounds(10, 20, 600, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/objects (1).jpg"))); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(280, 0, 290, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/objects (1).jpg"))); // NOI18N
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 290, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/objects (1).jpg"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(340, 0, 290, 90);

        jLabel15.setFont(new java.awt.Font("Perpetua Titling MT", 3, 14)); // NOI18N
        jLabel15.setText("STUDENT VIOLATION MANAGEMENT SYSTEM");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(0, 0, 340, 17);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(-1, 0, 620, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/objects (1).jpg"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 290, 90);

        studTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(studTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 90, 620, 90);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(180, 0, 620, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session sess = Session.getInstance();
        if(sess.getUid()== 0){
        JOptionPane.showMessageDialog(null,"No Account,Login First!");
        loginForm lfm = new loginForm();
        lfm.setVisible(true);
        this.dispose();
        }else{
            acc_name.setText(""+sess.getFname());
        }
        
                                      

    }//GEN-LAST:event_formWindowActivated

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        saoDashboard sdb = new saoDashboard();
        sdb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
         int rowIndex = studTable.getSelectedRow();
        
          if(rowIndex<0){
       JOptionPane.showMessageDialog(null,"Please select an Item!");
       
       }else{
       
       try{
        dbConnector dbc = new dbConnector();
        TableModel tbl = studTable.getModel();
        ResultSet rs = dbc.getData("SELECT * FROM tbl_students WHERE id = '"+tbl.getValueAt(rowIndex,0)+"'");
       if(rs.next()){
        printReports prp = new printReports();   
        prp.fname.setText(""+rs.getString("fname"));
        prp.lname.setText(""+rs.getString("lname"));
        prp.course.setText(""+rs.getString("course"));
        prp.section.setText(""+rs.getString("section"));
        prp.violation.setText(""+rs.getString("violation"));
        prp.sanction.setText(""+rs.getString("sanction"));
        prp.type.setText(""+rs.getString("type"));
        prp.setVisible(true);
        this.dispose();
       }       
       }catch(SQLException ex){
       
           System.out.println(""+ex);
       
       }
                
                
                }
    }//GEN-LAST:event_printMouseClicked

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
            java.util.logging.Logger.getLogger(studentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel accname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel print;
    private javax.swing.JTable studTable;
    // End of variables declaration//GEN-END:variables
}