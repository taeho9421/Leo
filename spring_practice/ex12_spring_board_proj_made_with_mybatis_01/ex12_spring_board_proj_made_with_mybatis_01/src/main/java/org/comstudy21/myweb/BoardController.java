package org.comstudy21.myweb;

import java.util.List;

import javax.annotation.Resource;

import org.comstudy21.myweb.board.BoardService;
import org.comstudy21.myweb.board.BoardVO;
import org.comstudy21.myweb.board.impl.BoardDAO;
import org.comstudy21.myweb.board.impl.BoardServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	@Resource
	BoardService boardService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView list(BoardVO vo, ModelAndView mav) {
		List<BoardVO> list = boardService.getBoardList(vo);
		//System.out.println(list);
		
		mav.addObject("list", list);
		mav.setViewName("board/list");
		
		return mav;
	}
	// SPA, ServerLess, Cloude (AWS, Azure)
	// Javascript - Full stack
	// 결국 정답은 없다.
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public void write() {}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public ModelAndView write_ok(BoardVO vo, ModelAndView mav) {
		boardService.insertBoard(vo);
		mav.setViewName("redirect:list");
		
		return mav;
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(BoardVO vo, Model model) {
		BoardVO board = boardService.getBoard(vo);
		//System.out.println(board);
		model.addAttribute("board", board);
		
		return "board/detail";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String modify(BoardVO vo, Model model) {
		BoardVO board = boardService.getBoard(vo);
		model.addAttribute("board", board);
		
		return "board/modify";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public ModelAndView modify_ok(BoardVO vo, ModelAndView mav) {
		System.out.println(vo);
		boardService.updateBoard(vo);
		mav.setViewName("redirect:list");
		
		return mav;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(BoardVO vo, Model model) {
		BoardVO board = boardService.getBoard(vo);
		model.addAttribute("board", board);
		
		return "board/delete";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView delete_ok(BoardVO vo, ModelAndView mav) {
		System.out.println(vo);
		boardService.deleteBoard(vo);
		mav.setViewName("redirect:list");
		
		return mav;
	}
}
