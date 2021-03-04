package org.comstudy21.myweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// View 페이지로 forword 시켜준다. 
		
		String viewName = "/WEB-INF/views/home.jsp";
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req,resp);
	}
}
