/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author ACER
 */
public class HocSinh {
    private String ten;

    public HocSinh() {
    }

    public HocSinh(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }
    public String split()
    {
        
    String a = "NVA,HTD,HRT,TKR";
         String[] str = a.split("[,]");
      for(String s : str)
      
        return " "+s;
        return null;
    
    }
    
    public static void main(String[] args) {
        
        HocSinh b=new HocSinh("NAF");
        String a = "NVA,HTD,HRT,TKR";
        System.out.println("lab01.HocSinh.main()="+b.split());
    }
    
}
