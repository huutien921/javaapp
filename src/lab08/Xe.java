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
public class Xe {
    private String maXe;
    private String loai;
    private String mau;
    private String namSX;

    public Xe() {
    }

    public Xe(String maXe, String loai, String mau, String namSX) {
        this.maXe = maXe;
        this.loai = loai;
        this.mau = mau;
        this.namSX = namSX;
    }

    public String getMaXe() {
        return maXe;
    }

    public String getLoai() {
        return loai;
    }

    public String getMau() {
        return mau;
    }

    public String getNamSX() {
        return namSX;
    }

    @Override
    public String toString() {
        return "Xe{" + "maXe=" + maXe + ", loai=" + loai + ", mau=" + mau + ", namSX=" + namSX + '}';
    }
    
}
