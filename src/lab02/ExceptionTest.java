/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;


public class ExceptionTest {
    public static void main (String[] args){
         int a[] = new int[2];
        try{
           
            System.out.println("Access elemant three :" + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Exception thrown :" + e);
        }
       finally{
            a[0]=6;
            System.out.println("Firsst element value "+a[0]);
            System.out.println("the finally stament is excutes");
        }
    }
}
