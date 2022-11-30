package com.rkit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleDemoServlet implements Servlet{

	private ServletConfig config;//This holds init parameters from web.xml
	@Override
	public void destroy() {
		System.out.println("Once we recycle the servlet Detsroy gets called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "LifeCycle demo Servlet";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Init is config null ?? "+this.config);
		System.out.println("Only called once during life a Servlet when first time request comes from this servlet");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service Method called again.....");
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("HTTP Request Type is "+req.getMethod());
		if(req.getMethod().equals("POST")){
			doPost(request,response);
		}else if(req.getMethod().equals("GET")) {
			doGet(request,response);
		}
		Enumeration<String> paramNames = this.config.getInitParameterNames();
		while(paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			System.out.println(paramName);
			System.out.println(this.config.getInitParameter(paramName));
			
		}
		
		
	}

	private void doGet(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/another");
		PrintWriter out = response.getWriter();
		out.println("This is part of response must be seen on the browser");//This response will be gone
		//rd.forward(request, response);
		HttpServletResponse resp = (HttpServletResponse)response;
		//resp.sendRedirect("http://www.cnn.com");
		resp.setStatus(303);
		resp.setHeader("Location", "http://www.ramkrishnait.com");
		//What does sendRedirect DO internally ???
		//It adds a Response Header named "Location" and sets the header Value to "http"//www.cnn.com"
		//It tells browser to initiate a new resuet to this new Location(cnn.com)
		//Telling browser is basically seting Response Status Code of 303 //This tells browser that It should send new request to new Location
		
		
		
		
	}

	private void doPost(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		//We want to forward the request to another servlet. Another servlet will process the request data
		PrintWriter out = response.getWriter();
		out.println("This is part of response must be seen on the browser");

		RequestDispatcher rd = request.getRequestDispatcher("/another");
		rd.forward(request, response);
		
	}

}
