package example03;

public class Person implements A {

	@Override
	public void method() {
		System.out.println("인터페이스 A를 구현한 Person클래스입니다.");
		
	}
	
	public void method1() {
		System.out.println("Person클래스의 멤버메서드입니다.");
	}

}
