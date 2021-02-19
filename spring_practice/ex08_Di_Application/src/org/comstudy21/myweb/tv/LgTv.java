package org.comstudy21.myweb.tv;

public class LgTv implements TV {
	
	public LgTv() {
		System.out.println("LgTv 디폴트 생성자");
	}
	
	public void turnOn() {
		System.out.println("LG TV 전원 켠기.");
	}
	
	public void turnOff() {
		System.out.println("LG TV 전원 끄기.");
	}

	public void soundUp() {
		System.out.println("LG TV 소리 키우기.");
	}

	public void soundDown() {
		System.out.println("LG TV 소리 줄이기.");
	}

	@Override
	public void powerOn() {
		turnOn();
	}

	@Override
	public void powerOff() {
		turnOff();
	}

	@Override
	public void volumeUp() {
		soundUp();
	}

	@Override
	public void volumeDown() {
		soundDown();
	}

}
