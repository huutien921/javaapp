/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author ACER
 */
public class SinhVien {
    private String id;
    private int age;

    public SinhVien() {
    }

    public SinhVien(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj instanceof SinhVien){
            SinhVien s=(SinhVien)obj;
            if(s.getId().equals(this.id)&& s.getAge()==this.age){
                return true;
            }
        }
        return  false;
    }
    public int hashCode(){
        return this.id.hashCode()+this.age;
    }
    public static void main(String[] args) {
        SinhVien teo=new SinhVien("SV01", 15);
          SinhVien teo1=new SinhVien("SV01", 15);
          System.out.println("Equals= "+teo.equals(teo1));
    }
    
}
