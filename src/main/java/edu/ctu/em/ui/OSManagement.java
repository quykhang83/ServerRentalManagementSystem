/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.ctu.em.ui;

import edu.ctu.em.helper.DataValidator;
import edu.ctu.em.helper.DatabaseHelper;
import edu.ctu.em.helper.OSTool;
import edu.ctu.em.helper.ImageHelper;
import edu.ctu.em.helper.MessageDialogHelper;
import edu.ctu.em.model.OS;
import edu.ctu.em.model.SuggestedServer;
import static edu.ctu.em.ui.ServerSuggestion.tblServers;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quykhang
 */
public class OSManagement extends javax.swing.JPanel {

    DefaultTableModel tblModel;
    private Dashboard parentForm;
    private byte[] imageOS;

    /**
     * Creates new form OSManagement1
     */
    public OSManagement() {
        initComponents();

        initTable();
        loadAllOSs();
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"ID", "OS Name", "Description"});
        tblOS.setModel(tblModel);

        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblServers.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
    }

    private void loadAllOSs() {
        try {
            String sql = "select * from os";
            try (
                     Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
                ResultSet rs = psmt.executeQuery();
                tblModel.setRowCount(0);
                while (rs.next()) {
                    String[] row = new String[]{
                        rs.getString("idOS"), rs.getString("nameOS"), rs.getString("descriptionOS")
                    };
                    tblModel.addRow(row);
                }
                tblModel.fireTableDataChanged();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                for (int i = 0; i < 4; i++) {
                    tblServers.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
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

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        pnlAvt = new javax.swing.JPanel();
        lblAvt = new javax.swing.JLabel();
        btnUploadImg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOS = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdOS = new javax.swing.JTextField();
        txtNameOS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtAvt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnlAvt.setBackground(new java.awt.Color(255, 153, 51));
        pnlAvt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAvt.setForeground(new java.awt.Color(255, 255, 255));
        lblAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/add-os-icon.png"))); // NOI18N

        btnUploadImg.setText("Upload");
        btnUploadImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAvtLayout = new javax.swing.GroupLayout(pnlAvt);
        pnlAvt.setLayout(pnlAvtLayout);
        pnlAvtLayout.setHorizontalGroup(
            pnlAvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvtLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnUploadImg, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAvtLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(lblAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pnlAvtLayout.setVerticalGroup(
            pnlAvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvtLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUploadImg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tblOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOS);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("OS name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Description");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/search-icon-24.png"))); // NOI18N
        btnFind.setText("  Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/new-icon-16.png"))); // NOI18N
        btnNew.setText("  New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/plus.png"))); // NOI18N
        btnAdd.setText("  Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/Save-icon.png"))); // NOI18N
        btnSave.setText("  Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane2.setViewportView(txtDescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNameOS, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                .addComponent(txtIdOS)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNameOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtAvt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAvt.setText("Image");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(txtAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlAvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlAvt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("OS MANAGEMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private void tblOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOSMouseClicked
        try {
            int row = tblOS.getSelectedRow();

            if (row >= 0) {
                int id = Integer.parseInt(tblOS.getValueAt(row, 0).toString());
                OSTool osTool = new OSTool();
                OS os = osTool.findById(id);

                txtIdOS.setText(tblOS.getValueAt(row, 0).toString());
                txtNameOS.setText(tblOS.getValueAt(row, 1).toString());

                txtDescription.setLineWrap(true);
                txtDescription.setWrapStyleWord(true);
                txtDescription.setText(tblOS.getValueAt(row, 2).toString());

                if (os.getImageOS() != null) {
                    Image img = ImageHelper.creatImageFromByteArray(os.getImageOS(), "png");
                    lblAvt.setIcon(new ImageIcon(img));
                    imageOS = os.getImageOS();
                } else {
                    imageOS = os.getImageOS();
                    ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/add-os-icon.png"));
                    lblAvt.setIcon(icon);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Error");
        }

    }//GEN-LAST:event_tblOSMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtIdOS, sb, "Must enter OS ID to search!");

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }

        try {
            OSTool osTool = new OSTool();

            OS os = osTool.findById(Integer.parseInt(txtIdOS.getText()));

            if (os != null) {
                txtNameOS.setText(os.getNameOS());
                txtDescription.setText(os.getDescriptionOS());
                if (os.getImageOS() != null) {
                    Image img = ImageHelper.creatImageFromByteArray(os.getImageOS(), "png");
                    lblAvt.setIcon(new ImageIcon(img));
                    imageOS = os.getImageOS();
                } else {
                    imageOS = os.getImageOS();
                    ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/add-os-icon.png"));
                    lblAvt.setIcon(icon);
                }
            } else {
                MessageDialogHelper.showMessageDialog(parentForm, "OS with ID: " + txtIdOS.getText() + " could not be found!", "Notif");
            }
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(parentForm, "Error: " + e.getMessage(), "Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtIdOS.setText("");
        txtNameOS.setText("");
        txtDescription.setText("");
        imageOS = null;
        ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/add-os-icon.png"));
        lblAvt.setIcon(icon);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        StringBuilder sb = new StringBuilder();
        OSTool osTool = new OSTool();
        DataValidator.validateEmpty(txtIdOS, sb, "OS ID cannot be null!");
        DataValidator.validateEmpty(txtNameOS, sb, "OS name cannot be null!");

        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(this, sb.toString(), "Error");
            return;
        }

        try {
            if (osTool.findById(Integer.parseInt(txtIdOS.getText())) != null) {
                sb.append("OS ID cannot be duplicated!\n");
                txtIdOS.setBackground(Color.yellow);
            } else {
                txtIdOS.setBackground(Color.white);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(this, sb.toString(), "Error");
            return;
        }

        try {
            OS os = new OS();
            os.setIdOS(Integer.parseInt(txtIdOS.getText()));
            os.setNameOS(txtNameOS.getText());
            os.setDescriptionOS(txtDescription.getText());
            os.setImageOS(imageOS);

            osTool.insert(os);
            loadAllOSs();
            ServerManagement.loadComboBoxData();
            ServerSuggestion.loadComboBoxData();

            JOptionPane.showMessageDialog(this, "New OS has been saved to database!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtIdOS, sb, "Must enter OS ID to update!");

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }

        if (JOptionPane.showConfirmDialog(this, "Do you want to update info of the OS with ID: "
                + txtIdOS.getText() + "?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            OS os = new OS();
            os.setIdOS(Integer.parseInt(txtIdOS.getText()));
            os.setNameOS(txtNameOS.getText());
            os.setDescriptionOS(txtDescription.getText());
            os.setImageOS(imageOS);

            OSTool osTool = new OSTool();
            osTool.update(os);

            JOptionPane.showMessageDialog(this, "OS with ID: " + os.getIdOS() + " has been updated!");
            loadAllOSs();
            ServerManagement.loadComboBoxData();
            ServerSuggestion.loadComboBoxData();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtIdOS, sb, "Must enter OS ID to delete!");

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }

        if (JOptionPane.showConfirmDialog(this, "Do you want to delete the OS with ID: "
                + txtIdOS.getText() + "?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            OSTool osTool = new OSTool();
            if (osTool.delete(Integer.parseInt(txtIdOS.getText()))) {
                JOptionPane.showMessageDialog(this, "OS with ID: " + txtIdOS.getText() + " has been deleted!");
                loadAllOSs();
                ServerManagement.loadComboBoxData();
                ServerSuggestion.loadComboBoxData();
                btnNewActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "OS with ID: " + txtIdOS.getText() + " could not be found!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUploadImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImgActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".png");
                }
            }

            @Override
            public String getDescription() {
                return "Image File (*.png)";
            }
        });
        if (chooser.showOpenDialog(parentForm) == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image img = ImageHelper.resize(icon.getImage(), 180, 200);
            ImageIcon resizedIcon = new ImageIcon(img);
            lblAvt.setIcon(resizedIcon);
            imageOS = ImageHelper.toByteArray(img, "png");
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Error");
        }
    }//GEN-LAST:event_btnUploadImgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadImg;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAvt;
    private javax.swing.JPanel pnlAvt;
    private javax.swing.JTable tblOS;
    private javax.swing.JLabel txtAvt;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtIdOS;
    private javax.swing.JTextField txtNameOS;
    // End of variables declaration//GEN-END:variables
}
