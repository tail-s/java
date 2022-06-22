package example02;

public class EqualsEx {

	public static void main(String[] args) {
		
		String str1 = new String("홍길동");
		String str2 = "홍길동";	//리터럴 타입으로 대입
		String str3 = "홍길동";	//리터럴 타입으로 대입
		
		// == 연산자가 주소 비교
		if(str1 == str2) {
			System.out.println("같은 번지의 인스턴스");
		}
		else {
			System.out.println("다른 번지의 인스턴스");
		}
		
		// 같은 리터럴의 경우 같은 번지를 참조
		if(str2 == str3) {
			System.out.println("같은 번지의 인스턴스");
		}
		else {
			System.out.println("다른 번지의 인스턴스");
		}
		
		//String의 equals()는 값을 비교 (Object 클래스의 equals()가 오버라이딩 되어있음)
		if(str1.equals(str2)) {
			System.out.println("같은 문자열 입니다.");
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
		
		if(str2.equals(str3)) {
			System.out.println("같은 문자열 입니다.");
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}

	}

}
