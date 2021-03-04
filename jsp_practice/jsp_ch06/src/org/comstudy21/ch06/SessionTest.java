package org.comstudy21.ch06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		// JSP 는 session이 자동 생성된다. 
		// Servlet에서는 직접 생성 시켜야한다. 
		HttpSession session = req.getSession();
		
		PrintWriter out = resp.getWriter();
		out.print("<p>Session id: "+session.getId() + "<p>");
		if(session.isNew()){
			// index.jsp 페이지에서 먼저 세션이 실행됨
			// 그러므로 servlet에선 새로운 새션이 아니다.
			// index.jsp 를 실행하지않고 바로 서블릿을 실행하면 isNew() true 
			
			//index.jsp에서 session.invalidate()실행 후 
			// 서블릿으로 변경하면 새로운 세션이 생성된다.
			out.print("<h3>New Session!</h3>");
		}
		out.close();
	}
}
