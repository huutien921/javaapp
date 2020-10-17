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
public class XeKhach extends Xe{
    private int choNgoi;
    private float giaTien;
    private String tuyenDuong;

    public XeKhach() {
    }

    public XeKhach(int choNgoi, float giaTien, String tuyenDuong, String maXe, String loai, String mau, String namSX) {
        super(maXe, loai, mau, namSX);
        this.choNgoi = choNgoi;
        this.giaTien = giaTien;
        this.tuyenDuong = tuyenDuong;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public String getTuyenDuong() {
        return tuyenDuong;
    }

    @Override
    public String toString() {
        return "XeKhach{" + "choNgoi=" + choNgoi + ", giaTien=" + giaTien + ", tuyenDuong=" + tuyenDuong + '}';
    }

   
    
    
}
