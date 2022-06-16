package example02;

public class A {
	
	public A() {
		System.out.println("------------------------------");
		System.out.println("외부클래스 A의 생성자 호출");		
		
		B b = new B(); //이게 왜 가능할까요? - 인스턴스 멤버클래스는 외부클래스A의 멤버이다.
		System.out.println(b.a);
		b.method1();
		
		C c = new C();
		System.out.println(c.a);
		System.out.println(C.c);
		c.method1();
		C.method2();
		
		this.method();
		//D d = new D();	//메서드 내부에 선언 되어 있기 때문에
		
		System.out.println("------------------------------");
	}
	
	//인스턴스 멤버클래스 B
	class B{
		int a = 10;
		//static int cv = 20; 불가능
		public B() {
			System.out.println("중첩클래스 B의 생성자 호출");
		}
		public void method1() {
			System.out.println("B클래스의 멤버메서드 호출");
		}
		//static void method2() {}
	}
	//정적 멤버 클래스 C
	static class C {
		int a = 10;
		static int c = 20;
		
		public C() {
			System.out.println("정적멤버클래스 C의 생성자 호출");
		}
		
		public void method1() {
			System.out.println("정적멤버클래스C의 메서드1 호출");
		}
		
		public static void method2() {
			System.out.println("정적멤버클래스C의 정적메서드2 호출");
		}
	}
	
	public void method() {
		//로컬클래스 안에는 절대로 static멤버가 못온다.
		class D{
			int a = 1000;
			public D() {
				System.out.println("로컬클래스 D의 생성자 호출");
			}
			public void lmethod() {
				System.out.println(this.a);
				System.out.println("로컬클래스 D의 멤버 메서드 호출");
			}
		}
		//로컬클래스는 메서드 내부에서만 사용이 가능하다.
		D d = new D();
		d.lmethod();
	}

}
