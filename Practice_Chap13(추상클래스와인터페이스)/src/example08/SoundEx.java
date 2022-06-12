package example08;

public class SoundEx {

	public static void main(String[] args) {	
		//익명구현객체(이름없음) -- UI이벤트 처리나 스레드 객체 간편생성
		Soundable soundable1 = new Soundable() {	//타입(근본)이 인터페이스
			//내부적으로 클래스니까 멤버들을 선언할 수 있지만 외부에서 접근 불가(근본이 인터페이스)
			int a = 10;
			public void method() {
				System.out.println("익명구현객체 메서드");
			}
			
			@Override
			public void sound() {				
				String str = "냄비";
				System.out.println("첫 번째 익명구현객체 : " + str);
				System.out.println(str + "에 물을 담습니다.");
				System.out.println(str + "를 숟가락으로 탕탕 때립니다.");	
				this.method();
				System.out.println(this.a);
			}
		};
		
		Soundable soundable2 = new Soundable() {	//타입(근본)이 인터페이스
			//내부적으로 클래스니까 멤버들을 선언할 수 있지만 외부에서 접근 불가(근본이 인터페이스)
			int a = 10;
			public void method() {
				System.out.println("익명구현객체 메서드");
			}
			
			@Override
			public void sound() {				
				String str = "밥그릇";
				System.out.println("첫 번째 익명구현객체 : " + str);
				System.out.println(str + "에 물을 담습니다.");
				System.out.println(str + "를 숟가락으로 탕탕 때립니다.");	
				this.method();
				System.out.println(this.a);
			}
		};
		
		soundable1.sound();
		soundable2.sound();
	}
}
