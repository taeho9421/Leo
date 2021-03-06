package com.myproject.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproject.myapp.board.BoardService;
import com.myproject.myapp.board.BoardVO;

@RequestMapping(value="/board")
@Controller
public class BoardController {
	//CRUD ( CREATE-INSERT / READ-SELECT / UPDATE / DELETE ) 
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		
		return "board/write";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write_ok(BoardVO vo) {
		boardService.writeBoard(vo);
		return "redirect:list";
	}
	
	@ModelAttribute("conditionMap")
	public Map<String,String> searchConditionMap() {
		Map<String,String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
	@RequestMapping(value = "/list")
	public String list(BoardVO vo,Model model) {
		List<BoardVO> list = boardService.BoardList(vo);
		model.addAttribute("list",list);
		
		return "board/list";
	}
	
	@RequestMapping(value = "/detail", method=RequestMethod.GET)
	public String list(@RequestParam("seq") int seq,Model model) {
		
		BoardVO board = boardService.detailBoard(new BoardVO(seq));
		model.addAttribute("board",board);
		
		return "board/detail";
	}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model) {
		
		return "board/search";
	}
	
	@RequestMapping(value = "/modify", method=RequestMethod.GET)
	public String modify(@RequestParam("seq") int seq,Model model) {
		BoardVO board = boardService.detailBoard(new BoardVO(seq));
		model.addAttribute("board",board);
		return "board/modify";
	}
	
	@RequestMapping(value = "/modify", method=RequestMethod.POST)
	public String modify_ok(BoardVO vo,Model model) {
		boardService.modifyBoard(vo);
		
		return "redirect:detail?seq="+vo.getSeq();
	}
	
	@RequestMapping(value = "/delete", method=RequestMethod.GET)
	public String delete(BoardVO vo,Model model) {
		
		model.addAttribute("board",vo);
		return "board/delete";
	}
	
	@RequestMapping(value = "/delete", method=RequestMethod.POST)
	public String delete_ok(BoardVO vo,Model model) {
		
		boardService.deleteeBoard(vo);
		return "redirect:list";
	}
	
}
