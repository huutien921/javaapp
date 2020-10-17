/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class QuanLySinhVien {
    private List<SinhVien> dssv;

    public QuanLySinhVien() {
        this.dssv=new ArrayList<>();
    }

    public QuanLySinhVien(List<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public List<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(List<SinhVien> dssv) {
        this.dssv = dssv;
    }
    public boolean addSinhVien(SinhVien sv){
        return dssv.add(sv);
    }
    /*------------------------------------------------------*/
    
   private boolean isExistMSSV(String maSo){
       
        for(SinhVien sv:this.dssv){
            //if(maSo.equals(i.getMaSo())){
                if(sv.isSameMSSV(maSo)){
       
              
                return true;
            }
        }
        return false;
    }
   /*-------------------------------------------------------*/
   
   public boolean removeSinhVienByMSSV(String maSo)throws SinhVienNotFoundException{
       
           for(SinhVien sv:this.dssv){
               if(sv.isSameMSSV(maSo)){
                   this.dssv.remove(sv);
                   return true;
               }
           }
           throw new SinhVienNotFoundException("Sinh Vien not found");
       
   }
   
   /*---------------------------------------------------*/
   
   public List<SinhVien> sapXep(){
       List<SinhVien> dssvTemp=new ArrayList<>(this.dssv);
       Collections.sort(dssvTemp,new Comparator<SinhVien>(){

           @Override
           public int compare(SinhVien sv1, SinhVien sv2) {
               int compareResult=sv1.getTuoi()-sv2.getTuoi();
              if(compareResult>0){
                  return 1;
              }else if(compareResult==0){
                 int compareResultten= sv1.getTen().compareTo(sv2.getTen());
                 if(compareResultten>0){
                     return 1;
                 }
                 return -1;
              }else
                  return -1;
           }
          
           
       });
       return dssvTemp;
       
   }
   /*-----------------------NAME------------------------------*/
   
   public List<SinhVien> layDSSVTheoTen(String ten)throws SinhVienNotFoundException{
       List<SinhVien> result=new ArrayList<>();
       for(SinhVien sv:this.dssv){
           if(sv.isSamename(ten)){
               result.add(sv);
                return result;

           }
       }
       throw new SinhVienNotFoundException("Not found");
            
   }
   /*----------------------------AGE---------------------------------*/
   private List<SinhVien> layDSSVTheoTuoi(int tuoi){
       List<SinhVien> result1=new ArrayList<>();
       for(SinhVien sv:this.dssv){
           if(sv.age(tuoi)){
               result1.add(sv);
           }
       }
       return result1;
   }
   /*--------------------------------------------------------*/
    public List<SinhVien> layDSSVTheoGioiTinh(String gioiTinh){
       List<SinhVien> result1=new ArrayList<>();
       for(SinhVien sv:this.dssv){
           if(sv.gioiTinh(gioiTinh)){
               result1.add(sv);
           }
       }
       return result1;
   }
    public void writeToFIle(String fileName,int tuoi){
        List<SinhVien> result= layDSSVTheoTuoi(tuoi);
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
            fos =new FileOutputStream(fileName);
            oos =new ObjectOutputStream(fos);
            System.out.println("---------Start----------- ");
            for(SinhVien sv:result){
                oos.writeObject(sv);
                oos.flush();
            }
            System.out.println("------------End------------ ");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    public List<SinhVien> readFile(String fileName){
         List<SinhVien> result= new ArrayList<SinhVien>();
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName));
            Object read=ois.readObject();
            while(read!=null){
                SinhVien sv=(SinhVien)read;
                result.add(sv);
                read =ois.readObject();
            }
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
 //for(int i=0;i<this.dssv.size();i++){
    // if(this.dssv.get(i).kiemTraMS(maSo)){