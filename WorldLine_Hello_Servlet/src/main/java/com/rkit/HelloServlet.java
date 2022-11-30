package com.rkit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
   
    @Override
  /*  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    	String methodType = request.getMethod();
    	if(methodType.equals("GET")) {
    		doGet(request,response);
    	}else if(methodType.equals("POST")) {
    		doPost(request,response);
    	}else if(methodType.equals("PUT")) {
    		doPut(request,response);
    	}
    }
    */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
		PrintWriter writer = response.getWriter();
		//writer.print("<html><body><form method='post'>firstname<input type='text' name='fname'/>lastname<input type='text' name='lname'/>"
		//		+ "<input type='submit'/></body></html>");
		RequestDispatcher rd = request.getRequestDispatcher("register.html");
		rd.forward(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
    	
    	String firstName = request.getParameter("fname");
    	String lastName = request.getParameter("lname");
    	String city = request.getParameter("city");
    	PrintWriter out = response.getWriter();
    	out.println("<html><h1>Namaste </h1><h3>"+firstName+" : "+lastName+", "+city+"</html>");
    }

	
	

}
