package example03;

import java.util.Scanner;

public class ThreeOperEx {

	public static void main(String[] args) {

		//삼항 연산자를 사용하는 방법을 익혀보자!
		Scanner sc = new Scanner(System.in);
		
		//println은 줄바꿈을 하고 print는 줄바꿈을 하지 않음.
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		//(조건식) ? 1 : 2
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println("당신의 등급 : " + grade);
		
		//삼항연산자를 중첩
		grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		System.out.println("당신의 등급 : " + grade);
		
		sc.close();

	}

}
