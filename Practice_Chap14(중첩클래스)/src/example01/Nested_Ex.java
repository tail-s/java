package example01;

public class Nested_Ex {
	
	//인스턴스 멤버 클래스
	class A {
		int iv = 100;
		//static int cv = 200;	//static멤버변수는 사용 불가 Nested_Ex.A.cv 접근이 안되므로.
		public A() {
			System.out.println("A생성자 호출");
		}
	}

	public static void main(String[] args) {
		

	}

}
