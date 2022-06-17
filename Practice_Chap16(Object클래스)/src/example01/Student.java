package example01;

import java.util.Arrays;

public class Student {
	
	int age;
	String name;
	int[] subject;
	
	public Student(int age, String name, int[] subject) {
		this.age = age;
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		//타입 변환이 가능한지 여부를 알아보기 위해서 instanceof연산자 이용
		if(obj instanceof Student) {
			Student student = (Student)obj;
			//논리적 동등을 위해서 조건문을 설정, age와 name이 모두 같은지 확인하는 조건
			boolean result = Arrays.equals(this.subject, student.subject);
			if((this.age == student.age) && (this.name.equals(student.name)) && result) {
				return true;
			}
		}
		return false;
	}
}
