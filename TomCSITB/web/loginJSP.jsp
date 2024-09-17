<%-- 
    Document   : loginJSP
    Created on : Sep 4, 2024, 9:06:22 AM
    Author     : HP
    JSP stands for java server page and here both front end and backend 
    and code can be embedded. for frontend html is used and for backend declarative is used
--%>
<!--declarative <%%>-->

<!--need to remember-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for(int i=1;i<=10;i++){
            out.println("Hello world!");
            }
        %>
        <form method="post">
                
                <label>Id</label>
                <input type="text" name="id"/></br>
                <label>Username</label>
                <input type="text" name="uname"/></br>
                <label>Password</label>
                <input type="password" name="pass"/></br>
                <label>Re-password</label>
                <input type="password" name="repass"/></br>
                <label>Gender</label>
                <input type="radio" name="gender" value="male"/>Male
                <input type="radio" name="gender" value="female"/>Female</br>
                <label>Course</label>
                <input type="checkbox" name="cr" value="java">Java
                <input type="checkbox" name="cr" value="c++">c++
                <input type="checkbox" name="cr" value="c">c</br>
                <label>country</label>
                <select name="con">
                    <option value="-1">Select Country</option>
                    <option value="nepal">Nepal</option>
                    <option value="usa">USA</option>
                    <option value="japan">Japan</option>
                </select></br>
                <input type="submit" name="submit" value="submit"/>
                
                
            </form>
        
        <%
          String id=request.getParameter("id");
          String uname=request.getParameter("uname");
          String pass=request.getParameter("pass");
          String repass=request.getParameter("repass");
          String gender=request.getParameter("gender");
          String []cr=request.getParameterValues("cr");
          String course="";
          if(cr!=null){
            for(String val:cr){
                course+=val+" ";
            }
            }
          String country=request.getParameter("con");
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
            ps.setString(6,course);
            ps.setString(7,country);
            ps.execute();
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException e){
            System.out.println(e);
        }
        %>
    </body>
</html>
