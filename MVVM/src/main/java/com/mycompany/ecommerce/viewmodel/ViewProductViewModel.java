/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce.viewmodel;
import com.mycompany.ecommerce.model.ProductItem;
import com.mycompany.ecommerce.view.ViewProductsScreen;
import java.sql.*;
import static java.time.ZoneOffset.UTC;
import java.util.ArrayList;
import static java.util.Date.UTC;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
 
    
    public void viewTableDB()  {
        
            try (
              
                   
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop", "myuser", "xxxx");
            Statement stmt=conn.createStatement();){
                String sql = "select * from books";
                ResultSet rs=stmt.executeQuery(sql);
                viewProductsScreen.setColumnNames(new String[]{"id","name","price"}); 
                
                while(rs.next()){
                    String id=String.valueOf(rs.getInt("id"));
                    String name=String.valueOf(rs.getString("name"));
                    String price =String.valueOf(rs.getDouble("price"));
                    
                            
                          
                    ProductItem productItem=new ProductItem(Integer.parseInt(id), name,Double.parseDouble(price));
                        products.add(productItem);
                   
                }
                 
            }        catch(SQLException ex){
           ex.printStackTrace();
            }
                    
        
    }
    
        public void toTable(){
      String [][] data=new String[products.size()][3];
                 for(int i=0;i<products.size();i++){
                    
                     int x=products.get(i).getId();
                    
                     data[i][0]=Integer.toString(x);
                     data[i][1]=products.get(i).getName();
                     data[i][2]=Double.toString(products.get(i).getPrice());
                     
                 }
                  viewProductsScreen.setData(data);
                  
                }
    
    public static void main(String[] args)
    {
        
    
    }     
            
}
