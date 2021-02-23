package org.comstudy21.myweb.common;

import org.comstudy21.myweb.board.BoardVO;
import org.comstudy21.myweb.user.UserVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBatisEx {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		SqlSessionTemplate mybatis = (SqlSessionTemplate)ctx.getBean("mybatis");
		
		BoardVO board = mybatis.selectOne("org.comstudy21.myweb.BoardMapper.getBoard", 1);
		System.out.println(board);
		
		UserVO user = mybatis.selectOne("org.comstudy21.myweb.UserMapper.getUser", "user1");
		System.out.println(user);
	}

}