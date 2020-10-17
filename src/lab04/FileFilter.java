/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author ACER
 */
public class FileFilter implements FilenameFilter{
    private String fileExt;

    public FileFilter(String fileExt) {
        this.fileExt = fileExt;
    }

   

    @Override
    public boolean accept(File dir, String name) {
       return name.endsWith(this.fileExt);
    }
    
}
