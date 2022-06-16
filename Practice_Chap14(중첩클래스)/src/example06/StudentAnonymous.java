package example06;

public class StudentAnonymous {
	
	//필드의 초기값
	Student student1 = new Student("홍길동") {
		//익명자손객체의 멤버메서드
		public void goSchool() {
			System.out.println(this.name + "이 등교합니다.");
		}
		@Override
		public void wake() {
			System.out.println("-----------------------");
			System.out.println("필드의 초기값 형태로 만들어진 익명자손객체");
			System.out.println(this.name + "이 일어납니다.");
			this.goSchool();
			System.out.println("----------------------");
		}
	};
	//로컬변수의 초기값 형태
	public void method1() {
		Student lStudent = new Student("김연아") {
			
			public void goSkate() {
				System.out.println(this.name + "가 연습하러 스케이트장에 갑니다.");
			}
			@Override
			public void wake() {
				System.out.println("-----------------------");
				System.out.println("로컬변수의 초기값 형태로 만들어진 익명자손객체");
				System.out.println(this.name + "가 일어납니다.");
				this.goSkate();
				System.out.println("----------------------");
			}
		};
		lStudent.wake();
	}
	
	//메서드의 매개변수 값
	public void method2(Student student) {
		student.wake();
	}

}
