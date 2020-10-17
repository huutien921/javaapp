/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author ACER
 */
public class XeTai extends Xe{
    private float gia;
    private float trongLuong;

    public XeTai() {
    }

    public XeTai(float gia, float trongLuong, String maXe, String loai, String mau, String namSX) {
        super(maXe, loai, mau, namSX);
        this.gia = gia;
        this.trongLuong = trongLuong;
    }

    public float getGia() {
        return gia;
    }

    public float getTrongLuong() {
        return trongLuong;
    }

  

    @Override
    public String toString() {
        return "XeTai{" + "gia=" + gia + ", trongLuong=" + trongLuong + '}';
    }
    
}
