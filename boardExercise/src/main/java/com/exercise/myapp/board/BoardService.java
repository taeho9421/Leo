package com.exercise.myapp.board;

import java.util.List;

public interface BoardService {
	
	// CRUD 게시판 기능 
	void create(BoardVO vo);
	void update(BoardVO vo);
	void delete(BoardVO vo);
	List<BoardVO> listAll(BoardVO vo);
	BoardVO detail(BoardVO vo);
}
