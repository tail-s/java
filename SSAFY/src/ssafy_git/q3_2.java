package ssafy_git;

import java.util.Scanner;

public class q3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] farm = new int[size][size];
		int sum;
		int ans = 0;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				farm[i][j] = sc.nextInt();
			}
		}
		
		int[] dr = {-1, 1, 0, 0, 0};
		int[] dc = {0, 0, -1, 1, 0};
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				sum = 0;
				for(int k=0; k<5; k++) {
					int r = i + dr[k];
					int c = j + dc[k];
					if(r>=0 && r<size && c>=0 && c<size) {
						sum += farm[r][c];
					}
					if(sum>ans) {
						ans = sum;
					}
				}
			}
		}
		
		System.out.println(ans);
		
		sc.close();


	}

}
