package Unit4DatabaseJDBC;

/**
to connect with external data source like xml file, sql server  we need JDBC driver. for such driver mysql-connector jar needs to downloaded

step to connect with database
1. Insert the JDBC driver (jar file) in library
*2. Initialize JDBC driver using Class.forName()
* 3. use connection object to connect with database
* for this DriverManager.getConnection() is used it takes three parameter (protocol, serverusername, serverpassword)
* 4. Write appropriate query
* 5. execute query
* 6. close connection
* 
*/

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        //step 1: initialize druver (jarfile)
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException c){
            //throw if driver not found
            System.out.println(c);
        }catch(SQLException s){
            //throw if sql query is not correct
            System.out.println(s);
        }
    }
}
