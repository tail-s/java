package example02;

import java.util.HashSet;

public class PersonEx {

	public static void main(String[] args) {
		
		//사용자 정의 클래스에서는 hash시리즈들을 반드시 hashcode()와 equals()를 오버라이딩 해야 중복저장이 안된다.
		HashSet hashSet = new HashSet();
		
//		String str1 = new String("가");
//		String str2 = new String("가");
		Person person1 = new Person("홍길동", 40);
		Person person2 = new Person("홍길동", 40);
		
//		hashSet.add(str1);
//		hashSet.add(str2);
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());

		System.out.println();
		
		//자동적으로 toString()호출
		System.out.println(person1);
		System.out.println(person2);
	}

}
