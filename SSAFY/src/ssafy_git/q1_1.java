package ssafy_git;

import java.util.Scanner;

public class q1_1 {

	public static void main(String[] args) {
		
		System.out.print("숫자 입력 >> ");

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int ans = 0;

		for(int i=1; i<=value; i++) {
			if(i%2==0) {
				ans += i;
			}
		}

		System.out.printf("1부터 %d까지 수 중 짝수의 합 = %d", value, ans);
		
		sc.close();

	}

}
