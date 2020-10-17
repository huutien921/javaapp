/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class AccountDB implements GennericDAO<Boolean,Account,Integer>{

    
    public  Boolean insert(Account acc){
        
        try {
            
            Connection cnn= ConnectDB.getInstance().getConnection();
            Statement st =cnn.createStatement();
            int result=st.executeUpdate("INSERT INTO account VALUES('"+acc.getUserName()+"','"+acc.getPassword()+"')");
            
            ConnectDB.getInstance().close(cnn);
            
            return  result ==1;
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public  Boolean delete(Integer id){
         
            Connection cnn= ConnectDB.getInstance().getConnection();
            String sql="DELETE FROM ACCOUNT where id=?";
        try {
            PreparedStatement ps=cnn.prepareCall(sql);
            ps.setInt(1, id);
            int result=ps.executeUpdate();
            ConnectDB.getInstance().close(cnn);
            return result==1;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
           return false;
        
    }
     public  Boolean update(Account acc){
          Connection cnn= ConnectDB.getInstance().getConnection();
            String sql="UPDATE ACCOUNT set userName=? ,password=? where id=? ";
        try {
            PreparedStatement ps=cnn.prepareCall(sql);
            ps.setString(1,acc.getUserName());
            ps.setString(2,acc.getPassword());
            ps.setInt(3,acc.getId()); 
             int result=ps.executeUpdate();
            ConnectDB.getInstance().close(cnn);
            return result==1;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
             return false;
     }
     /*------------*/
    
     /*-----------*/
     public List<Account> findAll(){
         List<Account> result=new ArrayList<>();
         Connection cnn= ConnectDB.getInstance().getConnection();
            String sql="SELECT * FROM account";
        try {
            PreparedStatement ps=cnn.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                int id= rs.getInt(1);
                String userName=rs.getString(2);
                String password=rs.getString(3);
                Account acc=new Account(id, userName, password);
                result.add(acc);
                
            }
            ConnectDB.getInstance().close(cnn);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
     }
     /*------------------------------------------------------*/
   @Override
    public Account find(Integer k) {
       
     
        String sql="SELECT * FROM account where id=?";
        Connection cnn=ConnectDB.getInstance().getConnection();
       
        try {
           
            
            
             PreparedStatement ps;
            ps=cnn.prepareCall(sql);
             ps.setInt(1, k);
             ResultSet rs=ps.executeQuery();
             
             if(rs.next()){
                 
                  Integer id= rs.getInt(1);
              String userName=rs.getString(2);
                String password=rs.getString(3);
                Account acc=new Account(k,userName,password);
                
                
                 ConnectDB.getInstance().close(cnn);
            return acc;
                
            }
       
        } catch (SQLException ex) {
            Logger.getLogger(AccountDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
       return null;
    }
    
    public static void main(String[] args) {
        
        
        
   //  System.out.println("Isert= "+AccountDB.insert(new Account("NVY","1234")));
    //  System.out.println("Isert= "+AccountDB.insert(new Account("FHU","154")));
       // System.out.println("Delete= "+AccountDB.delete(2));
     // System.out.println("Update="+AccountDB.update(new Account(1,"NHR","125")));
     
       /* List<Account> result=AccountDB.findAll();
        for(Account acc:result){
            System.out.println(acc);
    }*/
       /*----------------------------------------------*/
       
       GennericDAO<Boolean,Account,Integer> accDB=new AccountDB();
      //  System.out.println("Insert= "+accDB.insert(new Account("NBG","1234")));
        // System.out.println("Delete= "+accDB.delete(3));
        // System.out.println("Update="+accDB.update(new Account(1,"NHR","125")));
        
        System.out.println("Find id= "+accDB.find(9));
      
     /* List<Account> result= accDB.findAll();
       for(Account acc:result){
           System.out.println(acc);
       }*/
       
    } 

   
}
