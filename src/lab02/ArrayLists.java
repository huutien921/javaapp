/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.awt.Event;
import java.util.*;

/**
 *
 * @author ACER
 */
public class ArrayLists {

    public ArrayLists() {
    }
    public List<String> songuyento(){
        List<String> listObj=new ArrayList<String>();
              for(int ctr=1;ctr<=10;ctr++){
                  if(ktnt(ctr)==1){
                      listObj.add(""+new Integer(ctr));
                  }
              }
        return listObj;
    }
    public int ktnt(int a){
        int d=0;
         for(int ctr=1;ctr<=10;ctr++){
             if(a%ctr==0)
             {
                 d++;
             }
         }
         if(d==2){
             return 1;
         }
         else{return 0;}
    }
    public List<String> device(){
         List<String> listObj=new ArrayList<String>();
        for(int ctr=1;ctr<=50;ctr++)
        {
            if(ctr%3==0&&ctr%5==0)
            {
                listObj.add("chia 3 va 5: "+new Integer(ctr));
            }
        }
       
        return listObj;
    }
public List<String> remove(){
     List<String> listObj=new ArrayList<String>();
   
          for(int ctr=-4;ctr<=10;ctr++)
        {
            listObj.add(""+new Integer(ctr));
            if(ctr<0){
                listObj.remove(""+new Integer(ctr));
            }
        }
        
        
        return listObj;

}
public List<String> add(){
    List<String> listObj=new ArrayList<String>();
    
    
    for(int ctr=-4;ctr<=10;ctr++)
        {
            listObj.add(""+new Integer(ctr));
        }
    listObj.add("value is: "+new Integer(4));
         return listObj;
}
public List<String> array(){
    List<String> listObj=new ArrayList<String>();
        ArrayLists a=new ArrayLists();
         System.out.println("The size is: "+listObj.size());
        for(int ctr=1;ctr<=10;ctr++)
        {
            listObj.add("value is:"+new Integer(ctr));
        }
      
        
        return listObj;
}

    public static void main(String[] args) {
       List<String> listObj=new ArrayList<String>();
        ArrayLists a=new ArrayLists();
        
        System.out.println(a.array());
           /*-------------------------------------------------------------*/
        System.out.println("------------Device--");
        System.out.println(a.device());
        
           /*-------------------------------------------------------------*/
        System.out.println("------------add--");
        
        System.out.println(a.add());
         
       
        
             /*-------------------------------------------------------------*/
          System.out.println("------------REMOVE--");
        System.out.println(a.remove());
        
             /*-------------------------------------------------------------*/
         System.out.println("------------SONGUYENTO--");
         System.out.println(a.songuyento());
         
         
    }
 
   
    
}
