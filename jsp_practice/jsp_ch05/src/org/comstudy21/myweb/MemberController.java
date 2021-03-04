package org.comstudy21.myweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberController extends HttpServlet {
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // 로그인 뷰로 forward한다.
      //System.out.println("doGet() - MemberController");
      String viewName = "/WEB-INF/views/login.jsp";
      RequestDispatcher view = req.getRequestDispatcher(viewName);
      view.forward(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");
      resp.setCharacterEncoding("UTF-8");
      resp.setContentType("text/html;charset=UTF-8");
      
      PrintWriter out = resp.getWriter();
      
      String userID = req.getParameter("userID");
      String passwd = req.getParameter("passwd");
      out.printf("ID:%s<br> Pass:%s<br>", userID, passwd);
      String[] checkValues = req.getParameterValues("checkValues");
      out.print("관심분야:");
      for(String val : checkValues) {
         out.print(val + " ");
      }
      out.close();
      
      Enumeration<String> names = req.getParameterNames();
      while(names.hasMoreElements()) {
         String paramName = (String)names.nextElement();
         if("checkValues".equals(paramName)) {
            String[] values = req.getParameterValues(paramName);
            for(String val : values) {
               System.out.print(val + " ");
            }
            System.out.println();
         }else{
            String value = req.getParameter(paramName);
            System.out.printf("%s:%s,\n", paramName, value);
         }
      }
   }
   
   protected void test(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //System.out.println("doPost() - MemberController");
      String userID = req.getParameter("userID");
      String passwd = req.getParameter("passwd");
      System.out.printf("ID:%s, Pass:%s\n", userID, passwd);
      String[] checkValues = req.getParameterValues("checkValues");
      System.out.print("관심분야:");
      for(String val : checkValues) {
         System.out.print(val + " ");
      }
      System.out.println();
      Enumeration<String> names = req.getParameterNames();
      while(names.hasMoreElements()) {
         String paramName = (String)names.nextElement();
         System.out.println(paramName + ":");
         if(req.getParameterValues(paramName).length > 1) {
            String[] values = (String[])req.getParameterValues(paramName);
            for(String val : values) {
               System.out.print(val + " ");
            }
            System.out.println();
         } else {
            String value = req.getParameter(paramName);
            System.out.printf("%s:%s,\n", paramName, value);
         }
      }
   }
}