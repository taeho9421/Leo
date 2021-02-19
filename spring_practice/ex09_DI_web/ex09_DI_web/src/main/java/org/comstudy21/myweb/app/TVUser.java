package org.comstudy21.myweb.app;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//System.out.println("자바 어플리케이션");
		// 기술을 배울때 학+습
		// 학(30%), 습(70%)
		
		//new HelloWorld().sayHello();
		
		//스프링 context 구동시킨다.
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:/applicationContext.xml");
		HelloWorld hello = (HelloWorld)ctx.getBean("helloWorld");
		
		hello.sayHello();
	}
}
