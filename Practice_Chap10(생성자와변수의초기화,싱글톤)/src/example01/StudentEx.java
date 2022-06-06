package example01;

public class StudentEx {

	public static void main(String[] args) {
		
		//기본생성자 호출
		Student st = new Student();
		System.out.println(st);
		
		//매개변수가 있는 생성자를 호출
		Student st2 = new Student("홍길동", 50);
		System.out.println(st2);

		Student st3 = new Student("홍길동");
		System.out.println(st3);
		
		Student st4 = new Student(50);
		System.out.println(st4);
	}

}
