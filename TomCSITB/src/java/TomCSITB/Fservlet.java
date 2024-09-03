/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TomCSITB;

/*
to handle form or http request we have to extend HttpServlet class
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Fservlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException{
        //extract form parameter
        String id=req.getParameter("id");
        String uname=req.getParameter("uname");
        String pass=req.getParameter("pass");
        String repass=req.getParameter("repass");
        String gender=req.getParameter("gender");
        //for multiple values
        String []course=req.getParameterValues("cr");
        //convert into normal string
        String crc="";
        for(String val:course){
            crc+=val+" ";
        }
        String country=req.getParameter("con");
        
        //displat from values
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        pw.println("<h2>uname is: "+uname+"pass is: "+ pass+"re pass is: "+repass+"gender is: "+gender+"course is: "+course+"country is: "+country);
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2: connect with database
            String url="jdbc:mysql://localhost:3306/primecsitb";
                    // protocol      server:port    database
                    String suname="root";
                    String spass="";
                    
            Connection conn=DriverManager.getConnection(url,suname,spass);
            String insQuery="insert into tbl_reg values (?,?,?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(insQuery);
            
            ps.setString(1,id);
            ps.setString(2,uname);
            ps.setString(3,pass);
            ps.setString(4,repass);
            ps.setString(5,gender);
            ps.setString(6,crc);
            ps.setString(7,country);
            ps.execute();
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
