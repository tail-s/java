package example03;

public class ProductEx {

	public static void main(String[] args) {
		//멀티 타입 파라메터
		Product<Tv, String> p1 = new Product<>();
		p1.setT(new Tv(2019, 9));
		p1.setM("LG OLED 스마트 TV");
		
		System.out.println("나의 TV는 " + p1.getT().getYear() + "년 " + 
		p1.getT().getMonth() + "월 식이며, " + p1.getM() + "이다.");

		System.out.println("---------------------------");
	
		Product<Car, String> p2 = new Product<>();
		p2.setT(new Car("현대", 2015, 8));
		p2.setM("그랜져 HG300");
		
		Car car = p2.getT();
		String str = p2.getM();
		
		System.out.println("나의 애마는 " + car.getYear() + "년" + car.getMonth() + "월 출시된 " + car.getBrand() + "의 " + str + "이다.");
	}

}
