package sec01.example02;

public class LamdaEx {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (x) -> {
			int result = x * 10;
			System.out.println("매개변수 x값을 가지고 람다식을 구현한 메서드의 값 : " + result);
		};
		//여기서 500은 매개변수이다. 하여, 람다식의 매개변수인 x에 대입이 되어진다.
		myInterface.method(500);
		
		//매개변수가 하나이기 때문에 ()를 생략이 가능하다.
		myInterface = x -> 			
			System.out.println("매개변수 x값을 가지고 람다식을 구현한 메서드의 값 : " + (x * 10));
		
		myInterface.method(500);		
	}
}
