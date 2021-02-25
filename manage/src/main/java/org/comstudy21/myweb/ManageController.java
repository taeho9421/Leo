package org.comstudy21.myweb;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.comstudy21.myweb.manage.ManageService;
import org.comstudy21.myweb.manage.ManageVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/manage")
public class ManageController {
	
	@Resource
	ManageService manageService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		logger.info("/manage/write 호출 ...");
		
		return "manage/write";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write_ok(ManageVO vo) {
		logger.info("POST /manage/write 호출 ...");
		System.out.println(vo);
		
		manageService.insertUser(vo);
		
		return "redirect:list";
	}
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("아이디", "ID");
		conditionMap.put("이름", "NAME");
		return conditionMap;
	}
	
	@RequestMapping(value = "/list")
	public String home(Locale locale, ManageVO vo, Model model) {
		logger.info("/manage/list 호출 ...");
		
		List<ManageVO> list = manageService.getUserList(vo);
		model.addAttribute("list", list);
		
		return "manage/list";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(@RequestParam("seq") int seq, Model model) {
		logger.info("/manage/detail 호출 ...");
		
		ManageVO board = manageService.getUser(new ManageVO(seq));
		model.addAttribute("board", board);
		
		return "manage/detail";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model) {
		logger.info("/manage/search 호출 ...");
		
		return "manage/search";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(@RequestParam("seq") int seq, Model model) {
		logger.info("/manage/modify 호출 ...");
		
		ManageVO board = manageService.getUser(new ManageVO(seq));
		model.addAttribute("board", board);
		
		return "manage/modify";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify_ok(ManageVO vo, Model model) {
		logger.info("/manage/modify 호출 ...");
		System.out.println(vo);
		manageService.updateUser(vo);
		
		return "redirect:detail?seq="+vo.getSeq();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(ManageVO vo, Model model) {
		logger.info("/manage/delete 호출 ...");
		
		model.addAttribute("board", vo);
		
		return "manage/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete_ok(ManageVO vo, Model model) {
		logger.info("/manage/delete 호출 ...");
		
		manageService.deleteUser(vo);
		
		return "redirect:list";
	}
	
}
