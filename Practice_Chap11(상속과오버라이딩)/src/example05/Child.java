package example05;

public class Child extends Parent {
	
	int x = 20;
	
	public Child() {
		//super();	//조상클래스의 기본생성자를 호출. 생략하더라도 컴파일러가 알아서 추가해줌.
		super(80);	//조상클래스의 매개변수가 있는 생성자를 호출, 생략 불가
		System.out.println("자손클래스의 생성자 호출");
	}
	
	@Override
	public void show() {
		System.out.println("현재 인스턴스의 x = " + x);
		System.out.println("자손클래스의 this.x = " + this.x);
		System.out.println("조상클래스의 super.x = " + super.x);
		super.show();	//조상클래스의 show()호출
	}

}
