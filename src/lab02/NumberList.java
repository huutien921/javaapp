/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ACER
 */
public class NumberList {
    

    public NumberList() {
    }

    
    public List<String> ArrayLists(){
          List<String> listObj=new ArrayList<String>();
        
     
        System.out.println("The size is: "+listObj.size());
        for(int ctr=1;ctr<=10;ctr++)
        {
            listObj.add("value is:"+new Integer(ctr));
        }
      
       
        return listObj;
    }
   public List<String> xoa()
    {
         List<String> listObj=new ArrayList<String>();
          for(int ctr=-5;ctr<=10;ctr++)
        {
          if(ctr<0){
              
          
            listObj.remove((Object).4);
          }
            
        }
        
        return listObj;
    }
            public static void main(String[] args) {
         NumberList a=new NumberList();
                System.out.println(a.ArrayLists());
                System.out.println(a.xoa());
                
                
    }

    int add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
