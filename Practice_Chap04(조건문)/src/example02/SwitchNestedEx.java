package example02;

public class SwitchNestedEx {

	public static void main(String[] args) {

		int number = 7;
		
		//정형화 된 값, 정해져 있는 값들에게는 switch문 가독성이 좋다 (if문에 비해서)
		switch(number) {
		case 1:
		case 7:
			//중첩 switch문 활용
			switch(number) {
			case 1:
				System.out.println("011 이시군요");
				break;
			case 7:
				System.out.println("017 이시군요");
				break;
			}
			break;
		case 6 :
		case 9 :
			if(number == 6) {
				System.out.println("016 이시군요");
			}
			else if(number == 9) {
				System.out.println("019 이시군요");
			}
			break;
		}

	}

}
