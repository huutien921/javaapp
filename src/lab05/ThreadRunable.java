/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;
import org.omg.SendingContext.RunTime;

/**
 *
 * @author ACER
 */
public class ThreadRunable implements Runnable{
    
    public void run(){
          try {
            System.out.println("Start writing......");
            PrintWriter out = new PrintWriter(new FileWriter("demo.txt"),true);
            for(int i=1;i<=10;i++){
                    out.println("Count2 = "+i);
                out.flush();
                sleep(1000);
            }
            System.out.println("END.....");
        } catch (IOException |InterruptedException ex) {
            Logger.getLogger(ThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        } 
        /*try {
           InputStream is = new FileInputStream("demo.txt");
            BufferedReader reader=new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line=reader.readLine()) != null) {
                System.out.println(line);
                
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ThreadRunable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ThreadRunable.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
        
        String line;
      /*  for(int i=1;i<20;i+=2){
            System.out.println("Thread Runable= "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRunable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }
    
}
