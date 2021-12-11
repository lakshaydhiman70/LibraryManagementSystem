/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author Lakshay
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","1");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
