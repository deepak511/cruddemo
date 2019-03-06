package com.crud.crudservlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Update Title</h1>");
		String isbn=request.getParameter("isbn");
		
		Title t=TitleDao.gettitleByIsbn(isbn);
		
		out.print("<form action='EditServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='isbn' value='"+t.getIsbn()+"'/></td></tr>");
		out.print("<tr><td>title:</td><td><input type='text' name='title' value='"+t.getTitle()+"'/></td></tr>");
		out.print("<tr><td>Author:</td><td><input type='text' name='author' value='"+t.getAuthor()+"'/></td></tr>");
		out.print("<tr><td>Type:</td><td>");
		out.print("<select name='type' style='width:150px'>");
		out.print("<option>G</option>");
		out.print("<option>E</option>");
		out.print("<option>I</option>");
		out.print("<option>J</option>");
		out.print("</select>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		
		out.close();
	}
}
