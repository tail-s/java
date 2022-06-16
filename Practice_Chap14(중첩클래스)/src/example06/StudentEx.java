package example06;

public class StudentEx {

	public static void main(String[] args) {
		
		StudentAnonymous anonymous = new StudentAnonymous();
		anonymous.student1.wake();
		
		anonymous.method1();
		
		//매개변수의 매개값으로 익명자손객체를 직접 생성해서 넘기는 형태
		anonymous.method2(new Student("손흥민") {
			
			public void training() {
				System.out.println(this.name + "이 운동을 합니다.");
			}
			@Override
			public void wake() {
				System.out.println("-----------------------");
				System.out.println("매개변수의 초기값 형태로 만들어진 익명자손객체");
				System.out.println(this.name + "이 일어납니다.");
				this.training();
				System.out.println("----------------------");
			}
		});

	}

}
