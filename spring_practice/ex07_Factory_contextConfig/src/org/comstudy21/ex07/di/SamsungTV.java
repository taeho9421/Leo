package org.comstudy21.ex07.di;

public class SamsungTV implements TV  {

	/* (non-Javadoc)
	 * @see org.comstudy21.ex07.di.TV#powerOn()
	 */
	@Override
	public void powerOn() {
		System.out.println("삼성TV 전원 켠다.");
	}
	
	/* (non-Javadoc)
	 * @see org.comstudy21.ex07.di.TV#powerOff()
	 */
	@Override
	public void powerOff() {
		System.out.println("삼성TV 전원 끈다.");
	}

	/* (non-Javadoc)
	 * @see org.comstudy21.ex07.di.TV#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("삼성TV 전원 소리 높인다.");
	}

	/* (non-Javadoc)
	 * @see org.comstudy21.ex07.di.TV#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("삼성TV 소리 내린다.");
	}


}
