
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.sql.*;
/**
 *
 * @author hp
 */
public class MySqlConnection {
    
        private static final String username = "root";
        private static final String password = "sony";
        private static final String CONN_STRING="jdbc:mysql://localhost:3306/hostelmgmt";    //Loading JDBC driver for SQL
        static Connection conn = null;
        MySqlConnection()
    {
       
        
        
        
        try
        {
            conn = DriverManager.getConnection(CONN_STRING,username,password); //Connection Established between netbeans and SQL
            System.out.println("Connected Database");                          //Database connection Successful message
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        MySqlConnection my = new MySqlConnection();
    }
}