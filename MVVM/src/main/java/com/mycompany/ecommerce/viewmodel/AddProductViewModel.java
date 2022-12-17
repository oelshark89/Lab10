/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce.viewmodel;
import com.mycompany.ecommerce.model.ProductItem;
import java.sql.*;
/**
 *
 * @author ram
 */
public class AddProductViewModel {
     private String id;
     private String name;
     private String price;
     private ViewProductViewModel viewProductViewModel;
    public AddProductViewModel(String id,String name,String price,ViewProductViewModel viewProductViewModel) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.viewProductViewModel=viewProductViewModel;
    }
    public void addProduct(){
         try (   
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop", "myuser", "xxxx");
            Statement stmt=conn.createStatement();){
            ProductItem product  =new ProductItem(Integer.parseInt(id), name, Double.parseDouble(price));
             String sql="insert into books values ( "+Integer.parseInt(this.id)+" , '"+this.name+"' , "+Double.parseDouble(this.price)+" )";
              stmt.executeUpdate(sql);
              viewProductViewModel.getProducts().add(product);
              
             
                  
                }
        catch(SQLException ex){
           ex.printStackTrace();
                                    
        
    }

       viewProductViewModel.toTable();
        
    }
    public boolean validate(String id,String name,String price){
        try{
            int x=Integer.parseInt(id);
            String y=name;
           double z=Double.parseDouble(price);
            return true;
        }catch(NumberFormatException ex){
           //ex.printStackTrace();
            return false;
            
        }
        
      
    }
    
    
    
}
