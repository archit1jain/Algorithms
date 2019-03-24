import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet1 extends HttpServlet 
{
   public void doGet(HttpServletRequest request, 
      HttpServletResponse response) {
      try{
          response.setContentType("text/html");
          PrintWriter pwriter = response.getWriter();

          String name = request.getParameter("user");
          String campus = request.getParameter("campus");
          pwriter.print("Hi "+name);
          pwriter.print(" from "+campus + " Campus!!");

          //Creating two cookies
          Cookie c1=new Cookie("user",name);
          Cookie c2=new Cookie("campus",campus);

          //Adding the cookies to response header
          response.addCookie(c1);
          response.addCookie(c2);
          pwriter.println("<br><a href='welcome'>View Details</a>");
          pwriter.println("<br><a href='index.html'>back</a>");
          pwriter.close();
   }catch(Exception exp){
       System.out.println(exp);
    }
  }
}