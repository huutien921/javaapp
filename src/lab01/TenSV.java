/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import static javax.management.Query.value;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.security.util.Length;

/**
 *
 * @author ACER
 */
public class TenSV {
    private String name;

    public TenSV() {
    }

    public TenSV(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

public int length() {
    String value[]=null;
  return value.length;
}
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("NVA,HTD,HRT,TKR");
        String result =  a.reverse().toString();
		System.out.println(result);
                TenSV b=new TenSV("NVA,HTD,HRT,TKR");
               

                                String klt = "NVA,HTD,HRT,TKR";
      String[] str = klt.split("[,]");
      for(String s : str){
      System.out.println(s);
     
          
    }
     System.out.println("lenght= "+klt.length());
    }
}
