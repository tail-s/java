package example02;

public class SmartPhone extends Phone {

	public SmartPhone(int serial_No, String owner, String company) {
		super(serial_No, owner, company);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("스마트폰이 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰이 꺼졌습니다.");
		
	}
	
	//자체메서드 1개
	public void internetSearch() {
		System.out.println("네이버를 실행합니다.");
	}
	
	

}
