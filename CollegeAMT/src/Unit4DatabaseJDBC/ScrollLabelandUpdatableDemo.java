
package Unit4DatabaseJDBC;

/**
using only result set we can fetch data from row 1 to row 2 to row 3 sand so on. but using scroll label and update table result set
* we can fetch data of any row and also can be updated
*/
import java.util.*;
import java.sql.*;
public class ScrollLabelandUpdatableDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2: connect with database
            String url="jdbc:mysql://localhost:3306/primecsitb";
                    // protocol      server:port    database
                    String suname="root";
                    String spass="";
                    
            Connection conn=DriverManager.getConnection(url,suname,spass);
            String insQuery="insert into tbl_reg values(?,?,?,?,?,?,?)";
//            PreparedStatement ps=conn.prepareStatement(insQuery);
//            ps.setString(1, "2");
//            ps.setString(2, "poem");
//            ps.setString(3, "poem");
//            ps.setString(4, "poem");
//            ps.setString(5, "poem");
//            ps.setString(6, "poem");
//            ps.setString(7, "poem");
//            ps.executeUpdate();
            String disQuery ="select * from tbl_reg";
            //creating scrolllabel and updatetable result set
            int scroll=ResultSet.TYPE_SCROLL_SENSITIVE;
            //to create updatable: to do update operation
            int updatable=ResultSet.CONCUR_UPDATABLE;
            //to make readonly
            int read=ResultSet.CONCUR_READ_ONLY;
            Statement st=conn.createStatement(scroll,updatable);
            ResultSet rs=st.executeQuery(disQuery);
            System.out.println("---fetching last row data---------");
            rs.last();
            System.out.println("id is: "+rs.getString("id"));
            System.out.println("username is: "+rs.getString("username"));
            System.out.println("password is: "+rs.getString("password"));
            System.out.println("repassword is: "+rs.getString("repassword"));
            System.out.println("gender is: "+rs.getString("gender"));
            System.out.println("course is: "+rs.getString("course"));
            System.out.println("country is: "+rs.getString("country"));
            
            //display data  of all users:
            rs.beforeFirst();
            while(rs.next()){
                System.out.println("Username is:"+rs.getString("username"));
                System.out.println("gender is"+rs.getString("gender"));
            };
            
            rs.beforeFirst();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter username you want to change gender for");
            String uname=sc.nextLine();
            rs.next();
            if(rs.getString("username").equals(uname)){
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("gender"));
            };
            
            System.out.println("Enter the changed gender");
            String gen=sc.nextLine();
            while(rs.next()){
                if(rs.getString("username").equals(uname)){
                    rs.updateString("gender", gen);
                }
            };
            rs.beforeFirst();
            while(rs.next()){
                System.out.println("username is"+rs.getString("username"));
                System.out.println("gender is"+rs.getString("gender"));
            }
            //to fetch data of any row
            System.out.println("-------fetching 3rd row data");
            rs.absolute(3);
            System.out.println("id is: "+rs.getString("id"));
            System.out.println("username is: "+rs.getString("username"));
            
            
            System.out.println("-------fetching 2nd row data");
            rs.absolute(3);
            System.out.println("id is: "+rs.getString("id"));
            System.out.println("username is: "+rs.getString("username"));
            //to delete data of user with the username poem
            rs.beforeFirst();
            System.out.println("Print username you want to delete");
            String dname=sc.nextLine();
            while(rs.next()){
                if(rs.getString("username").equals(dname));
                rs.deleteRow();
            };
            
            rs.beforeFirst();
            while(rs.next()){
                System.out.println("Username is:"+rs.getString("username"));
            };
            //update username to sam for row 2
            System.out.println("-------updating 2nd row data");
            rs.absolute(2);
            rs.updateString("username", "Popo");
            rs.updateRow();
            System.out.println("id is: "+rs.getString("id"));
            System.out.println("username is: "+rs.getString("username"));
        }catch(SQLException s){
            System.out.println(s);
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }
    }
}
