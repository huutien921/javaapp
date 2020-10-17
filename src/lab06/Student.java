/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author ACER
 */
public class Student {
    private int id;
    private String name;
    private String birthday;
    private String acommodation;

    public Student() {
    }

    public Student(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.acommodation = address;
    }

    public Student(int id, String name, String birthday, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.acommodation = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAcommodation() {
        return acommodation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.acommodation = acommodation;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", birthday=" + birthday + ", address=" + acommodation + '}';
    }
    
}
