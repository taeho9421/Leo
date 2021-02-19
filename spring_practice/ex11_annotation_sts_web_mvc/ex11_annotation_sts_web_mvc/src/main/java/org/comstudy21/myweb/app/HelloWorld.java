package org.comstudy21.myweb.app;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	@Resource(name="userName")
	private String name;
	@Resource(name="day")
	private String day;
	
	@Inject
	private MyMessage msg;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setMyMessage(MyMessage msg) {
		this.msg = msg;
	}
	
	public void sayHello() {
		System.out.println(name + "님 "+ day +"도 안녕하세요^^");
		msg.print(); //사랑합니데이~~
	}
	
}
