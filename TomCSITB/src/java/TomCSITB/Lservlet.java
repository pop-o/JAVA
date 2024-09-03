package TomCSITB;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
/**
 *
 * @author HP
 */
public class Lservlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException{
        //if username and password sent by user is correct then display their complete info
        String uname=req.getParameter("uname");
        String pass=req.getParameter("pass");
        //check with db record adn sisplay in table
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2: connect with database
            String url="jdbc:mysql://localhost:3306/primecsitb";
                    // protocol      server:port    database
                    String suname="root";
                    String spass="";
                    
            Connection conn=DriverManager.getConnection(url,suname,spass);
            String checkQuery="select * from tbl_reg where username=? and password=?";
            PreparedStatement ps=conn.prepareStatement(checkQuery);
            ps.setString(1, uname);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
            //creating table to show data
            res.setContentType("text/html");
            PrintWriter pw=res.getWriter();
            pw.println("<table><tr>"
                    + "<th>Id</th>"
                    + "<th>Username</th>"
                    + "<th>Password</th>"
                    + "<th>Repassword</th>"
                    + "<th>Gender</th>"
                    + "<th>Course</th>"
                    + "<th>Country</th>"
                    + "</tr>");
            while(rs.next()){
                pw.print("<tr>"
                        +"<th>"+rs.getString("id")+"</th>"
                        +"<th>"+rs.getString("username")+"</th>"
                        +"<th>"+rs.getString("password")+"</th>"
                        +"<th>"+rs.getString("repassword")+"</th>"
                        +"<th>"+rs.getString("gender")+"</th>"
                        +"<th>"+rs.getString("course")+"</th>"
                        +"<th>"+rs.getString("country")+"</th>"
                );
            }
                pw.print("</table>");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
