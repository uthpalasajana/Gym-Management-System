/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
import java.lang.*;
/**
 *
 * @author quach
 */
public class ConnectionProvider {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/gympaas";
        String username = "root";
        String password = "uthpala";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connnection = DriverManager.getConnection(url,username,password);
            return connnection;
        }catch(Exception e){
            return null;
        }
    }

    
}
