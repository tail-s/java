package example02;

public class PhoneEx {

	public static void main(String[] args) {
		
		//추상클래스는 인스턴스를 생성할 수 없다.
		//Phone phone = new Phone();
		
		Phone[] p = new Phone[10];
		
		p[0] = new SmartPhone(190820, "티아라", "SAMSUNG-FOLDABLE-20");
		p[1] = new FoldablePhone(190815, "홍길동", "LG-V50");
		
		//자손클래스의 메소드는 사용불가(근본은 Phone 클래스), 오버라이딩한 추상메소드는 자손클래스에서 불러옴.
		p[0].turnOff();
		p[0].showInfo();
		
		System.out.println("-------------------------------------");
		
		SmartPhone smartPhone = new SmartPhone(190815, "홍길동", "LG-V50");
		smartPhone.showInfo();
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
		System.out.println("-------------------------------------");
		
		FoldablePhone fPhone = new FoldablePhone(190820, "티아라", "SAMSUNG-FOLDABLE-20");
		fPhone.showInfo();
		fPhone.turnOn();
		fPhone.turnOff();
		fPhone.foldOn();
		fPhone.foldOff();
	}

}
