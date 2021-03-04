package org.comstudy21.ch06;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html); charset-UTF-8");
		//this 는 ServletConfig 이다. 
		String user = this.getInitParameter("user");
		String pass = this.getInitParameter("pass");
		
		ServletContext ctx = this.getServletContext();
		ctx.log(">>>> user : " + user);
		ctx.log(">>>> pass : " + pass);
		
		String url = ctx.getInitParameter("url");
		ctx.log(">>>> url : "+url );
		System.out.println(">>>> doGet() . . .");
	}
}
