package example01;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			//중첩 if문(무제한적으로 중첩 if문은 들어갈 수 있다. 보통 중첩 if문은 2개를 초과하지 않도록 하는것이 가독성면에서 좋다.
			if(score >= 95) {
				System.out.println("당신은 A+ 등급입니다.");
			}
			else {
				System.out.println("당신은 A0 등급입니다.");
			}
		}
		else if(score >= 80) {
			if(score >= 85) {
				System.out.println("당신은 B+ 등급입니다.");
			}
			else {
				System.out.println("당신은 B0 등급입니다.");
			}
		}		
		else if(score >= 70) {
			if(score >= 75) {
				System.out.println("당신은 C+ 등급입니다.");
			}
			else {
				System.out.println("당신은 C0 등급입니다.");
			}
		}
		else {
			System.out.println("당신은 D+ 등급입니다.");
		}

	}

}
