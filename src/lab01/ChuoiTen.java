

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.Arrays;

/**
 *
 * @author huuti
 */
public class ChuoiTen {
    private String dsten;

    public ChuoiTen() {
    }

    public ChuoiTen(String dsten) {
        this.dsten = dsten;
    }

    public String getDsten() {
        return dsten;
    }

    public void setDsten(String dsten) {
        this.dsten = dsten;
    }

   public String chiaTen(){
       String[] ten = dsten.split("[,]");
        StringBuffer t=new StringBuffer();
       for(String s : ten){
       t.append(s.toString());
        t.append("\n");
      }
   
   return t.toString();
   }
   public boolean timTen(String name){
   String[] ten = dsten.split("[,]");
       for(String s : ten){
       if (s.equals(name)){
       return true;
       }
       
       }
       return false;
   }
   public String daoNguoc(){
   StringBuilder dn = new StringBuilder(dsten);
   return dn.reverse().toString();
   }
   

   public int[] countChuoi(){
       int dem = 0;
       int[] mang= new int[demPT()];
    
        String[] ten = dsten.split("[,]");
   for(String s : ten){
     mang[dem]=Integer.valueOf(s.length());
    
      dem++;
   }
   return mang;
   }
  public int demPT(){
   int d =0;
    String[] ten = dsten.split("[,]");
     for(String S:ten){
         
     d++;
     }
     return d;
   }

    @Override
    public String toString() {
        return "ChuoiTen{" + "dsten=" + dsten + '}';
    }
   
   
   
    public static void main(String[] args) {
        ChuoiTen chuoi1= new ChuoiTen("nguyenhuutien,nguyenvana,nguyentrandanthy");
         System.out.println(chuoi1.chiaTen());
        System.out.println(chuoi1.daoNguoc());
        System.out.println("ChuoiTen"+chuoi1.timTen("nguyenvana"));
        
        System.out.println(Arrays.toString(chuoi1.countChuoi()));
        
    }
    
}