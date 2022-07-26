package ssafy_git;

import java.util.Scanner;

public class q3_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int a=0; a<x; a++) {
			
			int n = sc.nextInt();
			String[][] q = new String[n][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					q[i][j] = sc.next();
				}
			}
			
			int[] dr = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
			int[] dc = {-1, 0, 1, -1, 0, 1, -1, 0, 1};			
			int r;
			int c;
			int check;
			int floor;
			int max = 0;
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					check = 0;
					for(int k=0; k<9; k++) {
						r = i + dr[k];
						c = j + dc[k];						
						if(r>=0 && r<n && c>=0 && c<n) {
							if(q[r][c].equals("G")) {
								check++;
							}
						}						
					}
					if(check==0) {
						floor = 0;
						for(int k=0; k<n; k++) {
							if(q[i][k].equals("B")) {
								floor++;
							}
							if(q[k][j].equals("B")) {
								floor++;
							}
						}
						if(floor-1 > max) {
							max = floor-1;
						}						
					}					
				}
			}			
			System.out.printf("#%d %d", a+1, max);			
		}		
		sc.close();
	}
}
