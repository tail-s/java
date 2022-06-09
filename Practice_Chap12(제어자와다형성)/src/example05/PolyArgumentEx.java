package example05;

public class PolyArgumentEx {

	public static void main(String[] args) {
		
		//필드의 다형성
//		Product p1 = new TV();
//		Product p2 = new Computer();
//		Product p3 = new Audio();
		//Product[] pArray = new Product[10];
		
		Buyer buyer = new Buyer();
		
		buyer.buy(new TV());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		//buyer.buy(new Apple());	//왜 컴파일 예외가 발생하는가? - Product 클래스의 자손이 아님

		System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
		System.out.println("현재 보너스포인트 : " + buyer.bonusPoint + "만원입니다.");
	}

}
