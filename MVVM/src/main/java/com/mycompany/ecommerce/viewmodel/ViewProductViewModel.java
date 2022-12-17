/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce.viewmodel;
import java.sql.*;

import static java.time.ZoneOffset.UTC;
import java.util.ArrayList;
import static java.util.Date.UTC;
import java.util.ArrayList;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ram
 */
public class ViewProductViewModel {

private ArrayList <ProductItem> products= new ArrayList<>();
private ViewProductsScreen viewProductsScreen;

    public ArrayList<ProductItem> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductItem> products) {
        this.products = products;
    }

    public ViewProductsScreen getViewProductsScreen() {
        return viewProductsScreen;
    }

    public void setViewProductsScreen(ViewProductsScreen viewProductsScreen) {
        this.viewProductsScreen = viewProductsScreen;
    }

    public ViewProductViewModel(ViewProductsScreen viewProductsScreen) {
      this.viewProductsScreen=viewProductsScreen;
    }
 
    private ProductItem product;
    private ArrayList<ProductItem> products=new ArrayList<>();
    private ViewProductsScreen VPS;

    public ViewProductViewModel(ViewProductsScreen VPS) {
        this.VPS = VPS;
    }

    
    public void viewTableDB() {
        
            try (

              
                   
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop", "myuser", "xxxx");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "myuser", "xxxx");
>>>>>>> parent of 611701a (half done)
            Statement stmt=conn.createStatement();){
                
<<<<<<< HEAD
                while(rs.next()){
                    String id=String.valueOf(rs.getInt("id"));
                    String name=String.valueOf(rs.getString("name"));
                    String price =String.valueOf(rs.getDouble("price"));
                    System.out.println(id);
                            
                          
                    ProductItem productItem=new ProductItem(Integer.parseInt(id), name,Double.parseDouble(price));
                        products.add(productItem);
                   
                }
                 
            }        catch(SQLException ex){
=======
            
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
>>>>>>> 76de764827ef1b59eecb03515d0f1cc8cf3bef3e
=======
            System.out.println("Connected sucessfully ");}
            
            
        catch(SQLException ex){
>>>>>>> parent of 611701a (half done)
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
