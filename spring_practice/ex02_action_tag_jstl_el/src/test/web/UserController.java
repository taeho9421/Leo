package test.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/user/list")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<MemberBean> list = new ArrayList<MemberBean>();
		list.add(new MemberBean("홍길동","23","75","180","남자"));
		list.add(new MemberBean("홍길순","21","65","170","여자"));
		list.add(new MemberBean("김길동","33","85","190","남자"));
		
		request.setAttribute("list", list);
		
		String viewName = "/ch13_ex01_jstl/user_list.jsp";
		RequestDispatcher view = request.getRequestDispatcher(viewName);
		view.forward(request, response);
	}
}
