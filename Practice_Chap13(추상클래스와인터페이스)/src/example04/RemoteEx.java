package example04;

public class RemoteEx {

	public static void main(String[] args) {
		
		//인터페이스도 일종의 조상, 하여 필드의 다형성이 허용된다.
		RemoteControl rControl = new Television();
		rControl.turnOn();
		rControl.setVolume(15);
		rControl.setVolume(-100);
		rControl.turnOff();
		
		System.out.println();
		
		rControl = new Audio();
		rControl.turnOn();
		rControl.setVolume(15);
		rControl.setVolume(-50);
		rControl.turnOff();
		

	}

}
