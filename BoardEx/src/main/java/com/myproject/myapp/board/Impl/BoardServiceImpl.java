package com.myproject.myapp.board.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.board.BoardService;
import com.myproject.myapp.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardDAO dao;
	
	@Override
	public void writeBoard(BoardVO vo) {
		dao.writeBoard(vo);
	}

	@Override
	public void modifyBoard(BoardVO vo) {
		dao.modifyBoard(vo);
	}

	@Override
	public void deleteeBoard(BoardVO vo) {
		dao.deleteeBoard(vo);
	}

	@Override
	public List<BoardVO> BoardList(BoardVO vo) {
		
		return dao.BoardList(vo);
	}

	@Override
	public BoardVO detailBoard(BoardVO vo) {
		
		return dao.detailBoard(vo);
	}

}
