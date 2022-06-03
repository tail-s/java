package example03;

public class Person {
	
	//final 초기화 방법
	//1.tjsdjsrhk ehdtldp chrlghk
	final String nation = "KOREA";	//상수선언
	//2.생성자에서 단 한번 초기화
	final int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "nation : " + this.nation + ", age : " + this.age;
	}

}
