/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author ACER
 */
public class Student {
    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student s=(Student)obj;
            if(this.name.equals(s.getName())&&this.id.equals(s.getId())&&this.age == s.age){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return this.age+this.id.hashCode()+this.name.hashCode();
    }
}
