/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.*;
/**
 *
 * @author Stefan
 */
public class JTreeFileModel implements TreeModel{

    private File root;
    private Vector listeners = new Vector();

    public JTreeFileModel(File rootDirectory){
        root=rootDirectory;
    }
    
    @Override
    public String toString() {
        return root.getName();
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public Object getChild(Object parent, int index) {
        File p = (File) parent;
        File[] files = p.listFiles();
        return new TreeFile(p, files[index].getName());
    }

    @Override
    public int getChildCount(Object parent) {
        return ((File)parent).listFiles().length;
    }

    @Override
    public boolean isLeaf(Object node) {
        return ((File)node).isFile();
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        File oldFile = (File) path.getLastPathComponent();
        String fileParentPath = oldFile.getParent();
        String newFileName = (String) newValue;
        File targetFile = new File(fileParentPath, newFileName);
        oldFile.renameTo(targetFile);
        File parent = new File(fileParentPath);
        int[] changedChildrenIndices = {getIndexOfChild(parent, targetFile)};
        Object[] changedChildren = {targetFile};
        fireTreeNodesChanged(path.getParentPath(), changedChildrenIndices, changedChildren);

    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        File p = (File) parent;
        File c= (File) child;
        File[] files= p.listFiles();
        for(int i=0;i<files.length;i++){
            if(files[i].getName().equals(c.getName()))
                return i;
        }
        return -1;
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        listeners.add(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        listeners.remove(l);
    }

    private void fireTreeNodesChanged(TreePath parentPath, int[] changedChildrenIndices, Object[] changedChildren) {
        TreeModelEvent event = new TreeModelEvent(this, parentPath, changedChildrenIndices, changedChildren);
        Iterator iterator = listeners.iterator();
        TreeModelListener listener = null;
        while (iterator.hasNext()) {
            listener = (TreeModelListener) iterator.next();
            listener.treeNodesChanged(event);
        }
    }
    
    public void removeFile(File file){
        file.delete();
    }
    public void createFile(File parent,String fileName, String extension) throws IOException, Exception{
        if(!parent.isDirectory())
            throw new Exception();
        String fullFileName = parent.getPath()+"\\"+fileName+"."+extension;
        File file = new File(fullFileName);
        if(!file.exists())
            file.createNewFile();
    }
}
