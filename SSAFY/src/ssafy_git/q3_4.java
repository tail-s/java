package ssafy_git;

import java.util.Scanner;

public class q3_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int a=0; a<x; a++) {
			
			int n = sc.nextInt();
			int[][] q = new int[n][n];
			int k_x = sc.nextInt()-1;
			int k_y = sc.nextInt()-1;
			int q_x = sc.nextInt()-1;
			int q_y = sc.nextInt()-1;
			int is_check = 0;
			
			int xidx = q_x;
			int yidx = q_y;
			
			int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
			int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};			
			
			for(int i=0; i<8; i++) {	
				for(int j=0; j<n; j++) {					
					if(xidx>=0 && xidx<n && yidx>=0 && yidx<n) {
						xidx += dr[i];
						yidx += dc[i];
						if(xidx==k_x && yidx==k_y) {
							is_check = 1;
							break;
						}						
					}						
				}									
			}			
			
			System.out.printf("#%d %d\n", a+1, is_check);				
							
		}
		sc.close();

	}

}
