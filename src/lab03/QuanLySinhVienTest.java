/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.List;

/**
 *
 * @author ACER
 */
public class QuanLySinhVienTest {
    public static void main(String[] args) {
        
        SinhVien teo=new SinhVien("SV01","NVA", 20,GenderEnum.Nam.name());
        SinhVien ngoctrinh=new SinhVien("SV02", "Ngoc Trinh", 30, GenderEnum.Nu.name());
         SinhVien ngoc=new SinhVien("SV03", "Ngoc", 36, GenderEnum.Nu.name());
          SinhVien linh=new SinhVien("SV04", "Linh", 29, GenderEnum.Nu.name());
          SinhVien lan=new SinhVien("SV04", "Lan", 19, GenderEnum.Nu.name());
          SinhVien hong=new SinhVien("SV05", "Lan", 18, GenderEnum.Nam.name());
          
          /*-------------------------------------------------*/
        QuanLySinhVien qlsv=new QuanLySinhVien();
        
        
        System.out.println("DSSV = "+qlsv.getDssv().size());
        
        /*-------------------------------------------------*/
        boolean result=qlsv.addSinhVien(teo);
        boolean result1=qlsv.addSinhVien(ngoctrinh);
         boolean result2=qlsv.addSinhVien(ngoc);
          boolean result3=qlsv.addSinhVien(linh);
          boolean result4=qlsv.addSinhVien(lan);
          boolean result5=qlsv.addSinhVien(hong);
          
          /*-------------------------------------------------*/
          System.out.println("Them Sinh Vien: "+result);
        System.out.println("Them Sinh Vien: "+result1);
        
        /*------------------------REMOVE-------------------------*/
        try{
             boolean isRemove=qlsv.removeSinhVienByMSSV("SV02");
             System.out.println("remove: "+isRemove);
        }catch(SinhVienNotFoundException ex){
            System.out.println("Error"+ex);
        }
       
        
        
 
       
        
        System.out.println("DSSV = "+qlsv.getDssv().size());
        System.out.println("Before sotr"+qlsv.getDssv());
        System.out.println("After sotr"+qlsv.sapXep());
       
          /*---------------------SAME NAME----------------------------*/  
        
        try {
            List<SinhVien> isName=qlsv.layDSSVTheoTen("Lan");
            System.out.println("The same name: "+isName);
        } catch (SinhVienNotFoundException es) {
            System.out.println("Error :"+es);
        }
        /*--------------------------AGE-----------------------*/
        
       // System.out.println("DSSV >25: "+qlsv.layDSSVTheoTuoi(25));
       
       //---------------------------Write File-----------------
        qlsv.writeToFIle("Sinh Vien.dat", 25);
        List<SinhVien> readresult =qlsv.readFile("Sinh Vien.dat");
        System.out.println("---------"+readresult);
        /*--------------------------SEX-----------------------*/
        System.out.println("DSSV nam: "+qlsv.layDSSVTheoGioiTinh("Nu"));
        
    }
    
}
