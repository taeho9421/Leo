package org.comstudy21.myweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.MemberDAO;
import org.comstudy21.myweb.model.MemberTO;

public class MemberController extends HttpServlet {

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");
      resp.setCharacterEncoding("UTF-8");
      resp.setContentType("text/html; charset=UTF-8");
      
      //System.out.println(">>> URI : " + req.getRequestURI());
      //System.out.println(">>> CtxPath : " + req.getContextPath());
      String uri = req.getRequestURI();
      String ctxPath = req.getContextPath();
      String path = uri.substring(ctxPath.length() + "/member".length());
      //System.out.println(">>> path : " + path);
      
      String viewName = "/WEB-INF/views/member_list.jsp";
      if("/list.do".equals(path)) {
         MemberDAO dao = new MemberDAO();
         List<MemberTO> list = dao.selectAll();
         // DAO에서 전달 받은 LIST를 req에 바인딩 한다.
         req.setAttribute("list", list);
         viewName = "/WEB-INF/views/member_list.jsp";
      } else if("/input.do".equals(path)) {
         viewName = "/WEB-INF/views/input.jsp";
      }
      
      RequestDispatcher view = req.getRequestDispatcher(viewName);
      view.forward(req, resp);
   }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost() . . . ");
	}
}
