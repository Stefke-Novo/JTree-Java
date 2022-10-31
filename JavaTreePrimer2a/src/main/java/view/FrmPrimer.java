/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Stefan
 */
public class FrmPrimer extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrimer
     */
    public FrmPrimer() {
        initComponents();
        pripremiStablo();
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
        jButtonAdd = new javax.swing.JButton();
        jButtonRename = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTree1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jTextFieldSelectedNode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trenutno oznacen cvor");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Naziv novog cvora");

        jTextFieldNewNode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNewNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNewNodeActionPerformed(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAdd.setText("Dodaj");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRename.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRename.setText("Izmeni");
        jButtonRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenameActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonDelete.setText("Izbrisi");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSelectedNode)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNewNode)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNewNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRename)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addGap(58, 58, 58))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
        jTextFieldSelectedNode.setText(selectedNode.toString());
    }//GEN-LAST:event_jTree1MouseClicked

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(jTextFieldNewNode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Nije upisan naziv novog cvora", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
        selectedNode.add(new DefaultMutableTreeNode(jTextFieldNewNode.getText()));
        jTree1.updateUI();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenameActionPerformed
        if(jTextFieldSelectedNode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Nije upisan naziv trenutnog cvora", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
        selectedNode.setUserObject(jTextFieldSelectedNode.getText());
        jTree1.updateUI();
    }//GEN-LAST:event_jButtonRenameActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode parent = (DefaultMutableTreeNode) selectedNode.getParent();
        parent.remove(selectedNode);
        jTree1.updateUI();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

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
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNewNode;
    private javax.swing.JTextField jTextFieldSelectedNode;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

    private void pripremiStablo() {
        DefaultMutableTreeNode stablo =formirajStablo();
        DefaultTreeModel model = new DefaultTreeModel(stablo);
        jTree1.setModel(model);
    }

    private DefaultMutableTreeNode formirajStablo() {
        //Kreiranje glavnog cvora - fakultet
        DefaultMutableTreeNode fon = new DefaultMutableTreeNode("FON");
        
        //Krieranje cvorova na 2. nivou - godine studija
        DefaultMutableTreeNode god1= new DefaultMutableTreeNode("1. godina");
        DefaultMutableTreeNode god2= new DefaultMutableTreeNode("2. godina");
        DefaultMutableTreeNode god3= new DefaultMutableTreeNode("3. godina");
        DefaultMutableTreeNode god4= new DefaultMutableTreeNode("4. godina");
        
        // kreiranje cvorova na 3. nivou - studijski smerovi
            //1. godina
        DefaultMutableTreeNode isit1 = new DefaultMutableTreeNode("ISIT");
        DefaultMutableTreeNode mio1 = new DefaultMutableTreeNode("MIO");
            //2. godina
        DefaultMutableTreeNode isit2 = new DefaultMutableTreeNode("ISIT");
        DefaultMutableTreeNode om2 = new DefaultMutableTreeNode("OM");
        DefaultMutableTreeNode mks2 = new DefaultMutableTreeNode("MKS");
        DefaultMutableTreeNode men2 = new DefaultMutableTreeNode("MEN");
            //3. godina
        DefaultMutableTreeNode isit3 = new DefaultMutableTreeNode("ISIT");
        DefaultMutableTreeNode om3 = new DefaultMutableTreeNode("OM");
        DefaultMutableTreeNode mks3 = new DefaultMutableTreeNode("MKS");
        DefaultMutableTreeNode men3 = new DefaultMutableTreeNode("MEN");
            //4.godina
        DefaultMutableTreeNode isit4 = new DefaultMutableTreeNode("ISIT");
        DefaultMutableTreeNode om4 = new DefaultMutableTreeNode("OM");
        DefaultMutableTreeNode mks4 = new DefaultMutableTreeNode("MKS");
        DefaultMutableTreeNode men4 = new DefaultMutableTreeNode("MEN");
        
        //Kreiranje cvorova na 4. nivou - grupe za slusanje nastave
            // 1. godina
                //ISIT
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("A3");
        DefaultMutableTreeNode a4 = new DefaultMutableTreeNode("A4");
        DefaultMutableTreeNode a5 = new DefaultMutableTreeNode("A5");
        DefaultMutableTreeNode a6 = new DefaultMutableTreeNode("A6");
        DefaultMutableTreeNode a7 = new DefaultMutableTreeNode("A7");
        DefaultMutableTreeNode a8 = new DefaultMutableTreeNode("A8");
        DefaultMutableTreeNode a9 = new DefaultMutableTreeNode("A9");
                //MIO
        DefaultMutableTreeNode a10 = new DefaultMutableTreeNode("A10");
        DefaultMutableTreeNode a11 = new DefaultMutableTreeNode("A11");
        DefaultMutableTreeNode a12 = new DefaultMutableTreeNode("A12");
        DefaultMutableTreeNode a13 = new DefaultMutableTreeNode("A13");
        DefaultMutableTreeNode a14 = new DefaultMutableTreeNode("A14");
        DefaultMutableTreeNode a15 = new DefaultMutableTreeNode("A15");
        
            //2. godina
                //ISIT
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        DefaultMutableTreeNode b4 = new DefaultMutableTreeNode("B4");
        DefaultMutableTreeNode b5 = new DefaultMutableTreeNode("B5");
        DefaultMutableTreeNode b6 = new DefaultMutableTreeNode("B6");
                //MEN
        DefaultMutableTreeNode b7 = new DefaultMutableTreeNode("B7");
        DefaultMutableTreeNode b8 = new DefaultMutableTreeNode("B8");
        DefaultMutableTreeNode b9 = new DefaultMutableTreeNode("B9");
                //OM
        DefaultMutableTreeNode b10 = new DefaultMutableTreeNode("B10");
                //MKS
        DefaultMutableTreeNode b11 = new DefaultMutableTreeNode("B11");
        
            //3. godina
                //ISIT
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("C1");
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("C2");
        DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("C3");
        DefaultMutableTreeNode c4 = new DefaultMutableTreeNode("C4");
        DefaultMutableTreeNode c5 = new DefaultMutableTreeNode("C5");
        DefaultMutableTreeNode c6 = new DefaultMutableTreeNode("C6");
                //MEN
        DefaultMutableTreeNode c7 = new DefaultMutableTreeNode("C7");
        DefaultMutableTreeNode c8 = new DefaultMutableTreeNode("C8");
        DefaultMutableTreeNode c9 = new DefaultMutableTreeNode("C9");
                //OM
        DefaultMutableTreeNode c10 = new DefaultMutableTreeNode("C10");
                //MKS
        DefaultMutableTreeNode c11 = new DefaultMutableTreeNode("C11");
        
            //4. godina
                //ISIT
        DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("D1");
        DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("D2");
        DefaultMutableTreeNode d3 = new DefaultMutableTreeNode("D3");
        DefaultMutableTreeNode d4 = new DefaultMutableTreeNode("D4");
                //MEN
        DefaultMutableTreeNode d5 = new DefaultMutableTreeNode("D5");
        DefaultMutableTreeNode d6 = new DefaultMutableTreeNode("D6");
                //OM
        DefaultMutableTreeNode d7 = new DefaultMutableTreeNode("D7");
                //MKS
        DefaultMutableTreeNode d8 = new DefaultMutableTreeNode("D8");
        fon.add(god1);
        fon.add(god2);
        fon.add(god3);
        fon.add(god4);
        god1.add(isit1);
        god1.add(mio1);
        god2.add(isit2);
        god2.add(men2);
        god2.add(om2);
        god2.add(mks2);
        god3.add(isit3);
        god3.add(men3);
        god3.add(om3);
        god3.add(mks3);
        god4.add(isit4);
        god4.add(men4);
        god4.add(om4);
        god4.add(mks4);
        isit1.add(a1);
        isit1.add(a2);
        isit1.add(a3);
        isit1.add(a4);
        isit1.add(a5);
        isit1.add(a6);
        isit1.add(a7);
        isit1.add(a8);
        isit1.add(a9);
        mio1.add(a10);
        mio1.add(a11);
        mio1.add(a12);
        mio1.add(a13);
        mio1.add(a14);
        mio1.add(a15);
        isit2.add(b1);
        isit2.add(b2);
        isit2.add(b3);
        isit2.add(b4);
        isit2.add(b5);
        isit2.add(b6);
        men2.add(b7);
        men2.add(b8);
        men2.add(b9);
        om2.add(b10);
        mks2.add(b11);
        isit3.add(c1);
        isit3.add(c2);
        isit3.add(c3);
        isit3.add(c4);
        isit3.add(c5);
        isit3.add(c6);
        men3.add(c7);
        men3.add(c8);
        men3.add(c9);
        om3.add(c10);
        mks3.add(c11);
        isit4.add(d1);
        isit4.add(d2);
        isit4.add(d3);
        isit4.add(d4);
        men4.add(d5);
        men4.add(d6);
        om4.add(d7);
        mks4.add(d8);
        return fon;
    }
}
