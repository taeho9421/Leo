package org.comstudy21.myweb.common;

import org.comstudy21.myweb.admin.AdminVO;
import org.comstudy21.myweb.manage.ManageVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBatisEx {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		SqlSessionTemplate mybatis = (SqlSessionTemplate)ctx.getBean("mybatis");
		
		ManageVO board = mybatis.selectOne("org.comstudy21.myweb.BoardMapper.getBoard", 1);
		System.out.println(board);
		
		AdminVO admin = mybatis.selectOne("org.comstudy21.myweb.AdminrMapper.getAdmin", "admin1");
		System.out.println(admin);
	}

}