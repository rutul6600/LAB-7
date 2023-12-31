/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;
import javax.swing.table.DefaultTableModel;
import util.DatabaseConnector;

/**
 *
 * @author Jeel
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewpanel
     */
    private User newuser;
    private ArrayList<User> users;

    private User selectedUser;

    public ViewPanel(User newuser) {
        initComponents();
        this.newuser = newuser;
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_title = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        lbl_age = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        lbl_title.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        lbl_title.setText("Patient Registration Form");

        lbl_fname.setText("Name:");

        lbl_age.setText("Age");

        txt_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_fnameKeyReleased(evt);
            }
        });

        txt_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ageKeyReleased(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
            userTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lbl_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_age)
                            .addComponent(lbl_fname)
                            .addComponent(editbtn))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(savebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(deletebtn))
                            .addComponent(txt_fname)
                            .addComponent(txt_age))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fname)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_age)
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savebtn)
                            .addComponent(editbtn)
                            .addComponent(deletebtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyReleased

    }//GEN-LAST:event_txt_fnameKeyReleased

    private void txt_ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ageKeyReleased

    }//GEN-LAST:event_txt_ageKeyReleased

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        newUser.setName(txt_fname.getText());
        ViewPanel newViewPanel = new ViewPanel(newUser);
        
        try{
            newUser.setAge(Integer.parseInt(txt_age.getText()));
            newUser.setName(txt_fname.getText());
            
            DatabaseConnector.editUser(selectedUser, newUser);
            JOptionPane.showMessageDialog(null, "User Edited Successfully", "Successful Edit", JOptionPane.PLAIN_MESSAGE);
            clearFields();
            populateData();
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_savebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex == -1){
            JOptionPane.showMessageDialog(this, "Please select a user to edit details", "Cannot Edit user details" , JOptionPane.PLAIN_MESSAGE);
            return;
        }
        selectedUser = users.get(selectedIndex);
        txt_fname.setText(selectedUser.getName());
        txt_age.setText(Integer.toString(selectedUser.getAge()));

    }//GEN-LAST:event_editbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
         int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex == -1){
            JOptionPane.showMessageDialog(this, "Select a user to Delete", "Cannot Delete a user details" , JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        try{
            selectedUser = users.get(selectedIndex);
            DatabaseConnector.deleteUser(selectedUser);
            JOptionPane.showMessageDialog(null, "User Deleted Successfully", "Successfuly deleted User", JOptionPane.PLAIN_MESSAGE);
            clearFields();
            populateData();
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

    public void populateData() {
        try {
            this.users = DatabaseConnector.getAllusers();
            DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            model.setRowCount(0);
            for (User u : users) {
                Object[] row = new Object[3];
                row[0] = u.getId();
//                row[0] = u;
                row[1] = u.getName();
                row[2] = u.getAge();
                model.addRow(row);
            }
            clearFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearFields() {
        txt_fname.setText("");
        txt_age.setText("");
        selectedUser = null;
    }

}
