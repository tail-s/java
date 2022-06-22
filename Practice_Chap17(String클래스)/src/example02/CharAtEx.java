package example02;

public class CharAtEx {

	public static void main(String[] args) {
		
		String ssn = "980203-2456871";
		//특정문자를 받고자 할 때
		char gender = ssn.charAt(7);
		
		if(gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		}
		else if(gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		}
		else {
			System.out.println("사람이 아닙니다.");
		}

	}

}
