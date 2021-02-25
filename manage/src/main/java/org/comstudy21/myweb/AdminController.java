package org.comstudy21.myweb;

import javax.servlet.http.HttpSession;

import org.comstudy21.myweb.admin.AdminService;
import org.comstudy21.myweb.admin.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	AdminService adminService;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void login() {}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login_ok(AdminVO vo, ModelAndView mav, HttpSession session) {
		if (vo.getAdminId() == null || vo.getAdminId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		
		AdminVO admin = adminService.getAdminLoginChk(vo);
		
		session.setAttribute("loginAdmin", admin);
		mav.setViewName("redirect:login");
		
		return mav;
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "admin/login";
	}
	
}
