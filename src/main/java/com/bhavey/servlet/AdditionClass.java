package com.bhavey.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionClass extends GenericServlet 
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
			//to get the data fromm html||website we use getter 
		if(request.getParameter("number1")!=null && request.getParameter("number2")!=null)
		{
			Long num1 = Long.parseLong(request.getParameter("number1"));
			Long num2 = Long.parseLong(request.getParameter("number1"));
			PrintWriter out = response.getWriter();
			out.println("the result is "+(num1+num2));
		}	
	}

}
