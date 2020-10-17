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
public class Taxi extends Xe{
    private int chongoi;
    private float gia;

    public Taxi() {
    }

    public Taxi(int chongoi, float gia, String maXe, String loai, String mau, String namSX) {
        super(maXe, loai, mau, namSX);
        this.chongoi = chongoi;
        this.gia = gia;
    }

    public int getChongoi() {
        return chongoi;
    }

    public float getGia() {
        return gia;
    }

    @Override
    public String getNamSX() {
        return super.getNamSX(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMau() {
        return super.getMau(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLoai() {
        return super.getLoai(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaXe() {
        return super.getMaXe(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


}
