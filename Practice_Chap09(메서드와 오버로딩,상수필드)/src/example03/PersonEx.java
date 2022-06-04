package example03;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person(50);
		Person p2 = new Person(150);
		Person p3 = new Person(250);
		//p.nation = "USA"; //final속성은 상수이므로 값을 변경할 수 없음.		
		//p.age = 100;
		
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		
		System.out.println(Person.MAX_NUMBER);

	}

}
