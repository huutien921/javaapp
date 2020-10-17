/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public final class ConnectDB {
    private static final String URL="jdbc:sqlserver://localhost\\LAPTOP-HROH9EH1\\SQLEXPRESS:1433;databaseName=StudentMagnagerment;";
    private static final String USER="sa";
    private static final String PWD="1234";
    
    private static ConnectDB cnnDB;
    
    
     private ConnectDB() {
    }
     
     
     
    public static ConnectDB getInstance(){
        if(cnnDB == null){
            return new ConnectDB();
        }
        return cnnDB;
    }
    
    
   
    public Connection getConnection(){
        Connection cnn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn= DriverManager.getConnection(URL,USER,PWD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnn;
    }
    public  void close(Connection cnn){
        try {
        if(cnn!=null){
            
                cnn.close();
             }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    
    public static void main(String[] args) {
        
        System.out.println(ConnectDB.getInstance().getConnection());
        ConnectDB.getInstance().close(ConnectDB.getInstance().getConnection());
    
    }
}
