package example03;

public class RandomEx {

	public static void main(String[] args) {

		//Math.random()값은 0.00000 ~ 0.99999 사이의 값을 발생시킴
//		System.out.println(Math.random());
		
		//주사위 눈을 랜덤 발생
		int num = (int)(Math.random()*6) + 1; // 1~6 범위의 수를 발생시키는 식
//		System.out.println(num);
		
		if(num == 1) {
			System.out.println("1이 나왔습니다!");
		}
		else if(num == 2) {
			System.out.println("2가 나왔습니다!");
		}
		else if(num == 3) {
			System.out.println("3이 나왔습니다!");
		}
		else if(num == 4) {
			System.out.println("4가 나왔습니다!");
		}
		else if(num == 5) {
			System.out.println("5가 나왔습니다!");
		}
		else {
			System.out.println("6이 나왔습니다");
		}

	}

}
