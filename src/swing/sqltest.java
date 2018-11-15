/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import java.sql.*;

/**
 *
 * @author ravi_
 */
public class sqltest {
    public static void main(String[] args) {
        Connection con=null;

        try //try connection to database
        {
            //load driver
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Oracle JDBC driver loaded ok.");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","Oracle_1");
            System.out.println("Connected with the database.");

            //declaring statement
            Statement stmt = con.createStatement();

            String trial="select * from cart1"; //do not add the semicolon(;) after closing the parenthesis.

            ResultSet rows2 = stmt.executeQuery(trial);

            int count=0;
            while (rows2.next())
            {
                count+=1;
                String userID = rows2.getString("userid");
                String itemID = rows2.getString("itemid");
                String quantity = rows2.getString("cart_quantity");
                System.out.println("Row #:"+count);
                System.out.println("Product#: "+userID);
                System.out.println("Product Name: "+itemID);
                System.out.println("Price: "+quantity);

            }
            con.close();
        }
        
        catch (Exception e)
        {
            System.err.println("Exception:"+e.getMessage());
        }


        
    }
    
}
