/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class TryCatchResult {
    public static void main(String[] args) {
        try (FileReader fr=new FileReader("ad.txt")){
            
            char[] a=new char[50];
            fr.read(a);
            for(char c:a)
                System.out.println(c);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
