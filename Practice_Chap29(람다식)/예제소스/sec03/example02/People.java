package sec03.example02;

public class People {

	private String name;
	private int age;
	
	public People() {
		System.out.println("�⺻������ ȣ��");
	}
	
	public People(String name) {
		System.out.println("People(String name)������ ȣ��");
		this.name = name;
	}
	
	public People(String name, int age) {
		System.out.println("People(String name, int age)������ ȣ��");
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name + " , " + this.age;
	}
	
	
	
}
