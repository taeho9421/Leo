package org.comstudy21.myweb.app;

public class MyMessage {
	private String message = "사랑합니데이~";
	
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
