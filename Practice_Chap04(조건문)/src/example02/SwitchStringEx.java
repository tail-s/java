package example02;

public class SwitchStringEx {
	
	public static void main(String[] args) {
		
		//문자열이 조건으로 왔다.
		String str = "부장";
		
		switch(str) {
			case "부장" :
				System.out.println("450만원");
				break;
			case "차장" : 
				System.out.println("400만원");
			case "과장" :
				System.out.println("350만원");
			case "대리" :
				System.out.println("250만원");
			case "사원" :
				System.out.println("200만원");
			default :
				System.out.println("없는 직급입니다.");
		}
		
	}

}
