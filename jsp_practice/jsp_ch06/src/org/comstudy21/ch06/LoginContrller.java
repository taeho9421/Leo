package org.comstudy21.ch06;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginContrller extends HttpServlet {
	private String adminId = "admin";
	private String adminPass = "1234";
	private String adminName = "주인장";
	HttpSession session;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// login.jsp 페이지로 포워딩 한다.
		// 전달되는 파라미터 정보를 이용해서 분기 시킨다.
		String cmd = req.getParameter("cmd");
		if("logout".equals(cmd)){
			session = req.getSession();
			session.invalidate();
			System.out.println("로그아웃 처리 성공!");
		}
		
		String viewName = "/WEB-INF/views/login.jsp";
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// login.jsp 페이지에서 로그인 정보를 받아온다.
		// System.out.println("doPost. . .");
		HttpSession session = req.getSession();
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");

		if (id.equals(adminId) && id.equals(adminPass)) {
			if (session.getAttribute("login.id") == null) {
				// 로그인된 정보가 없다
				// 전달된 아이디 패스워드가 유효한가?
				session = req.getSession();
				session.setAttribute("login.id", id);
				session.setAttribute("login.name", adminName);
			} else {
				session.setAttribute("login.id", id);
				session.setAttribute("login.name", adminName);
			}
		} else {
			System.out.println("경고! 아이디또는 패스워드가 틀립니다.");
		}
		// 로그인 체크가 끝나면 갱신한다. 
		resp.sendRedirect("login.do");
	}
}
