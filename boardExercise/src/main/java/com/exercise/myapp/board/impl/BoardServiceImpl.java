package com.exercise.myapp.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.myapp.board.BoardService;
import com.exercise.myapp.board.BoardVO;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO dao;
	
	@Override
	public void create(BoardVO vo) {
		dao.create(vo);
	}

	@Override
	public void update(BoardVO vo) {
		dao.update(vo);
	}

	@Override
	public void delete(BoardVO vo) {
		dao.delete(vo);
	}

	@Override
	public List<BoardVO> listAll(BoardVO vo) {
		return dao.listAll(vo);
	}

	@Override
	public BoardVO detail(BoardVO vo) {
		return dao.detail(vo);
	}

}
