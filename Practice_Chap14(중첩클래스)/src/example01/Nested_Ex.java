package example01;

public class Nested_Ex {
	
	//인스턴스 멤버 클래스
	class A {
		int iv = 100;
		//static int cv = 200;	//static멤버변수는 사용 불가 Nested_Ex.A.cv 접근이 안되므로.
		public A() {
			System.out.println("A생성자 호출");
		}
		public void method1() {
			System.out.println("A클래스의 method1() 호출");
		}
		//Nested_Ex.A.method2()를 호출할 수 없다.
//		public static void method2() {
//			
//		}
	}
	
	//정적 멤버 클래스
	static class B {
		
		int iv = 100;
		static int cv = 500; //Nested_Ex.B.cv 접근 가능하기 때문에 선언ㄷ가능
		public B() {
			System.out.println("B생성자 호출");
		}
		public void method1() {
			System.out.println("B클래스의 method2() 호출");
		}
		public static void method2() {
			System.out.println("B클래스의 method2() 호출");
		}
	}

	
	
	
	
	public static void main(String[] args) {
		

	}

}
