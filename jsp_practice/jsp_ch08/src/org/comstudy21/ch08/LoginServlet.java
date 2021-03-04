package org.comstudy21.ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Filter 클래스로 Encoding 설정 부분 옮긴다.
		String userID = req.getParameter("userID");
		String passwd = req.getParameter("passwd");
		
		Login login = new Login(userID, passwd);
		HttpSession session = req.getSession();
		if(session.getAttribute("login") == null) {
			// Login의 valueBound() 자동 호출 됨.
			session.setAttribute("login", login);
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.printf("id : %s<br>", userID);
		out.printf("pass : %s<br>", passwd);
		out.printf("path : %s<br>", req.getAttribute("path"));
		out.printf("total : %d<br>", Login.total);
		out.printf("activeSessins : %d<br>", SessionListener.activeSessions);
		out.close();
	}
}
