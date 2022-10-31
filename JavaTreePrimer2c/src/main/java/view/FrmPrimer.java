/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import classes.CreateChildNodes;
import classes.TreeFileNode;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Stefan
 */
public class FrmPrimer extends javax.swing.JFrame {

    private TreeFileNode root;
    private DefaultTreeModel treeModel;
    private TreeFileNode selectedNode;
    /**
     * Creates new form FrmPrimer
     */
    public FrmPrimer() {
        initComponents();
        pripremiPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTextFieldSelectedNode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNewNode = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jButtonRename = new javax.swing.JButton();
        jButtonOpen = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTree1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jTextFieldSelectedNode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldSelectedNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSelectedNodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trenutno oznacen fajl");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Naziv novog fajla");

        jTextFieldNewNode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNewNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNewNodeActionPerformed(evt);
            }
        });

        jButtonCreate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCreate.setText("Kreiraj");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonRename.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRename.setText("Izmeni");
        jButtonRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenameActionPerformed(evt);
            }
        });

        jButtonOpen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonOpen.setText("Otvori");
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonDelete.setText("Izbrisi");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "txt", "docx", "xlsx", "ppt" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ekstenzije za novi fajl");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSelectedNode)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNewNode)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNewNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRename)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOpen)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addGap(7, 7, 7))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        if(jTree1.getSelectionPath()==null||jTree1.getSelectionPath().getLastPathComponent()==null)
            return;
        selectedNode = (TreeFileNode) jTree1.getSelectionPath().getLastPathComponent();
        jTextFieldSelectedNode.setText(selectedNode.toString());
    }//GEN-LAST:event_jTree1MouseClicked

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        
        if(selectedNode==null||selectedNode.getFile().isFile()){
            JOptionPane.showMessageDialog(this, "Nije oznacen folder", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jTextFieldNewNode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Novi fajl nema svoji naziv", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TreeFileNode selectedNode = (TreeFileNode)jTree1.getSelectionPath().getLastPathComponent();
        String path = selectedNode.getFile().getPath().toString();
        File newFile = new File(path,jTextFieldNewNode.getText()+"."+jComboBox1.getSelectedItem().toString());
        try {
            if(newFile.createNewFile()){
                selectedNode.add(new TreeFileNode(newFile,new DefaultMutableTreeNode(newFile)));
                JOptionPane.showMessageDialog(this, "Fajl je uspesno kreiran", "Uspesno", JOptionPane.INFORMATION_MESSAGE);
                jTree1.updateUI();
            }else{
                JOptionPane.showMessageDialog(this, "Fajl vec postoji u sistemu", "Greska", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Desila se greska prilikom kreiranja", "Greksa", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FrmPrimer.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTree1.updateUI();
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenameActionPerformed
        
        if(selectedNode==null){
            JOptionPane.showMessageDialog(this, "Nije oznacen fajl ili folder", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jTextFieldSelectedNode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Novi naziv za fajl ne postoji", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TreeFileNode file = (TreeFileNode) jTree1.getSelectionPath().getLastPathComponent();
        File newFile = new File(jTextFieldSelectedNode.getText());
        file.getFile().renameTo(newFile);
        TreeFileNode newNode = new TreeFileNode(newFile,new DefaultMutableTreeNode(newFile));
        DefaultMutableTreeNode defaultNode = new DefaultMutableTreeNode(newFile);
        file.setUserObject(newNode);
        DefaultTreeModel model =(DefaultTreeModel)jTree1.getModel();
        model.reload();
        jTree1.updateUI();
    }//GEN-LAST:event_jButtonRenameActionPerformed

    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenActionPerformed
        if(selectedNode==null||selectedNode.getFile().isDirectory()){
            JOptionPane.showMessageDialog(rootPane, "Nije selektovan ni jedan file");
            return;
        }
        TreeFileNode selection = (TreeFileNode) jTree1.getSelectionPath().getLastPathComponent();
        if(!selection.getFile().exists())
            JOptionPane.showMessageDialog(this, "Nije selektovan ni jedan fajl", "Greska", JOptionPane.ERROR_MESSAGE);
        if(!Desktop.isDesktopSupported())
            JOptionPane.showMessageDialog(this, "AWT desktop nije podrzan", "Greska", JOptionPane.ERROR_MESSAGE);
        try {
            Desktop.getDesktop().open(selection.getFile());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "desila se nepredvidjena greska", "Greska", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FrmPrimer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOpenActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if(selectedNode==null){
           JOptionPane.showMessageDialog(rootPane, "Nije selektovan ni jedan file");
           return;
        }
        TreeFileNode file = (TreeFileNode) jTree1.getSelectionPath().getLastPathComponent();
        TreeFileNode parent = (TreeFileNode) jTree1.getSelectionPath().getParentPath().getLastPathComponent();
        file.getFile().delete();
        parent.remove(file);
        jTree1.updateUI();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldSelectedNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSelectedNodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSelectedNodeActionPerformed

    private void jTextFieldNewNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNewNodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNewNodeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonRename;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNewNode;
    private javax.swing.JTextField jTextFieldSelectedNode;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

    private void pripremiPodatke() {
        File fileRoot = new File("primer");
        root=new TreeFileNode(fileRoot,new DefaultMutableTreeNode(fileRoot));
        
        CreateChildNodes ccn = 
                new CreateChildNodes(root);
        new Thread(ccn).start();
        treeModel = new DefaultTreeModel(root);
        this.jTree1.setModel(treeModel);
    }
}