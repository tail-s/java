package example04;

import java.rmi.Remote;

public class Television implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//볼륨 0~10 사이의 값으로 유지
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("TV 볼륨의 최대값은 10입니다.");
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			System.out.println("TV 볼륨의 최소값은 0입니다.");
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("TV의 현재 볼륨 : " + this.volume);
		
	}
	

}
