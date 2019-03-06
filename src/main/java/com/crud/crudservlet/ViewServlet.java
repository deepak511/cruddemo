package com.crud.crudservlet;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<a href='index.html'>Add New Employee</a>");
		out.println("<h1>Employees List</h1>");
		
		List<Title> list=TitleDao.getAllTitles();
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>ISBN</th><th>Title</th><th>Author</th><th>Type</th><th>Edit</th><th>Delete</th></tr>");
		for(Title t:list){
			out.print("<tr><td>"+t.getIsbn()+"</td><td>"+t.getTitle()+"</td><td>"+t.getAuthor()+"</td><td>"+t.getType()+"</td><td><a href='EditServlet?isbn="+t.getIsbn()+"'>edit</a></td><td><a href='DeleteServlet?isbn="+t.getIsbn()+"'>delete</a></td></tr>");
		}
		out.print("</table>");
		
		out.close();
	}
}
