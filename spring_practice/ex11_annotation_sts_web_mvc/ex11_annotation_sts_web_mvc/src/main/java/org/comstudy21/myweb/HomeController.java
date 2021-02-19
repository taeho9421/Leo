package org.comstudy21.myweb;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.comstudy21.myweb.app.HelloWorld;
import org.comstudy21.myweb.app.MyMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// @Autowired와 @Inject는 동일한 기능이다.
	// @Inject는 자바에서 사용 가능한 기능으로 javax.inject 라이브러리를 사용한다.
	@Inject
	HelloWorld helloWorld;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		// Inject된 빈을 확인한다.
		//helloWorld.setMyMessage(new MyMessage("반갑습니다."));
		helloWorld.sayHello();
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	// 의존성 주입에서 사용 가능한 어노테이션
	// 1) @Autowired	: (스프링 전용) - 타입이 같은 객체를 자동으로 할당한다.
	// 2) @Qualifier	: (스프링 전용) - 이름을 이용해서 의존성 주입한다.
	// 3) @Inject		: @Autowired와 동일하다.
	// 4) @Resource		: @Autowired + @Qualifier의 합친 기능
}



