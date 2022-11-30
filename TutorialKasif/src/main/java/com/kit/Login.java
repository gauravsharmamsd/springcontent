package com.kit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid1=request.getParameter("uid");
		String pswd1=request.getParameter("pswd");
		
		HttpSession session = request.getSession();
		String uid2=(String) session.getAttribute("uid");
		String pswd2=(String) session.getAttribute("pswd");
		PrintWriter out =response.getWriter();
		
		if(uid1.equals(uid2) && pswd1.equals(pswd2)) {
			out.println("<html><body><h1> Login Sucess</h1></body><html>");
		}
		else {
			out.println("<html><body><h1> Login Failed</h1></body><html>");
		}
	}

}
