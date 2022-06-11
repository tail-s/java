package example02;

public class FoldablePhone extends Phone {
	//생성자
	public FoldablePhone(int serial_No, String owner, String company) {
		super(serial_No, owner, company);
		// TODO Auto-generated constructor stub
	}

	//추상메서드 2개 재정의
	@Override
	public void turnOn() {
		System.out.println("폴더블 폰이 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("폴더블 폰이 꺼졌습니다.");
		
	}
	
	//자체메서드 2개
	public void foldOn() {
		System.out.println("폴드 기능이 사용됩니다.");
	}
	
	public void foldOff() {
		System.out.println("폴드 기능이 해제됩니다.");
	}

}
