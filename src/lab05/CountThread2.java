/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class CountThread2 {
    public void run(){
        try {
            System.out.println("Start writing......");
            synchronized(this){
            PrintWriter out = new PrintWriter(new FileWriter("demo.txt"),true);
            for(int i=1;i<=10;i++){
                    out.println("Count2 = "+i);
                out.flush();
                sleep(1000);
            }
            out.close();
            }
            System.out.println("END.....");
        } catch (IOException |InterruptedException ex) {
            Logger.getLogger(ThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
}
