<%-- 
    Document   : labjsp
    Created on : Dec 11, 2024, 8:10:23 PM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Form Example</title>
    </head>
    <body>
        <h1>Form Submission</h1>

        <!-- User Input Form -->
        <form method="post">
            <label>Id</label>
            <input type="text" name="id"/><br>
            <label>Username</label>
            <input type="text" name="uname"/><br>
            <label>Password</label>
            <input type="password" name="pass"/><br>
            <label>Re-password</label>
            <input type="password" name="repass"/><br>
            <label>Gender</label>
            <input type="radio" name="gender" value="male"/>Male
            <input type="radio" name="gender" value="female"/>Female<br>
            <label>Course</label>
            <input type="checkbox" name="cr" value="java">Java
            <input type="checkbox" name="cr" value="c++">C++
            <input type="checkbox" name="cr" value="c">C<br>
            <label>Country</label>
            <select name="con">
                <option value="-1">Select Country</option>
                <option value="nepal">Nepal</option>
                <option value="usa">USA</option>
                <option value="japan">Japan</option>
            </select><br>
            <input type="submit" name="submit" value="Submit"/>
        </form>

        <%
            // Retrieving form data
            String id = request.getParameter("id");
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            String repass = request.getParameter("repass");
            String gender = request.getParameter("gender");
            String[] cr = request.getParameterValues("cr");
            String course = "";

            if (cr != null) {
                for (String val : cr) {
                    course += val + " ";
                }
            }

            String country = request.getParameter("con");

            if (id != null && uname != null && pass != null) {
                try {
                    // Database connection
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/primecsitb";
                    String suname = "root";
                    String spass = "";

                    Connection conn = DriverManager.getConnection(url, suname, spass);

                    // Insert data into the database
                    String insQuery = "INSERT INTO tbl_reg VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(insQuery);
                    ps.setString(1, id);
                    ps.setString(2, uname);
                    ps.setString(3, pass);
                    ps.setString(4, repass);
                    ps.setString(5, gender);
                    ps.setString(6, course.trim());
                    ps.setString(7, country);
                    ps.executeUpdate();

                    out.println("<p>Record inserted successfully!</p>");
                } catch (ClassNotFoundException ex) {
                    out.println("<p>Database driver not found: " + ex.getMessage() + "</p>");
                } catch (SQLException e) {
                    out.println("<p>Database error: " + e.getMessage() + "</p>");
                }
            }

            // Retrieve and display data in a table
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/primecsitb";
                String suname = "root";
                String spass = "";

                Connection conn = DriverManager.getConnection(url, suname, spass);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_reg");

                out.println("<h2>Stored Records</h2>");
                out.println("<table border='1'>");
                out.println("<tr><th>ID</th><th>Username</th><th>Password</th><th>Re-password</th><th>Gender</th><th>Course</th><th>Country</th></tr>");

                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getString("id") + "</td>");
                    out.println("<td>" + rs.getString("username") + "</td>");
                    out.println("<td>" + rs.getString("password") + "</td>");
                    out.println("<td>" + rs.getString("repassword") + "</td>");
                    out.println("<td>" + rs.getString("gender") + "</td>");
                    out.println("<td>" + rs.getString("course") + "</td>");
                    out.println("<td>" + rs.getString("country") + "</td>");
                    out.println("</tr>");
                }

                out.println("</table>");
            } catch (ClassNotFoundException ex) {
                out.println("<p>Database driver not found: " + ex.getMessage() + "</p>");
            } catch (SQLException e) {
                out.println("<p>Database error: " + e.getMessage() + "</p>");
            }
        %>
    </body>
</html>
