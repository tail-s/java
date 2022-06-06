package example01;

public class Student {
	
	//인스턴스멤버변수를 선언함.
	private String name;
	private int age;
	
	//Ctrl+Space
	//클래스명과 생성자명이 반드시 같아야 한다.
	//생성자는 리턴타입이 존재하지 않는다. (void라는 것을 써주지 않는다.)
	//생성자가 하나도 없는 클래스는 기본적으로 컴파일시에 컴파일러가 알아서 기본생성자를 추가해준다.
	public Student() {
		System.out.println("기본생성자 호출");
		//return; 적어줘도 됨.
	}	
	
	//매개변수가 있는 생성자
	//생성자라는 것은 인스턴스 초기화 메서드라고 생각하자.
	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}	
	
	public Student(String name) {
		System.out.println("매개변수 String만 있는 생성자 호출");
		this.name = name;
	}
	
	public Student(int age) {
		System.out.println("매개변수 int만 있는 생성자 호출");
		this.age = age;
	}
	
	
	
	
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return this.getName() + ", " + this.getAge();
	}

}
