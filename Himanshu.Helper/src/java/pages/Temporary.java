package pages;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;


public class Temporary extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        out.println("Welcome to temporary register page.");
    }
}
