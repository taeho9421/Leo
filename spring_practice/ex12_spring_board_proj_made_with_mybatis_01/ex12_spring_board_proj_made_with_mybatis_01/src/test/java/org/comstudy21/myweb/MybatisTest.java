package org.comstudy21.myweb;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.comstudy21.myweb.board.BoardVO;

public class MybatisTest {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			//BoardVO board = session.selectOne("org.comstudy21.myweb.BoardMapper.getBoard", 1);
			//System.out.println(board);
			
			BoardVO vo = new BoardVO();
			List<BoardVO> list = session.selectList("org.comstudy21.myweb.BoardMapper.getBoardList", vo);
			System.out.println(list);
		}
	}
}
