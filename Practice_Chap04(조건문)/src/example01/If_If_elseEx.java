package example01;

public class If_If_elseEx {

	public static void main(String[] args) {

		int score = -500;
		
		//수십 개의 if문이 존재하더라도, CPU는 모든 if문을 참조합니다. (비효율적인 코드)
//		if(score > 90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		}
//		
//		if(score > 80) {
//			System.out.println("점수가 80보다 큽니다.");
//			
//		}
		
		//if-else 구문은 50% 확률일 때, 사용하는게 바람직하다. else 구문 옆에는 조건문이 절대로 오면 안된다.
		//중괄호 안의 내용이 한문장일 경우 중괄호를 생략해도 되나, 항상 사용하는 습관화하는게 좋음.
		if(score > 90) {
			System.out.println("90점 이상입니다.");
		}
		else {
			System.out.println("90점 미만입니다.");
		}
		

	}

}
