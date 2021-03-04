package org.comstudy21.ch08;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodeFilter implements Filter {
	ServletContext context;

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">>> Filter의 doFilter() ...");
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse) resp;
		String ctxPath = request.getContextPath();
		String reqUri = request.getRequestURI();
		String realPath = request.getRealPath(reqUri);
		int beginIndex = ctxPath.length();
		String path = reqUri.substring(beginIndex);
		context.log("my-log >>>>>> path: " + path);
		request.setAttribute("path", path);
		
		// 마지막에 chain.doFilter() 호출 필수.
		chain.doFilter(req, resp);
		// doFilter() 이후의 코드는 response 필터가 된다.
	}

	@Override
	public void init(FilterConfig fc) throws ServletException {
		System.out.println(">>> Filter의 init() ...");
		context = fc.getServletContext();
	}
	@Override
	public void destroy() {
		System.out.println(">>> Filter의 destroy() ...");
	}

}
