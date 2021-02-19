package org.comstudy21.myweb;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.comstudy21.myweb.app.HelloWorld;
import org.comstudy21.myweb.app.MyMessage;
import org.comstudy21.myweb.collections.ListBean;
import org.comstudy21.myweb.collections.MapBean;
import org.comstudy21.myweb.collections.PropBean;
import org.comstudy21.myweb.collections.SetBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	HelloWorld helloWorld;
	
	@Autowired
	ListBean listBean;
	
	@Autowired
	SetBean setBean;
	
	@Autowired
	MapBean mapBean;
	
	@Autowired
	PropBean propBean;
	
	@RequestMapping(value="/addr_prop", method=RequestMethod.GET)
	public String addrProp(Model model) {
		System.out.println("/addr_prop 요청 들어옴 ...");
		
		Properties addrProp = propBean.getAddrProp();
		model.addAttribute("addProp",addrProp);
		
		return "AddrProp";
	}
	
	
	@RequestMapping(value="/msg_map", method=RequestMethod.GET)
	public String msgMap(Model model) {
		System.out.println("/msg_map 요청 들어옴 ...");
		
		Map<String,MyMessage> msgMap = mapBean.getMsgMap();
		model.addAttribute("addrSet", msgMap);
		
		return "AddrSet";
	}
	
	@RequestMapping(value="/addr_set", method=RequestMethod.GET)
	public String addrSet(Model model) {
		System.out.println("/addr_set 요청 들어옴 ...");
		
		Set<String> addrSet = setBean.getAddrSet();
		model.addAttribute("addrSet", addrSet);
		
		return "AddrSet";
	}
	
	
	@RequestMapping(value="/addr_list", method = RequestMethod.GET)
	public String addrList(Model model) {
		System.out.println("/addr_list 호출 됨...");
		
		List<String> addrList = listBean.getAddrList();
		System.out.println(addrList);
		model.addAttribute("addrList", addrList);
		
		return "AddrList";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		// 컨텍스트에 생성한 빈을 사용한다.
		helloWorld.sayHello();
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
