package example03;

public class AssignOperEx {

	public static void main(String[] args) {
		//복합 대입 연산자를 이해할 수 있도록 하자.
		
		int result = 0;
		
		//복합대입연산자는 값을 누적시킬 때 많이 사용을 한다.
		result += 10;	//result = result + 10;
		System.out.println("result : " + result);
		
		result -= 5;	//result = result - 5;
		System.out.println("result : " + result);
		
		result *= 5;	//result = result * 5;
		System.out.println("result : " + result);
		
		result /= 5;	//result = result / 5;
		System.out.println("result : " + result);
		
		result %= 5;	//result = result % 5;
		System.out.println("result : " + result);

	}

}
