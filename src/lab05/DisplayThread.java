/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author ACER
 */
public class DisplayThread extends Thread{
    private One one;
    
    public DisplayThread(One one){
        this.one=one;
    }
    public void run(){
        synchronized(one){
        one.display();
        }
    }
    
}