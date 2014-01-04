/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database_interface;

import java.sql.*;
import javax.sql.*;
import java.sql.Connection;
import java.sql.DriverManager.*;





/**
 *
 * @author carterzenk
 */
public class Connect
{
    private Connection jdbcConnection = null;
    
    
    public static Connection makeConnection(String serverHost,
           String serverPort, String user, String password) throws Exception {
        Connection conn = null;
 
        // JDBC connection url
        String URL = "jdbc:sharenet://" + serverHost + ":" + serverPort;
 
    
 
        com.sas.net.sharenet.ShareNetDriver snd = new com.sas.net.sharenet.ShareNetDriver();
        conn = snd.connect(URL, prop);
 
        return conn;
}
    
    
   public static void main (String[] args)
   {
       // create a connection and load student information
        try {
           jdbcConnection = makeConnection("", "", "", "");           
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
   }
}