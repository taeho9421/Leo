package org.comstudy21.myapp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 브라우저 화면에  hello world 출력
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		resp.getWriter().append("<h1>우리들의 천국!</h1>");
		
		req.setAttribute("message", "JSP는 잼있다");
		
		ArrayList<String> fishList = new ArrayList<>();
		fishList.add("오징어");
		fishList.add("꼴뚜기");
		fishList.add("대구");
		fishList.add("명태");
		fishList.add("거북이");
		req.setAttribute("fishList", fishList);
		
		// views/home.jsp로 포워딩 해 준다.
		String viewName = "/WEB-INF/views/home.jsp";
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}
}
