package org.comstudy21.myweb.model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.h2.tools.Server;

public class BoardDao {
	private SqlSession mybatis;
	
	public BoardDao() {
		try {
			//DB 자동 실행
			Server server = Server.createTcpServer(null).start();
			//SqlSessionFactory 생성
			String resource = "mybatis-config.xml";
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			//sqlSessin 생성
			mybatis = sqlSessionFactory.openSession();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	String ns = "org.comstudy21.myweb.BoardMapper.";

	public BoardDto selectOne(int seq) {
		BoardDto board = mybatis.selectOne(ns+"selectBoard", 1);
		return board;
	}
	
	public List<BoardDto> selectAll() {
		List<BoardDto> list = mybatis.selectList(ns+"selectAll");
		return list;
	}
	
	public void insert(BoardDto dto) {
		
	}
	
	public void update(BoardDto dto) {
		
	}
	
	public void delete(BoardDto dto) {
		
	}
}
