package example01;

public class Student {
	
	int age;
	
	public Student(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		//타입 변환이 가능한지 여부를 알아보기 위해서 instanceof연산자 이용
		if(obj instanceof Student) {
			Student student = (Student)obj;
			//논리적 동등을 위해서 조건문을 설정
			if(this.age == student.age) {
				return true;
			}
		}
		return false;
	}
}
