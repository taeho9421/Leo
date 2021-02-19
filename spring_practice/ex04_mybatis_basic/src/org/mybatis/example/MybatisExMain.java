package org.mybatis.example;

import java.io.IOException;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.h2.tools.Server;

public class MybatisExMain {

	public static void main(String[] args) throws IOException, SQLException {
		Server server = Server.createTcpServer(args).start();
		String resource = "org/mybatis/example/mybatis-config.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is); 
		
		SqlSession mybatis = sqlSessionFactory.openSession();
		BoardDto board = mybatis.selectOne("org.mybatis.example.BlogMapper.selectBoard",1);
		System.out.println(board);
		
		mybatis.close();
	}
}
