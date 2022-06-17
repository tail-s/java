package example01;

class A{}
class B extends A{}
class C extends A{}

interface I{}
class D implements I {}
class E implements I {}

public class ClassCastEx {

	public static void main(String[] args) {
		
		//조상클래스의 참조변수가 참조하고 있는 인스턴스의 타입이 무엇인가? -> B
		A a = new B();
		B b = (B)a;
		System.out.println("실행완료");
		
//		A a1 = new B();
//		C c = (C)a1;	//ClassCastException발생
//		System.out.println("실행완료");
		
		//인터페이스의 참조변수가 참조하고 있는 인스턴스의 타입이 무엇인가?
		I i = new D();
		D d = (D)i;
		System.out.println("실행완료");
		
		I i2 = new D();
		E e = (E)i2;	//ClassCastException발생
		System.out.println("실행완료");

	}

}
