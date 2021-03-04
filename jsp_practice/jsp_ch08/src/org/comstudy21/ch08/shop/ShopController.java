package org.comstudy21.ch08.shop;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("*.shop")
public class ShopController extends HttpServlet {
	static ArrayList<Product> product_list = new ArrayList<>();
	static {
		product_list.add(new Product(1, "스프링 프레임워크", 35000, 0));
		product_list.add(new Product(2, "자바 프로그래밍", 32000, 0));
		product_list.add(new Product(3, "자바스크립트 입문", 25000, 0));
		product_list.add(new Product(4, "jQuery 활용", 20000, 0));
		product_list.add(new Product(5, "Servlet/JSP", 34000, 0));
		product_list.add(new Product(6, "Oracle DB", 30000, 0));
	}
	HttpSession session;
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = (String)req.getAttribute("path");
		String path = s.substring(0, s.lastIndexOf("."));
		System.out.println(path);
		String method = req.getMethod();
		session = req.getSession();
		
		String viewName = "/WEB-INF/view/shop/list.jsp";
		String paramPno = "";
		int pno = 0;
		Product argObj = null;
		int index = 0;
		int ea = 0;
		if("GET".equals(method)) {
			switch(path) {
			case "/list" : 
				req.setAttribute("product_list", product_list);
				viewName = "/WEB-INF/view/shop/list.jsp";
				break;
			case "/cart" : 
				viewName = "/WEB-INF/view/shop/cart.jsp";
				if(req.getParameter("pno")==null || req.getParameter("ea")==null) {
					break;
				}
				paramPno = req.getParameter("pno");
				pno = Integer.parseInt(paramPno);
				ea = Integer.parseInt(req.getParameter("ea"));
				// indexOf(인자)  >>> 인자를 가지고 리스트에서 인자의 위치를 찾는다.
				// product_list의 요소는 Product타입이다.
				// 그래서 인자도  Product 타입이어야 한다.
				// paramPno는 문자열 타입이기때문에 indexOf의 인자로 바로 사용이 불가능하다.
				// paramPno를 이용한 Product 객체를 생성 해 주어야 indexOf가 가능하다.
				argObj = new Product(pno, "", 0, 0);
				index = product_list.indexOf(argObj);
				try {
					Product product = (Product)(product_list.get(index)).clone();
					product.setEa(ea);
					// product가 검색되면 session에 추가한다.
					// session에 ArrayList를 생성해서 추가한다.
					// session에 이미 ArrayList가 있다면 있는것을 사용하고 
					// 없다면 새로 생성한다.
					ArrayList<Product> cartList;
					if(session.getAttribute("cartList") == null) {
						cartList = new ArrayList<>();
					} else {
						cartList = (ArrayList<Product>)session.getAttribute("cartList");
					}
					cartList.add(product);
					session.setAttribute("cartList", cartList);
					
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
				break;
			case "/cart_remove" : 
				viewName = "/WEB-INF/view/shop/cart.jsp";
				paramPno = req.getParameter("pno");
				pno = Integer.parseInt(paramPno);
				
				ArrayList<Product> cartList;
				if(session.getAttribute("cartList") == null) {
					cartList = new ArrayList<>();
				} else {
					cartList = (ArrayList<Product>)session.getAttribute("cartList");
				}
				session.setAttribute("cartList", cartList);
				
				argObj = new Product(pno, "", 0, 0);
				index = cartList.indexOf(argObj);
				System.out.println("index => " + index);
				if(index != -1) {
					cartList.remove(index);
					System.out.println("장바구니에서 상품 제거 완료!");
				} else {
					System.out.println("제거 할 상품이 없습니다!");
				}
			}
		} else {
			// POST 처리 부분
		}
		
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}
