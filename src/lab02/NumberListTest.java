/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ACER
 */
public class NumberListTest {

    public NumberListTest() {
    }
    public ArrayList<Integer> add(){
         ArrayList<Integer> arr = new ArrayList<>();
 
  arr.add(50);
  arr.add(20);
  arr.add(45);
  arr.add(82);
   arr.add(25);
    arr.add(63);
    arr.add(-63);
  
  System.out.println("Given number: ");
  
  return arr;
    }
   /* public NumberList device()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        NumberList b=new NumberList();
         System.out.println("Device");
     
          if(b.add()%3==0&&b.add()%5==0){
              return b;
          }
     
      return b;
    }*/
    public static void main(String[] args) {
        
    
    NumberListTest n=new NumberListTest();
        System.out.println(n.add());
       // System.out.println(n.device());
        
    int limit = 100;
                System.out.println("So nguyen to tu 1 den " + limit);
                for(int i=1; i < 100; i++){
                        boolean isPrime = true;

                        for(int j=2; j < i ; j++){

                                if(i % j == 0){
                                        isPrime = false;
                                        break;
                                }
                        }

                        if(isPrime)
                                System.out.print(i + " ");
                }
    }

    

   
}
