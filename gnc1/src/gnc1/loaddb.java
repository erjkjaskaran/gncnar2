/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnc1;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class loaddb {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    loaddb()
    {
    try{
        con=DriverManager.getConnection("jdbc:ucanaccess://E:\\GNC.accdb;memory=true");
    }
    catch(Exception e)
    {
        System.out.println("Exception in loaddb1");
    }
    try{
        stmt=con.createStatement();
    }
    catch(Exception e)
    {
        System.out.println("Exception in loaddb2");
    }
    }
    public void update(String qry) throws Exception
    {
        stmt.executeUpdate(qry);
    }
    public ResultSet execute(String qry) throws Exception
    {
        try{
            rs=stmt.executeQuery(qry);
        }
        catch(Exception e)
        {
            System.out.println("exception in resultset in load db");
        }
        return rs;
    }
}
