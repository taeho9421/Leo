package org.comstudy21.ch08;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestAttributeSet
 */
// @WebServlet("/매핑")
// @WebServlet(name="", urlPatterns={}, initParams={})
@WebServlet(name="TestSetAttr",
		urlPatterns = { "/set", "/test/*"}, 
		initParams = { 
				@WebInitParam(name = "user", value = "beomjoon", description = "user name"), 
				@WebInitParam(name = "email", value = "comstudy21@naver.com", description = "user email")
		})
public class TestAttributeSet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ctxMsg = "context 변수";
		String sesMsg = "session 변수";
		String reqMsg = "request 변수";
		
		ServletContext ctx = getServletContext();
		HttpSession session = req.getSession();
		
		ctx.setAttribute("context", ctxMsg);
		session.setAttribute("session", sesMsg);
		req.setAttribute("request", reqMsg);
		
		// 속성을 set하고 즉시 페이이지 변경하기
		resp.sendRedirect(req.getContextPath() + "/get");
	}
}
/*
 Servlet 3.0이상에서 사용 가능한 어노테이션
 @WebServlet
 @Resource
 @WebFiler
 @PersistenceContext
 @PersistenceContexts
 @WebInitParam
 @WebListener
 @PersitenceUnit
 @DeclareRoles
 @PostConstruct
 @EJB
 @PreDestroy
 @EJBs
 @RunAs
 @Resource
 */








