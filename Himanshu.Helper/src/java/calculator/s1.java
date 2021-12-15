
package calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static sun.swing.SwingUtilities2.submit;

public class s1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        { 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>S1 servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet s1 at " + request.getContextPath() + "</h1>");
            String n1 =  request.getParameter("n1");
            out.println("<h1>value of n1 is " + n1 + "</h1>");
            String n2 =  request.getParameter("n2");
            out.println("<h1>value of n2 is " + n2 + "</h1>");
            
            String name = request.getParameter("name");
            out.println("<h1>Welcome "+name+" to my website.</h1>");
            
            Cookie c =new Cookie("user_name",name);
            response.addCookie(c);
            
            int nn1 = Integer.parseInt(n1);
            
            int nn2 = Integer.parseInt(n2);
            
            int s = nn1+nn2;
            
            request.setAttribute("sum", s);
            
            out.println("<h1><a href='s2'>Go to s2</h1>");
//            RequestDispatcher rd = request.getRequestDispatcher("s2");
//            rd.include(request, response);
          
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
