package sec02.example07;

import java.util.function.Function;

public class FunctionAndThenEx {

	public static void main(String[] args) {
		
		//Function<T,R>함수적인터페이스는 T를 매개값으로 주고 R로 매핑하여 리턴해준다.
		//apply()추상메서드를 가지고 있다.
		//결과는 andThen()를 통해서 People을 주면 String을 얻는 결과가 나온다.
		//여기서 Address는 functionA의 리턴값으로 그리고 functionB의 매개값으로 사용되어져서
		//결과값이 country가 나오도록 중심축 역할을 하는 것을 알 수가 있다.
		Function<People, Address> functionA = p -> { return p.getAddress(); };
		Function<Address, String> functionB = a -> { return a.getCountry(); };
		Function<People, String> functionAB = functionA.andThen(functionB);

		String country = functionAB.apply(
				new People("신은혁", "Shin", new Address("한국", "대구")));		
		System.out.println("국적 : " + country);
		
		functionAB = functionB.compose(functionA);		
		country = functionAB.apply(
				new People("신은혁", "Shin", new Address("한국", "대구")));		
		System.out.println("국적 : " + country);		
	}
}
