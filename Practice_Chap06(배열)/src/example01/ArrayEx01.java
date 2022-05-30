package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		//score는 참조변수이다. int[]이다.
		int[] score = null;
		//방도 만들이 않았는데, 값을 대입하고있다. (문법에러)
		//score = {100, 29};
		//score는 5개의 방을 heap에 생성하고 있다. (20byte)
		score = new int[5];
		
		//배열명이 곧 주소다. []안에 들어가는 숫자를 인덱스(첨자)라고 한다.
		System.out.println("score의 주소값 : " + score);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		//score[0]는 변수와 동일하다고 보면 된다.
		score[0] = 100;
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		score[0] = 20;		
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		//배열에 값을 대입시키고 출력한다.
		for(int i=0; i<score.length; i++) {
			score[i] = i + 1;
			System.out.println("score[" + i + "] = " + score[i]);
		}
	}

}
