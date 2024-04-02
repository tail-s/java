package sec03.example02;

public class People {

	private String name;
	private int age;
	
	public People() {
		System.out.println("기본생성자 호출");
	}
	
	public People(String name) {
		System.out.println("People(String name)생성자 호출");
		this.name = name;
	}
	
	public People(String name, int age) {
		System.out.println("People(String name, int age)생성자 호출");
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name + " , " + this.age;
	}
	
	
	
}
