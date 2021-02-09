package org.comstudy21.myweb.common;

import java.sql.SQLException;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.h2.tools.Server;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class H2DbCtrl {
	Server server;
	
	@Pointcut("execution(* org.comstudy21.myweb..*Impl.*(..))" )
	public void allPointcut() { }
	
	@Before("allPointcut()")
	public void startDB() {
		try {
			System.out.println("start the TCP Server ...");
			server = Server.createTcpServer(null).start();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@After("allPointcut()")
	public void stopDB() {
		System.out.println("stop the TCP Server ...");
		server.stop();
	}
}
