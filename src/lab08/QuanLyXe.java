/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.util.List;

/**
 *
 * @author ACER
 */
public class QuanLyXe {
    protected List<Xe> loaiXe;
    protected List<TaiXe> taiXe;

    public QuanLyXe() {
    }

    public QuanLyXe(List<Xe> loaiXe, List<TaiXe> taiXe) {
        this.loaiXe = loaiXe;
        this.taiXe = taiXe;
    }

    public List<Xe> getLoaiXe() {
        return loaiXe;
    }

    public List<TaiXe> getTaiXe() {
        return taiXe;
    }

  

    @Override
    public String toString() {
        return "QuanLyXe{" + "loaiXe=" + loaiXe + ", taiXe=" + taiXe + '}';
    }
    
    
}
