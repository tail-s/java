package example02;

public class PersonEx {

	public static void main(String[] args) {
		//Person제네릭클래스에 T를 String만 들어오게끔 무조건 만들었다.
		Person<String> person1 = new Person<>();
		person1.setT("홍길동");
		String str = person1.getT();
		System.out.println(str);
		
		//현업에서 데이터의 통일화, 타입 변환 제거, 컴파일 시 예외를 발생시켜줌
		Person<Integer> person2 = new Person<>();
		//person2.setT(new Integer(100));
		person2.setT(50);	//자동 박싱
		int value = person2.getT();
		System.out.println(value);
		
		Person<Apple> person3 = new Person<>();
		//person2.setT(new Integer(100));
		person3.setT(new Apple());	//자동 박싱
		Apple apple = person3.getT();
		System.out.println(apple);

	}

}
