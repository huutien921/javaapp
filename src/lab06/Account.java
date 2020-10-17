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
public class Account {
    private int id;
    private String userName;
    private String password;

    public Account() {
    }

    public Account(int id) {
        this.id = id;
    }

    public Account(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

   

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", userName=" + userName + ", password=" + password + '}';
    }
    
}
