/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student("SV01","Teo",1991);
        Student s2=new Student("SV01","Teo",1991);
        Student s3=new Student("SV02","Ti",1994);
        Student s4=new Student("SV03","Tri",1997);
        Set<Student> students =new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println("Size= "+students.size());
    }
    
}
