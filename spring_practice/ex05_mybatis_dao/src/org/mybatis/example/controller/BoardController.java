package org.mybatis.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.example.model.BoardDao;
import org.mybatis.example.model.BoardDto;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
   private BoardDao dao = new BoardDao();
	
   protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("BoardController ...");
      
      //BoardDto dto = dao.selectOne(1);
      //System.out.println(dto);
      // list.jsp의 list를 가져온다. 
      List<BoardDto> list = dao.selectAll();
      req.setAttribute("list", list);
      
      String viewName = "/WEB-INF/views/board/list.jsp";
      RequestDispatcher view = req.getRequestDispatcher(viewName);
      view.forward(req, resp);
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