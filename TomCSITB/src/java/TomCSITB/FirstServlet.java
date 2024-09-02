package TomCSITB;

/*
Servlet is interface that is used to handle request from web browser (client) and responce from server 
to create servlet following procedure is used
    1. By Implementing servlet interface
    2. By using generic class
    3. By busing HttpServlet class
it throws servletException and IOException
*/

import java.io.*;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FirstServlet implements Servlet {
    //lifecycle method
    ServletConfig config;
    @Override
    public void init(ServletConfig sc) throws ServletException {
        //servlet created
        this.config = sc;
    }
    
    //non-lifecycle method
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }
    
    //lifecycle method
    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        //servlet execute
        sr1.setContentType("text/html");
        PrintWriter pw = sr1.getWriter();
        pw.println("<h1> This is first Servlet</h1>");
    }
    
    //non-lifecycle
    @Override
    public String getServletInfo() {
        return "first Servlet";
    }
    
    //lufecycle
    @Override
    public void destroy() {
        //servlet deleted
        System.out.println("SErvlet End");
    }
}

