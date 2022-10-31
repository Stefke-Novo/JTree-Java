/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.File;

/**
 *
 * @author Stefan
 */
public class TreeFile extends File{
    public TreeFile(File parent, String child) {
        super(parent, child);
    }

    @Override
    public String toString() {
        return getName();
    }
}
