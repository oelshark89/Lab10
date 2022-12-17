/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvvm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author omare
 */
public class MVVM {

    public static void main(String[] args) {
<<<<<<< HEAD
        try (
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "myuser", "xxxx");
            Statement stmt=conn.createStatement();){
                
            System.out.println("Connected sucessfully ");}
            
            
        catch(SQLException ex){
           ex.printStackTrace();
=======

        System.out.println("Hello World!");
        System.out.println("omarr");

        System.out.println("zuzo");
        System.out.println("a7a");

    }
>>>>>>> domz
}
}
}