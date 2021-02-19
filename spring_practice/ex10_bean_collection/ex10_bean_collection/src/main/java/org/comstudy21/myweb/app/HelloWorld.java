package org.comstudy21.myweb.app;

public class HelloWorld {
	private String name;
	private String day;
	
	private MyMessage msg;
	
	public HelloWorld(String name, String day) {
		this.name = name;
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
