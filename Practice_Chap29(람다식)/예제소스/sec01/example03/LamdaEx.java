package sec01.example03;

public class LamdaEx {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		int result = myInterface.method(100, 200);
		System.out.println("매개변수 2개와 리턴값이 있는 람다식의 값 : " + result);
			
		
		myInterface = (x, y) -> { return x + y; };
		result = myInterface.method(300, 200);
		System.out.println("매개변수 2개와 리턴값이 있는 람다식의 값 : " + result);
		
		//return문이 하나라면 생략 가능하다.
		myInterface = (x, y) ->  x + y; 
		result = myInterface.method(1000, 200);
		System.out.println("매개변수 2개와 리턴값이 있는 람다식의 값 : " + result);
		
		//메서드 호출시 매개값으로 x, y가 넘어간다.
		myInterface = (x, y) ->  add(x, y); 
		result = myInterface.method(700, 200);
		System.out.println("add메서드 호출 후 람다식의 값 : " + result);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
}
