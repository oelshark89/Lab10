/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce.viewmodel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ram
 */
public class ViewProductViewModel {
    
    public void viewTableDB() {
        
            try (
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "myuser", "xxxx");
            Statement stmt=conn.createStatement();){
                
            System.out.println("Connected sucessfully ");}
            
            
        catch(SQLException ex){
           ex.printStackTrace();
                    
                    
        
    }
    }
    
    
    public static void main(String[] args)
    {
        
    
    }     
            
}
