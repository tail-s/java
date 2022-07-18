package ssafy_git;

import java.util.Scanner;

public class q1_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int noanswer = Math.abs(a - b);
		
		int near = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			int x = Math.abs(arr[i] - b);
			if(min > x) {
				min = x;
				near = arr[i];
			}			
		}
		
		if(min > noanswer) {
			if(noanswer >= 600) {
				System.out.println(-1);
			}
			System.out.println(noanswer+1);
		}
		else {
			System.out.println(min+1);
		}
		
		sc.close();
		

	}

}
