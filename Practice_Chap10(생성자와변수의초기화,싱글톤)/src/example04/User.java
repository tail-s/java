package example04;

public class User {
	
	//해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성을 하고 있다.
	private static User singleton = new User();
	
	//해당 클래스를 외부에서 new연산자로 인스턴스를 생성 못하게 막는다.
	private User() {		
	}
	
	public static void add() {
		System.out.println("add메서드 호출");		
	}
	
	//해당 클래스의 멤버의 주소를 넘겨주기(공유)위해서 외부에서 호출할 수 있는 getter메서드를 제공해주고 있다.
	public static User getInstance() {
		return User.singleton;
	}

}
