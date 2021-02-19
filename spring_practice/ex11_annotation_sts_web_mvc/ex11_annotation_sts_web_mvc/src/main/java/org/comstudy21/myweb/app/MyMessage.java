package org.comstudy21.myweb.app;

import org.springframework.stereotype.Component;

// DTO 기능과 유사하다.
@Component
public class MyMessage {
	private String message = "사랑합니데이~";
	
	public MyMessage() {
		// TODO Auto-generated constructor stub
	}
	public MyMessage(String message) {
		// constructor injection
		this.message = message;
	}
	
	public void print() {
		System.out.println(message);
	}
	
	@Override
	public String toString() {
		return message;
	}

}
