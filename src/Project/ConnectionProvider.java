
package Project;

import java.sql.*; // importing code for interacting with sql database


public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hstl","user", "password");
            return con;
        } catch(Exception e) {
            return null;
        }
    }
    
}
