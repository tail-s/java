package example02;

public class SwitchEx {

	public static void main(String[] args) {

		int score = 95;
		
		//int 이하의 정수값, String값
		switch(score/10) {
			case 10 :
			case 9 :
				System.out.println("A 입니다.");
				break;
			case 8 :
				System.out.println("B 입니다.");
				break;
			case 7 :
				System.out.println("C 입니다.");
				break;
			default :
				System.out.println("D 입니다.");			
		
		
		}

	}

}
