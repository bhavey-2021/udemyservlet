package com.bhavey.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {
// advantage of generic is that we need not implement all get , post and service 
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();//any data to this writer goes back to the ewb browser 
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlets world</h1>");//h1 means heading 
		out.println("</body>");
		out.println("</html>");
	}
}
