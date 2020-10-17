/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ACER
 */
public class FileHandler {
    public String[] displayFile(String folderPath,String fileExt){
        File file=new File(folderPath);
        FileFilter filter=new FileFilter(fileExt);
        return file.list(filter);
    }
    
    public void copyFile(String src,String dest) throws IOException{
         InputStream srcStream=null;
         OutputStream destStream=null;
        try {
          srcStream=new FileInputStream(src);
         destStream=new FileOutputStream(dest);
        int data=0;
        byte[] buff =new byte[1024];
            System.out.println("Start copy");
        while((srcStream.read(buff))!= -1){
            destStream.write(buff,0,buff.length);
            destStream.flush();
        }
        srcStream.close();
         destStream.close();
         System.out.println("Finish copy");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        finally{
            try {
                
           
            if(srcStream!=null){
                srcStream.close();
                 }
            if(destStream!=null){
                destStream.close();
            }
               
                
           
             } catch (IOException ex) {
                 Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
    }
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler=new FileHandler();
        String[] fileNames= fileHandler.displayFile("D:\\javascript",".java");
        for(String fileName:fileNames){
            System.out.println(fileName);
            
        }
       
            fileHandler.copyFile("C:\\Users\\ACER\\Videos\\Captures\\Adobe Dreamweaver CS6 - [index.asp] 01_02_2018 20_00_11.asp","D:\\adf.asp");
       
            
        
    }
}

