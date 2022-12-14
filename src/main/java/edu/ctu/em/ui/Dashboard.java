package edu.ctu.em.ui;

import edu.ctu.em.helper.MessageDialogHelper;
import edu.ctu.em.helper.SharedData;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author quykhang
 */
public class Dashboard extends javax.swing.JFrame {

    private OSManagement osManage;
    private ServerManagement svManage;
    private ServerSuggestion svSuggestion;

    /**
     * Creates new form EmployeeManagement
     */
    public Dashboard() {
        initComponents();

//        LoginForm lg = new LoginForm(this, true);
//        lg.setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        processLoginSuccessful();
    }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btnLogout = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnViewProfile = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnChangePass = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnHelp = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        tplDashBoard = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblNameAcc = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuMO = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuMS = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnuSS = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        mnuViewProfile = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuEditProfile = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuLogout = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnuExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCompany = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuSoftware = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management");
        setBackground(new java.awt.Color(240, 219, 167));
        setForeground(new java.awt.Color(255, 233, 204));
        setPreferredSize(new java.awt.Dimension(888, 820));

        jToolBar1.setRollover(true);

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/logout-icon-32.png"))); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.setFocusable(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setMaximumSize(new java.awt.Dimension(75, 69));
        btnLogout.setMinimumSize(new java.awt.Dimension(75, 69));
        btnLogout.setName(""); // NOI18N
        btnLogout.setPreferredSize(new java.awt.Dimension(75, 69));
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);
        jToolBar1.add(jSeparator7);

        btnViewProfile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnViewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/profile-32.png"))); // NOI18N
        btnViewProfile.setText("View profile");
        btnViewProfile.setFocusable(false);
        btnViewProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewProfile.setMaximumSize(new java.awt.Dimension(83, 69));
        btnViewProfile.setMinimumSize(new java.awt.Dimension(83, 69));
        btnViewProfile.setName(""); // NOI18N
        btnViewProfile.setPreferredSize(new java.awt.Dimension(83, 69));
        btnViewProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        jToolBar1.add(btnViewProfile);
        jToolBar1.add(jSeparator8);

        btnChangePass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/changePass.png"))); // NOI18N
        btnChangePass.setText("Change Pass");
        btnChangePass.setToolTipText("");
        btnChangePass.setFocusable(false);
        btnChangePass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangePass.setMaximumSize(new java.awt.Dimension(90, 69));
        btnChangePass.setMinimumSize(new java.awt.Dimension(75, 69));
        btnChangePass.setName(""); // NOI18N
        btnChangePass.setOpaque(false);
        btnChangePass.setPreferredSize(new java.awt.Dimension(90, 69));
        btnChangePass.setRequestFocusEnabled(false);
        btnChangePass.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChangePass);
        jToolBar1.add(jSeparator9);

        btnHelp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/Actions-help-about-icon-32.png"))); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setFocusable(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setMaximumSize(new java.awt.Dimension(75, 69));
        btnHelp.setMinimumSize(new java.awt.Dimension(75, 69));
        btnHelp.setName(""); // NOI18N
        btnHelp.setPreferredSize(new java.awt.Dimension(75, 69));
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHelp);
        jToolBar1.add(jSeparator11);

        lblNameAcc.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNameAcc.setText("Hello:");

        lblRole.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblRole.setText("Role:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNameAcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole)
                .addGap(18, 18, 18))
        );

        jMenu1.setText("System");

        mnuMO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/os-icon-16.png"))); // NOI18N
        mnuMO.setText("Manage OS");
        mnuMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMOActionPerformed(evt);
            }
        });
        jMenu1.add(mnuMO);
        jMenu1.add(jSeparator2);

        mnuMS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/server-icon-16.png"))); // NOI18N
        mnuMS.setText("Manage Server");
        mnuMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMSActionPerformed(evt);
            }
        });
        jMenu1.add(mnuMS);
        jMenu1.add(jSeparator12);

        mnuSS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuSS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/light-bulb-16.png"))); // NOI18N
        mnuSS.setText("Server Suggestion");
        mnuSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSSActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSS);
        jMenu1.add(jSeparator3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Setting");

        mnuViewProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuViewProfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuViewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/user.png"))); // NOI18N
        mnuViewProfile.setText("View profile");
        mnuViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewProfileActionPerformed(evt);
            }
        });
        jMenu2.add(mnuViewProfile);
        jMenu2.add(jSeparator4);

        mnuEditProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuEditProfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuEditProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/changePass-16.png"))); // NOI18N
        mnuEditProfile.setText("Change Pass");
        mnuEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditProfileActionPerformed(evt);
            }
        });
        jMenu2.add(mnuEditProfile);
        jMenu2.add(jSeparator5);

        mnuLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/logout-icon-16.png"))); // NOI18N
        mnuLogout.setText("Log out");
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        jMenu2.add(mnuLogout);
        jMenu2.add(jSeparator10);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/Button-Close-icon-16.png"))); // NOI18N
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu2.add(mnuExit);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");

        mnuCompany.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuCompany.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/Actions-help-about-icon-16.png"))); // NOI18N
        mnuCompany.setText("Our company");
        mnuCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCompanyActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCompany);
        jMenu3.add(jSeparator6);

        mnuSoftware.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuSoftware.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuSoftware.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ctu/em/icons/Help-icon-16.png"))); // NOI18N
        mnuSoftware.setText("Our software");
        mnuSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSoftwareActionPerformed(evt);
            }
        });
        jMenu3.add(mnuSoftware);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tplDashBoard, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplDashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMOActionPerformed
        if (osManage == null) {
            osManage = new OSManagement();
            ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/os-icon-16.png"));
            tplDashBoard.addTab("OS Management  ", icon, osManage, "OS Management");
        }
        tplDashBoard.setSelectedComponent(osManage);
    }//GEN-LAST:event_mnuMOActionPerformed

    private void mnuMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMSActionPerformed
        if (svManage == null) {
            svManage = new ServerManagement();
            ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/server-icon-16.png"));
            tplDashBoard.addTab("Server Management  ", icon, svManage, "Server Management");
        }
        tplDashBoard.setSelectedComponent(svManage);
    }//GEN-LAST:event_mnuMSActionPerformed

    private void mnuCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCompanyActionPerformed
        AboutUs au = new AboutUs(this, true);

        au.setVisible(true);
    }//GEN-LAST:event_mnuCompanyActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        if (MessageDialogHelper.showConfirmDialog(this, "Do you sure you want to exit?", "Confirm") == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            LoginForm lg = new LoginForm(this, true);
            lg.setVisible(true);
            processLoginSuccessful();
        }

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        btnLogoutActionPerformed(evt);
    }//GEN-LAST:event_mnuLogoutActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        ChangePass chPass = new ChangePass(this, true);
        chPass.setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void mnuSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSoftwareActionPerformed
        AboutSoftware as = new AboutSoftware(this, true);

        as.setVisible(true);
    }//GEN-LAST:event_mnuSoftwareActionPerformed

    private void mnuEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditProfileActionPerformed
        btnChangePassActionPerformed(evt);
    }//GEN-LAST:event_mnuEditProfileActionPerformed

    private void mnuViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewProfileActionPerformed
        Profile p = new Profile(this, true);

        p.setVisible(true);
    }//GEN-LAST:event_mnuViewProfileActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        mnuViewProfileActionPerformed(evt);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        mnuSoftwareActionPerformed(evt);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void mnuSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSSActionPerformed
        if (svSuggestion == null) {
            svSuggestion = new ServerSuggestion();
            ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/light-bulb-16.png"));
            tplDashBoard.addTab("Server Suggestion  ", icon, svSuggestion, "Server Suggestion");
        }
        tplDashBoard.setSelectedComponent(svSuggestion);
    }//GEN-LAST:event_mnuSSActionPerformed

    private void processLoginSuccessful() {
        lblNameAcc.setText("Hello: " + SharedData.LoginUser.getUsername());
        String role = "";
        if (SharedData.LoginUser.getRole() == 0) {
            role = "Admin";
        } else if (SharedData.LoginUser.getRole() == 1) {
            role = "Member";
        }
        lblRole.setText("Role: " + role);

        tplDashBoard.removeAll();
        if (role.equals("Member")) {
            mnuSS.setEnabled(true);
            if (svSuggestion == null) {
                svSuggestion = new ServerSuggestion();
                ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/light-bulb-16.png"));
                tplDashBoard.addTab("Server Suggestion  ", icon, svSuggestion, "Server Suggestion");
            }
            tplDashBoard.setSelectedComponent(svSuggestion);
            mnuMS.setEnabled(false);
            mnuMO.setEnabled(false);
        } else if (role.equals("Admin")) {
            mnuSS.setEnabled(true);
            if (svSuggestion == null) {
                svSuggestion = new ServerSuggestion();
                ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/light-bulb-16.png"));
                tplDashBoard.addTab("Server Suggestion  ", icon, svSuggestion, "Server Suggestion");
            }
            tplDashBoard.setSelectedComponent(svSuggestion);          

            mnuMS.setEnabled(true);
            if (svManage == null) {
                svManage = new ServerManagement();
                ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/server-icon-16.png"));
                tplDashBoard.addTab("Server Management  ", icon, svManage, "Server Management");
            }
            
            mnuMO.setEnabled(true);
            if (osManage == null) {
                osManage = new OSManagement();
                ImageIcon icon = new ImageIcon(getClass().getResource("/edu/ctu/em/icons/os-icon-16.png"));
                tplDashBoard.addTab("OS Management  ", icon, osManage, "OS Management");
            }
        }
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblNameAcc;
    private javax.swing.JLabel lblRole;
    private javax.swing.JMenuItem mnuCompany;
    private javax.swing.JMenuItem mnuEditProfile;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuLogout;
    private javax.swing.JMenuItem mnuMO;
    private javax.swing.JMenuItem mnuMS;
    private javax.swing.JMenuItem mnuSS;
    private javax.swing.JMenuItem mnuSoftware;
    private javax.swing.JMenuItem mnuViewProfile;
    private javax.swing.JTabbedPane tplDashBoard;
    // End of variables declaration//GEN-END:variables
}
