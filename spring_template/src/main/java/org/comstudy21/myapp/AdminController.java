package org.comstudy21.myapp;

import java.text.DateFormat;	 

import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.comstudy21.myapp.admin.AdminDTO;
import org.comstudy21.myapp.admin.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	AdminService adminservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("admin_login_ok.do")
	public ModelAndView admin_login_ok(String admin_id, String admin_pass,HttpSession session) throws Exception {
		AdminDTO dto = new AdminDTO();
		
		dto.setAdmin_id(admin_id);
		dto.setAdmin_pass(admin_pass);
		
		boolean result = adminservice.loginCheck(dto, session);
		ModelAndView mav = new ModelAndView();
		
		if(result) {
			mav.setViewName("member_management");
			mav.addObject("admin_id",session.getAttribute(admin_id));
		} else if(session.getAttribute(admin_id)==null) {
			mav.setViewName("admin_login");
			mav.addObject("message","관리자 아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		return mav;
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.info("Welcome index! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@RequestMapping(value = "/generic", method = RequestMethod.GET)
	public String generic(Locale locale, Model model) {
		logger.info("Welcome generic! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "generic";
	}
	
	@RequestMapping(value = "/elements", method = RequestMethod.GET)
	public String elements(Locale locale, Model model) {
		logger.info("Welcome elements! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "elements";
	}
	
	@RequestMapping(value = "/admin_login", method = RequestMethod.GET)
	public String admin_login(Locale locale, Model model) {
		logger.info("Welcome admin_login! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_login";
	}
	
	@RequestMapping(value = "/member_management", method = RequestMethod.GET)
	public String member_management(Locale locale, Model model) {
		logger.info("Welcome admin_login! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "member_management";
	}
	
	
}
