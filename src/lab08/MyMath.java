/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author ACER
 */
public class MyMath {
    public int add(int a,int b){
        System.out.println("----Int");
        return a+b;
    }
    public float add(float a,float b){
        System.out.println("----Float");
        return a+b;
    }
    public long add(long a,long b){
        System.out.println("----Long ");
        return a+b;
    }
    public float add(int a,float b){
        System.out.println("----Int && Float");
        return a+b;
    }
    
    public static void main(String[] args) {
        MyMath a=new MyMath();
        System.out.println("add= "+a.add(4,5));
        System.out.println("add= "+a.add(4.6f,5.6f));
        System.out.println("add= "+a.add(4,6.8f));
    }
}
