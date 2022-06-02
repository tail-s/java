package example01;

public class MemberReferEx {

	int iv;			//인스턴스 멤버변수
	static int cv;	//정적 멤버변수
	
	//인스턴스 메서드
	//이유 : 인스턴스 메서드가 호출될 때는 이미 인스턴스가 생성되어 있을 것임.
	public void instanceMethod() {
		System.out.println(this.iv);	//인스턴스 변수 사용가능
		System.out.println(cv); 		//정적멤버변수 사용가능
		staticMethod();					//정적멤버메서드 사용가능
	}
	
	//인스턴스가 언제 생성될지 아무도 모르기 때문에 정적 메서드 내에서는 인스턴스 멤버들을 절대 사용할 수가 없다.
	public static void staticMethod() {
		//System.out.println(this.iv);	//인스턴스 변수 사용불가
		System.out.println(cv); 		//정적멤버변수 사용가능
		//this.instanceMethod();			//인스턴스멤버 메서드 사용불가
	}

}
