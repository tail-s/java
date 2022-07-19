package ssafy_git;

import java.util.Scanner;

public class q2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		boolean[] toggle = new boolean[m];
		int[] order = new int[n];
		
		for(int i=0; i<n; i++) {
			order[i] = sc.nextInt();
			for(int j=0; j<m; j++) {
				if((j+1)%order[i] == 0) {
					toggle[j] = !toggle[j];
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			if(toggle[i] == false) {
				System.out.print(0);
			}
			else {
				System.out.print(1);
			}
		}
		
		sc.close();


	}

}
