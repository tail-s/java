package example03;

public class MemberPersonEx {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.method();
		member.method1();
		System.out.println(A.MAX);	//상수 접근 시 인터페이스명.상수명
		//인터페이스도 일종의 조상이다. 하여 다형성 개념이 적용된다.
		
		A a = new Member();	//인터페이스 필드의 다형성
		a.method();
		//a.method1();	//근본을 벗어나지 못하므로 Member클래스의 멤버메서드는 호출불가
		
		System.out.println();
		
		Person person = new Person();
		person.method();
		person.method1();
		
		a = new Person();
		a.method();

	}

}
