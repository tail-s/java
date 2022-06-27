package arraysExample;

import java.util.Arrays;

//사용자 정의 클래스는 정렬을 하기 위해서는 Comparable인터페이스를 구현해야 함.
class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
//		return this.name.compareTo(o.name);	//사전순 오름차순
//		return o.name.compareTo(this.name);	//역순
		return this.age - o.age;	//나이순
//		return o.age - this.age;	//나이 역순
	}
	
}

public class ArraySortEx {

	public static void main(String[] args) {
		
		Person person1 = new Person("홍길동", 29);
		Person person2 = new Person("김길동", 9);
		Person person3 = new Person("서길동", 59);
		Person person4 = new Person("주길동", 38);
		Person person5 = new Person("고길동", 8);
		
		Person[] persons = { person1, person2, person3, person4, person5 };
		Arrays.sort(persons);
		//배열검색(binarySearch는 반드시 sort하고 난 뒤에 해야한다.)
		int index = Arrays.binarySearch(persons, person1);
		System.out.println("person1인스턴스가 있는 인덱스 : " + index + ", 이름 : " + person1.name);

		System.out.println();
		for(Person person : persons)
			System.out.println("이름 : " + person.name + ", 나이 : " + person.age);
		
		//기본형 타입과 String클래스는 기본적으로 오름차순 정렬이 이루어진다.
		int[] arr = { 55, -10, -9, 0, 100};
		
		Arrays.sort(arr);
		System.out.println("기본형 타입 소팅 후 : " + Arrays.toString(arr));
		
		String[] names = new String[] { "김개똥", "홍길동", "신은혁", "김소진" };
		Arrays.sort(names);
		System.out.println("String형 타입 소팅 후 : " + Arrays.toString(names));

	}

}
