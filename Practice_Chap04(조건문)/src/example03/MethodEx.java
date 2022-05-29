package example03;

public class MethodEx {
	
	//메서드의 선언부 구성
	//1. 리턴 타입 (반환값) : int
	//2. 메서드명 
	//3. () : 매개변수, 인자값, Arguments
	//메서드 선언부 중요도(98%이상), 메서드 구현부(정의부)
	public static int add(int x, int y, int z) {
//		int temp = 0;
//		temp = x + y + z;
//		return temp;
		System.out.println("add 메서드 호출됨");
		return x + y + z;
	}
	
	public static int minus(int x, int y) {
		System.out.println("minus 메서드 호출됨");
		return x - y;
	}

	public static void main(String[] args) {

			int num1 = 10;
			int num2 = 30;
			
			//값에 의한 복사(Call by value)
			int result = add(num1, num2, 100);
						
			System.out.println("num1 + num2 + 100 : " + result);
			
			result = minus(num1, num2);
			System.out.println("num1 - num2 : " + result);

	}

}
