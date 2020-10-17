/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class ExceptionFile {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("sinhvien.txt");
            int read=fis.read();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found"+ex);
            Logger.getLogger(ExceptionFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("read error"+ex);
            Logger.getLogger(ExceptionFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(ExceptionFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
