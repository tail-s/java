package ssafy_git;

import java.util.Scanner;

public class q2_7 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] price = new int[n];
		
		for(int i=0; i<n; i++) {
			price[i] = sc.nextInt();
		}
		
		int[] rank = new int[n];
		
		int cnt;
		for(int i=0; i<n; i++) {
			cnt = 0;
			for(int j=0; j<n; j++) {
				if(price[i] < price[j]) {
					cnt++;
				}
			}			
			rank[i] = cnt+1;
			
		}

		for(int i : rank) {
			System.out.print(i + " ");
		}
		
		sc.close();

	}


}
