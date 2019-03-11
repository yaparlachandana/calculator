package com.calculator.example.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
	//display();
	PrintWriter out = response.getWriter();
	//out.println(�hello�);
	
	String n1 = request.getParameter("no1");
	String n2 = request.getParameter("no2");
	String opt = request.getParameter("opt");
	
	
	int sumValue;
	if(opt.equals("p"))
	{
		 sumValue = sum(Integer.parseInt(n1),Integer.parseInt(n2));
		 out.println("Add value" + sumValue);
	System.out.println("sumValue " + sumValue);
	}
	else if(opt.equals("m")){
		
		int minus  =subtraction(Integer.parseInt(n1), Integer.parseInt(n2));
		System.out.println(minus);
		 out.println("Minus Value " + minus);
	}
else if(opt.equals("mul")){
		
		int multi  = multiplication(Integer.parseInt(n1), Integer.parseInt(n2));
		System.out.println("multi " + multi);
		out.println("Multiple Value " + multi);
	}
else if(opt.equals("d")){
	
	int division = 0;
	try {
		division = divison(Integer.parseInt(n1), Integer.parseInt(n2));
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	System.out.println("division " + division);
	out.println("Division Value " + division);
}
	
	}
	  public int subtraction(int a, int b) {

	        return a - b;

	    }

	public int sum(int a, int b) {
		   return a + b;
		}
	

	    public int multiplication(int a, int b) {

	        return a * b;

	}
	 public int divison(int a, int b) throws Exception {

	        if (b == 0) {

	            throw new Exception("Divider can't be zero");

	        }

	 

	        return a / b;

	    }

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
	doPost(request,response);
	}
}
