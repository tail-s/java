package sec01.example01;

public class LamdaEx {

	public static void main(String[] args) {
		
		//람다식을 이용해서 익명구현객체를 생성하고 있는 것이다.
		//매개변수가 없을 때, ()는 생략 불가인 걸 알고 있다.
		//{}는 추상메서드인 method()의 구현부가 들어가야 하며,
		//여기서 2줄이기 때문에 {}를 생략할 수가 없다.
		MyInterface myInterface = () -> {
			String str = "람다식으로 만든 익명구현객체입니다.";
			System.out.println(str);			
		};
		myInterface.method();
		
		//직접 익명구현객체를 만드는 것이다.
		MyInterface myInterface2 = new MyInterface() {
			@Override
			public void method() {
				String str = "람다식으로 만든 익명구현객체입니다.";
				System.out.println(str);
			}
		};
		myInterface2.method();

		myInterface = () -> { System.out.println("람다식으로 만든 익명 구현객체111"); };
		myInterface.method();		
		System.out.println();
		
		//실행문이 하나일 경우에는 {}는 생략 가능하다.
		myInterface = () -> System.out.println("람다식으로 만든 익명 구현객체222");
		myInterface.method();
		System.out.println();
		
		//결론 : 익명구현객체를 생성시에 코드의 절감으로 람다식을 사용할 수가 있다.
		
		
		
		
		
		
		
		
		
		
		
	}

}
