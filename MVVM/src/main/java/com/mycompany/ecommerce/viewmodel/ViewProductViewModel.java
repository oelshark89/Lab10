/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce.viewmodel;
import com.mycompany.ecommerce.model.ProductItem;
import com.mycompany.ecommerce.view.ViewProductsScreen;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ram
 */
public class ViewProductViewModel {
    private ProductItem product;
    private ArrayList<ProductItem> products=new ArrayList<>();
    private ViewProductsScreen VPS;

    public ViewProductViewModel(ViewProductsScreen VPS) {
        this.VPS = VPS;
    }
    
    public void viewTableDB() {
        
            try (
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/bookshop", "myuser", "0000");
            Statement stmt=conn.createStatement();){
                String strSelect = "select * from products";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                int id = rset.getInt("id");
                String name = rset.getString("name");
                double price = rset.getDouble("price");
                product = new ProductItem(id, name, price);
                 products.add(product);
            }
            VPS.setdata();
           }
            
            
        catch(SQLException ex){
           ex.printStackTrace();
                     }
    }
    
    
   public String[][] toArray() {
        String[][] x = new String[products.size()][3];
        for (int i = 0; i < products.size(); i++) {
            x[i][0] = products.get(i).getName();
            x[i][1] = Integer.toString(products.get(i).getId());
            x[i][2] = Double.toString(products.get(i).getPrice());
        }
        return x;
    }  
            
}
