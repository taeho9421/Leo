package com.exercise.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exercise.myapp.board.BoardService;
import com.exercise.myapp.board.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Resource
	BoardService boardService;
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(BoardVO vo, Model model) {
		List<BoardVO> list = boardService.listAll(vo);
		
		model.addAttribute("list", list);
		
		return "board/list";
	}
	
	@RequestMapping(value = "/write",method = RequestMethod.GET)
	public String write() {
		
		return "board/write";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write_ok(BoardVO vo) {
		boardService.create(vo);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search() {
		
		return "board/search";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(@RequestParam("seq") int seq,Model model) {
		BoardVO board = boardService.detail(new BoardVO(seq));
		model.addAttribute("board", board);
		
		return "board/detail";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(@RequestParam("seq") int seq,Model model) {
		BoardVO board = boardService.detail(new BoardVO(seq));
		return "board/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update_ok(BoardVO vo,Model model) {
		boardService.update(vo);
		return "redirect:detail?seq="+vo.getSeq();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Model model,BoardVO vo) {
		model.addAttribute("board",vo);
		
		return "board/delete";
	}
	
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete_ok(Model model,BoardVO vo) {
		boardService.delete(vo);
		
		return "redirect:list";
	}
	
}
