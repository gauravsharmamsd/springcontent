package com.rkit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Page1Servlet
 */
public class Page1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId = request.getParameter("uid");
		String pwd = request.getParameter("passwd");
		session.setAttribute("user_id", userId);
		session.setAttribute("pwd", pwd);
		String form = "<HTML><BODY><form action='page1' method='post'>"
				+ "<input type='submit' value='sendPostRequest'/></form>"
				+ "</BODY></HTML>";
		PrintWriter out = response.getWriter();
		out.write(form);
		System.out.println("Inside doGet uid = "+userId);
		System.out.println("Inside doGet pwd = "+pwd);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("uid");
		String pwd = request.getParameter("passwd");
		System.out.println("Inside doPost uid = "+userId);//NULL
		System.out.println("Inside doPost pwd = "+pwd);//NULL
		HttpSession session = request.getSession();//Now request contains a cookie names JSESSIONID .
		                                            //It takes the value of JSESSIONID which is hex number
		                                            //Asks container to return session object with that Id
		System.out.println("We have info already available uid "+session.getAttribute("user_id"));
		System.out.println("We have info already available pwd "+session.getAttribute("pwd"));
		
	}

}
