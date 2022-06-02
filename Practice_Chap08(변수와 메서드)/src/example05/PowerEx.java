package example05;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int n = 0;
		long result = 0L;
		
		System.out.println("제곱까지의 합을 계산합니다!\n2의 3승 : 2의 1승 + 2의 2승 + 2의 3승 = 14\n제곱하고 싶은 수를 입력 : ");
		x = sc.nextInt();
		System.out.println("몇 승까지 더할까요? : ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			result += power(x, i);
		}
		System.out.printf("%d의 %d승까지의 합은 %d 입니다.", x, n, result);
		
		sc.close();

	}
	
	public static long power(int x, int n) {
		
		if(n==1) {
			return x;
		}
		else {
			return x * power(x, n-1);
		}
		
	}

}
