package org.comstudy21.myweb;

import org.comstudy21.myweb.tv.TV;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
	
public class TVUser {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
		new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv = (TV)ctx.getBean("tv");
		
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
	
	public static void TVUser01(String[] args) throws InterruptedException {
		// 스프링을 사용할 것 
		// 1. 설정파일을 읽어(불러)와 Spring을 구동한다.
		// 2. 파일시스템에서 사용 : GenericXmlApplicationContext 
		//    웹 기반에서 사용 : XmlWebApplicationContext
		GenericXmlApplicationContext factory = 
		new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TV tv = (TV)factory.getBean("samsung.tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		Thread.sleep(2000);
		// lazy-init 설정을 했기 때문에 호출할때 빈 생성.
		tv = (TV)factory.getBean("lgTv");
		// Spring은 scope의 기본속성은 싱글톤 패턴이다.
		// scope="prototype"으로 변경하면 싱글톤이 아니다. 
	}
}
