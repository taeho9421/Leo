package org.comstudy21.myweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.BoardDao;
import org.comstudy21.myweb.model.BoardDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController extends HttpServlet {
	private BoardDao dao = new BoardDao();
	
	@RequestMapping(value = "/board/list.do", method = RequestMethod.GET)
	protected ModelAndView boardList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<BoardDto> list = dao.selectAll();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("board/list");
		
		return mav;
	}
	
	
}
