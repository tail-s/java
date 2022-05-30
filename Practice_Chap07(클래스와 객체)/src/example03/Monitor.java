package example03;

public class Monitor {
	
	//멤버변수(필드)
	String color;	//모니터의 색상
	int channel;	//채널
	int volume;		//볼륨
	boolean power;	//전원 on/off
	
	//멤버메서드
	//Monitor를 켜거나 끄는 기능을 하는 메서드
	public void power() {	
		
		if(!this.power) {
			System.out.println("모니터가 켜졌습니다!");
		}
		else {
			System.out.println("모니터가 꺼졌습니다!");			
		}
		this.power = !power;
	}
	
	public void channelUp() {
		if(power) {
			this.channel++;
			System.out.println("현재 채널 : " + this.channel);
		}		
	}
	
	public void channelDown() {
		if(power) {
			//this.channel--;
			System.out.println("현재 채널 : " + --this.channel);
		}		
	}
	
	public void volumeUp() {
		if(power) {
			this.volume++;
			System.out.println("현재 볼륨 : " + this.volume);
		}		
	}
	
	public void volumeDown() {
		if(power) {
			//this.volume--;
			System.out.println("현재 볼륨 : " + --this.volume);
		}		
	}
	
	@Override
	public String toString() {		
		return "현재 채널 : " + this.channel + ", " + "현재 볼륨 : " + this.volume;
	}
	
	

}
