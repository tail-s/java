package example05;
//조상클래스
public class Parent {
	
	int x = 100;
	
//	public Parent() {
//		System.out.println("조상클래스 생성자 호출");
//	}
	
	//매개변수가 있는 생성자
	public Parent(int x) {
		System.out.println("조상클래스 매개변수가 있는 생성자 호출");
		this.x = x;
	}
	
	public void show() {
		System.out.println("조상 클래스의 show()호출");
	}
}
