package org.comstudy21.ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/get")
public class TestAttributeGet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>> /get 요청 처리");
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		ServletContext ctx = getServletContext();
		HttpSession sess = req.getSession();
		
		String ctxMsg = (String)ctx.getAttribute("context");
		String sesMsg = (String)sess.getAttribute("session");
		String reqMsg = (String)req.getAttribute("request"); // X
		
		PrintWriter out = resp.getWriter();
		out.printf("<p>context : %s</p>", ctxMsg);
		out.printf("<p>session : %s</p>", sesMsg);
		out.printf("<p>request : %s</p>", reqMsg);
		out.close();
	}
}
