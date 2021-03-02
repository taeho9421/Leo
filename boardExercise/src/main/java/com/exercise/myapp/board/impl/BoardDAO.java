package com.exercise.myapp.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exercise.myapp.board.BoardVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession session;
	private static String namespace = "mappers.ExerciseMapper";
	
	public void create(BoardVO vo) {
		session.insert(namespace+".create",vo);
	}
	
	public BoardVO detail(BoardVO vo) {
		return session.selectOne(namespace+".detail",vo);
	}
	
	public List<BoardVO> listAll(BoardVO vo) {
		return session.selectList(namespace+".listAll",vo);
	}
	
	public void update(BoardVO vo) {	
		session.update(namespace+".update",vo);
	}
	
	public void delete(BoardVO vo) {
		session.delete(namespace+".delete",vo);
	}
}
