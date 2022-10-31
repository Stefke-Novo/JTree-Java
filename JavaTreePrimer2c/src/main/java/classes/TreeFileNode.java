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
public class TreeFileNode extends DefaultMutableTreeNode {
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public TreeFileNode(File file, Object o) {
        super(o);
        this.file = file;
    }
     @Override
    public String toString() {
        String name = file.getName();
        if (name.equals("")) {
            return file.getAbsolutePath();
        } else {
            return name;
        }
    }

    @Override
    public void setUserObject(Object userObject) {
        TreeFileNode userO = (TreeFileNode) userObject;
        this.file=userO.getFile();
        this.userObject=userO.userObject;
    }
    
}
