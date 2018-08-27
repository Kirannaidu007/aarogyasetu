
package com;
import java.sql.*;
public class connect
{
    static Connection c;
    static Statement s;
    static PreparedStatement pst;
    public static PreparedStatement makeConnection(String sql)
    {
       try
       {
       Class.forName("com.mysql.jdbc.Driver");
       c=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dit","root","admin");
      
       
       pst=c.prepareStatement(sql);
       
       }
       catch(Exception e)
       {
           
       }
       return pst;
    }
    public static void closeConnection()
    {
        try
        {
            pst.close();
            c.close();
        }
        catch(Exception e)
        {
            
        }
    }
}
