package example03;

public class ProductEx {

	public static void main(String[] args) {
		
		Product<Tv, String> p1 = new Product<>();
		p1.setT(new Tv(2019, 9));
		p1.setM("LG OLED 스마트 TV");
		
		System.out.println("나의 TV는 " + p1.getT().getYear() + "년 " + 
		p1.getT().getMonth() + "월 식이며, " + p1.getM() + "이다.");

	}

}
