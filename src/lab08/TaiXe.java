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
public class TaiXe {
    private String matx;
    private String tentx;
    private int sdt;

    public TaiXe() {
    }

    public TaiXe(String matx, String tentx, int sdt) {
        this.matx = matx;
        this.tentx = tentx;
        this.sdt = sdt;
    }

    public String getMatx() {
        return matx;
    }

    public String getTentx() {
        return tentx;
    }

    public int getSdt() {
        return sdt;
    }

    @Override
    public String toString() {
        return "TaiXe{" + "matx=" + matx + ", tentx=" + tentx + ", sdt=" + sdt + '}';
    }
    
}
