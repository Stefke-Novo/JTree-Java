/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.File;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Stefan
 */
public class CreateChildNodes implements Runnable {
    
    private TreeFileNode root;

    public CreateChildNodes(TreeFileNode root) {
        this.root = root;
    }

    @Override
    public void run() {
        createChildren(root);
    }

    private void createChildren(TreeFileNode node) {
        File[] files = node.getFile().listFiles();
        if (files == null) return;

        for (File file : files) {
            TreeFileNode childNode = 
                    new TreeFileNode(file,new DefaultMutableTreeNode(file));
            node.add(childNode);
            if (file.isDirectory()) {
                createChildren(childNode);
            }
        }
    }
}
