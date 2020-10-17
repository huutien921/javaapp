/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class ThreadTest {
    public static void main(String[] args) {
        
        Thread allThread=new Thread(new Runnable() {
            @Override
            public void run() {
                 Thread CountThread = new CountThread();
        CountThread.start();
        ThreadRunable trl = new ThreadRunable();
        Thread t1 = new Thread(trl);
        
        t1.start();
        
            }
        });
       allThread.start();
        /*CountThread.setName("Count Thread");
        CountThread.setPriority(10);
        
        System.out.println("Thread name = " + CountThread.getName());
        System.out.println("Priority = " + CountThread.getPriority());
        System.out.println("IsALive =" + CountThread.isAlive());
        System.out.println("Is Daemon =" + CountThread.isDaemon());
        System.out.println("Is Interupt =" + CountThread.isInterrupted());*/
        
    }
    
}
