package org.comstudy21.myweb.tv;

public class Speaker {
	private int volume;
	private String name;
	
	public Speaker(String name, int volume) {
		this.name = name;
		this.volume = volume;
	}
	
	public void soundUp() {
		volume++;
		System.out.println(name + "볼륨을 올립니다. . volume:" +volume);
	}

	public void soundDown() {
		volume--;
		System.out.println(name + "볼륨을 내립니다. . .volume: "+volume);
	}

}
