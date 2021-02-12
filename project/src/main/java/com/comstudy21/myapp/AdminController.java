package com.comstudy21.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.comstudy21.myapp.admin.AdminService;
import com.comstudy21.myapp.admin.AdminVO;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public void login() {}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(AdminVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post login");
		
		HttpSession session = req.getSession();
		AdminVO login = adminService.getAdminLoginChk(vo);
		
		if(login == null) {
			session.setAttribute("admin", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("admin", login);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		
		return "admin/login";
	}
}
