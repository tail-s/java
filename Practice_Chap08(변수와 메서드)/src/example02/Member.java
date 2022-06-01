package example02;

public class Member {
	
	int iv = 100;			//인스턴스 멤버변수
	static int cv = 200;	//static 멤버변수
	
	//인스턴스 메서드
	public void imethod() {
		System.out.println("iv : " + this.iv);
		//System.out.println("cv : " + Member.cv);  //클래스명.정적변수명
	}
	
	public static void smethod() {
		//System.out.println("iv : " + this.iv);    //안된다. 인스턴스가 생성되어야만 사용 가능하기 때문.
		System.out.println("cv : " + Member.cv);    //cv는 static변수이기 때문에 인스턴스 생성 없이도 접근 가능하다.
	}

}
