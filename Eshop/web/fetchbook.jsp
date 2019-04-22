<%-- 
    Document   : fetchbook
    Created on : Mar 29, 2019, 9:00:25 PM
    Author     : Archit
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.ArrayList,java.util.*"%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E Shop Page</title>
    </head>
    <body>
    <%
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost/phpmyadmin","root","");
        String req_title=request.getParameter("title");
        PreparedStatement ps=con.prepareStatement("select * from books where title like '%"+req_title+"%'");  
        ResultSet rs=ps.executeQuery();
        %>
        <h2>16BCE2318</h2>
        <table border="1" width="90%">  
            <tr><th>Id</th><th>Title</th><th>Author</th><th>Price</th><th>Qty</th></tr>
        <%
        while(rs.next()){  
            int id=rs.getInt("id");  
            String title=rs.getString("title");
            String author=rs.getString("author");  
            float price=rs.getFloat("price"); 
            int qty=rs.getInt("qty");
            
        %>  
            <tr><td><%=id%></td><td><%=title%></td><td><%=author%></td><td><%=price%></td><td><%=qty%></td></tr>  
            
            <%
            
        }
        %>
        </table>
        <%
    }catch(Exception e){System.out.println(e);}
    %>
    </body>
</html>

