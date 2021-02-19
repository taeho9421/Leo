package org.comstudy21.myweb.tv;

public class SamsungTV implements TV  {
	private Speaker speaker;
	
	// 스프링 설정파일에서 DI 기술을 이용해서 의존성 주입 
	// 내가 만든 객체를 가져다 쓴다 : DI (ex] TV, speaker) 
	public void setSpeaker(Speaker speaker) {
		System.out.println("스피커 장착. . .");
		this.speaker = speaker;
	}
	
	// 빈이 생성 될 때 자동 실행하는 메소드
	public void initMethod() {
		System.out.println("initMethod() 호출. . . ");
	}
	
	public SamsungTV() {
		System.out.println("SamsungTV 기본 생성자");
	}
	
	public void close() {
		System.out.println("close() 메세지 호출. . .");
	}
	
	@Override
	public void powerOn() {
		System.out.println("삼성TV 전원 켠다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("삼성TV 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		//System.out.println("삼성TV 전원 소리 높인다.");
		speaker.soundUp();
	}

	@Override
	public void volumeDown() {
		//System.out.println("삼성TV 소리 내린다.");
		speaker.soundDown();
	}


}
