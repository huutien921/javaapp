/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class One {
    private int index;
    
    public void display(){
        for(int i=1;i<=10;i++){
        index +=i;
        System.out.println("Index = "+index);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(One.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
