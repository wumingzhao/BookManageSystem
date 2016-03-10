package org.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dao.LoginDao;
import org.model.Login;

public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("gb2312");
		LoginDao login = new LoginDao();
		Login I = login.checkLogin(request.getParameter("name"), request.getParameter("password"));
		if(I != null){
			HttpSession session = request.getSession();
			session.setAttribute("login", I);
			response.sendRedirect("main.jsp");
			
		}else{
			response.sendRedirect("error.jsp");
		}
		
	}

	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
			doGet(request,response);
	}
}
