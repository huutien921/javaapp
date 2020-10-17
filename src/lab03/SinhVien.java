/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class SinhVien implements Serializable{
    private String maSo;
    private String ten;
    private int tuoi;
    private String gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSo, String ten, int tuoi, String gioiTinh) {
        this.maSo = maSo;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String GioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSo=" + maSo + ", ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + '}'+"\n";
    }
    /*public boolean kiemTraMS(String maSo)
    {
        if(maSo.equals(maSo)){
            return true;
        }
        return false;
    }*/
public boolean isSameMSSV(String maSo)
{
    return this.maSo.equals(maSo);
    
}
   public boolean isSamename(String ten)
{
    return this.ten.equals(ten);
    
} 
      public boolean age(int tuoi)
{
    return this.tuoi>tuoi;
    
} 
           public boolean gioiTinh(String gioiTinh)
{
    return this.gioiTinh.equals(gioiTinh);
    
}
      
}
