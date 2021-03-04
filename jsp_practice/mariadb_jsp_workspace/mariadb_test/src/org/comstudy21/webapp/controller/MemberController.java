package org.comstudy21.webapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.comstudy21.webapp.cmd.DeleteCmd;
import org.comstudy21.webapp.cmd.DetailCmd;
import org.comstudy21.webapp.cmd.JoinUsCmd;
import org.comstudy21.webapp.cmd.JoinUsCmd;
import org.comstudy21.webapp.cmd.SelectAllCmd;

@WebServlet("/member/*")
public class MemberController extends HttpServlet {

	String select_all = "/member/select_all.do";

	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		String reqUri = req.getRequestURI();
		String ctxPath = req.getContextPath() + "/member";
		int beginIndex = ctxPath.length();
		String path = reqUri.substring(beginIndex);
		System.out.println("path =========> "+path);
		
		String viewName = "/WEB-INF/views/member/login.jsp";
		boolean isRedirect = false;
		
		if("/select_all.do".equals(path)) {
			SelectAllCmd.service(req,resp);
			viewName = "/WEB-INF/views/member/select_all.jsp";
		} else if("/delete.do".equals(path)) {
			DeleteCmd.service(req,resp);
			isRedirect = true;
			viewName = "select_all.do";
		} else if("/detail.do".equals(path)) {
			DetailCmd.service(req,resp);
			viewName = "/WEB-INF/views/member/detail.jsp";
		} else if("/login.do".equals(path)) {
			viewName = "/WEB-INF/views/member/login.jsp";
		} else if("/joinus.do".equals(path)) {
			JoinUsCmd.service(req,resp);
			viewName = "/WEB-INF/views/member/joinus_form.jsp";
		} else {
			isRedirect = true;
			viewName = req.getContextPath() + "/index.jsp";
		}
		
		
		if(isRedirect) {
			resp.sendRedirect(viewName);
		} else {
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}
}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
}
