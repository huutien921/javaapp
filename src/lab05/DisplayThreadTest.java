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
public class DisplayThreadTest {
    public static void main(String[] args) {
        One one= new One();
        Thread t1=new DisplayThread(one);
        Thread t2=new DisplayThread(one);
        t1.start();
        t2.start();
    }
}
