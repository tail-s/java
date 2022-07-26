package ssafy_git;

import java.util.Scanner;

public class q1_6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int ans = sc.nextInt();	
		
		while(true) {			
			if(ans == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d\n", ans, i, ans * i);
			}
			System.out.print("다음 숫자 입력 : ");
			ans = sc.nextInt();
		}
		
		sc.close();
		
		
		
	}

}
