package com.myproject.myapp.board.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myproject.myapp.board.BoardService;
import com.myproject.myapp.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO implements BoardService{
	@Autowired
	SqlSession session;

	@Override
	public void writeBoard(BoardVO vo) {
		session.insert("com.myproject.myapp.Board-Mapper.writeBoard",vo);
	}

	@Override
	public void modifyBoard(BoardVO vo) {
		session.update("com.myproject.myapp.Board-Mapper.modifyBoard",vo);
		
	}

	@Override
	public void deleteeBoard(BoardVO vo) {
		session.delete("com.myproject.myapp.Board-Mapper.modifyBoard.deleteeBoard",vo);
	}

	@Override
	public List<BoardVO> BoardList(BoardVO vo) {
		
		return session.selectList("com.myproject.myapp.Board-Mapper.BoardList",vo);
	}

	@Override
	public BoardVO detailBoard(BoardVO vo) {
		
		return session.selectOne("com.myproject.myapp.Board-Mapper.detailBoard",vo);
	}
	
}
