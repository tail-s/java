package sec03.example01;

import java.util.function.IntBinaryOperator;

public class CalcEx {

	public static void main(String[] args) {
		
		//IntBinaryOperator함수적 인터페이스는 2개의 int값 매개변수를 받아 연산하여
		//하나의 int값으로 리턴하는 int applyAsInt(int, int)추상메서드를 가지고 있다.
		//하여, 람다식으로 구현을 하면 아래와 같다.
		IntBinaryOperator intBinaryOperator = null;
		
		//람다식 구현
		intBinaryOperator = (x, y) -> { return Calc.sAddMethod(x, y); };
		System.out.println("람다식 : " + intBinaryOperator.applyAsInt(100, 200));
		
		//메서드 참조 형태
		//번거롭게 람다식으로 구현을 할때 매개변수를 2번 적어주어야 한다는 것을 줄이기 위해서
		//아래와 같이 메서드 참조로 코딩을 하면 코드의 양을 줄일 수 있다라는 장점으로 고안된 방법이다.
		intBinaryOperator = Calc :: sAddMethod;
		System.out.println("메서드 참조 : " + intBinaryOperator.applyAsInt(100, 200));
				
		//람다식 구현
		intBinaryOperator = (x, y) -> { return Calc.sMulMethod(x, y); };
		System.out.println("람다식 : " + intBinaryOperator.applyAsInt(100, 200));

		intBinaryOperator = Calc :: sMulMethod;
		System.out.println("메서드 참조 : " + intBinaryOperator.applyAsInt(100, 200));
		
		Calc calc = new Calc();
		
		System.out.println("===========================================");
		
		//람다식 구현
		intBinaryOperator = (x, y) -> { return calc.iMethod(100, 200); };
		System.out.println("람다식 : " + intBinaryOperator.applyAsInt(100, 200));
		
		//메서드 참조
		intBinaryOperator = calc :: iMethod;
		System.out.println("메서드 참조 : " + intBinaryOperator.applyAsInt(100, 200));	
		
//		1.참조할 메서드의 매개변수와 리턴값이 무엇인지를 일단 먼저 명확하게 파악을 한다.
//		2.파악한 것을 토대로 적합한 함수적 인터페이스를 찾는다.
//		3.그 다음 정적인지 인스턴스메서드인지를 확인해서 메서드를 참조하는 것으로 익명구현객체를 만든다.

//		결론 : 메서드 참조 역시도 익명구현객체를 만드는 것이므로, 함수적 인터페이스에 대입이 가능하다는 것이고,
//		아울러, 매개변수와 리턴값이 맞는 것을 타켓 타입으로 선정하여 구현해야 되는 것이다.
//		그렇게 되면 코드가 줄어들고 데이터도 빠르게 처리가 가능해진다.	
	}
}