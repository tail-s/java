package example02;

public class SecondArrayEx01 {

	public static void main(String[] args) {

		//[]대괄호의 갯수가 곧 차원을 의미한다.
		//2차원 배열을 선언과 동시에 초기화를 하고 있다.
		int[][] score = new int[][] {
										{100,100,100},
										{50,50,50},
										{10,20,30},
										{60,20,40}
									};
		//2차원 배열의 값을 읽고 쓰기 위해서는 더블루프가 반드시 필요하다.
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.println(score[i][j]);
			}
		}
		
		System.out.println("2차원 배열의 크기 : " + score.length);
		System.out.println("2차원 배열의 주소 : " + score);
		
		//2차원 배열에서는 2차원 배열명도 주소, 1차원 배열명도 주소가 된다.(중요)
		for(int i=0; i<score.length; i++) {
				System.out.println("1차원 배열의 크기 : " + score[i].length);
				System.out.println("1차원 배열의 주소 : " + score[i]);			
		}
		
		//2차원 배열에서는 배열명[][]이 곧 변수와 동일하다.
		score[0][0] = 999;
		System.out.println(score[0][0]);
		
		//향상된 for문( JDK 1.5 )
		//collection framework 객체에 접근할 때, 자주 사용되는 방법
		//for(  가져올 타입  :  가져올 장소  )
		int sum = 0;
		for(int[] temp:score) {
			for(int i:temp) {
				sum += i;
			}
		}
		System.out.println("합계 : " + sum);
									
	}

}
