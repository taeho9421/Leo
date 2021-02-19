package org.comstudy21.myweb;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.dto.UserVO;
import org.comstudy21.myweb.dao.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	UsersDAO dao;

	@RequestMapping(value="/user/list.do", method=RequestMethod.GET)
	public String userList(Model model) throws SQLException {
		System.out.println("/user/list.do ...");
		
		List<UserVO> list = dao.selectAll();
		//System.out.println(list);
		model.addAttribute("list", list);
		
		return "user/list";
	}
	
	@RequestMapping(value="/user/input.do",method=RequestMethod.GET)
	public String userInputForm() {
		return "user/input_form";
	}
	
	@RequestMapping(value="/user/input.do",method=RequestMethod.POST)
	public ModelAndView userInput(HttpServletRequest request, HttpServletResponse response, UserVO userVO) throws UnsupportedEncodingException, SQLException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		dao.insert(userVO);
		
		ModelAndView mav = new ModelAndView("redirect:list.do");
		
		return mav;
	}
}
