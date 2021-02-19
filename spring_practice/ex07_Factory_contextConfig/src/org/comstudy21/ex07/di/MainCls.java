package org.comstudy21.ex07.di;

public class MainCls {
	
	// 의존성 - new를 객체를 생성하는 것 
	// 결합도를 낮추는 것 ( 루즈 커플링 ) 
	// 응집력은 높이는 프로그램. . .
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff(); 
	}
	
	public static void TVUser4(String[] args) {
		String breanName = "lg";
		if(args.length >0) {
			breanName = args[0];
			System.out.println(breanName);
		}
		TV tv = R.tvMapper.get(breanName);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff(); 
	}
	
	public static void TVUser3(String[] args) {
		TV tv = R.tv;
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff(); 
	}
	
	public static void TVUser1(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
	
	public static void TVUser2(String[] args) {
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}
	
}

/*
 * 스프링 프레임워크의 특징
 * 1. 경량 컨테이너 
 * 2. 제어의 역행 (IOC) - 의존성 주입(DI)
 * 3. 관점지향 프로그래밍이 가능하다.==> AOP 
 */
