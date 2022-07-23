package ssafy_git;

import java.util.Scanner;

public class q3_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] map = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
		int r = 0;
		int c = 0;
		int cnt = 0;
		int max = 0;
		int x = 0;
		int y = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				cnt = 0;
				for(int k=0; k<8; k++) {
					r = i;
					c = j;
					while(r+dr[k]>=0 && r+dr[k]<n && c+dc[k]>=0 && c+dc[k]<n) {
						if(map[r][c]==1) {
							if(map[r+dr[k]][c+dc[k]]==1) {
								break;
							}
							//test
							else if(!(r+dr[k]+dr[k]>=0 && r+dr[k]+dr[k]<n && c+dc[k]+dc[k]>=0 && c+dc[k]+dc[k]<n) && map[r+dr[k]][c+dc[k]]==0) {
								cnt++;
								break;
							}
							//test	
						}
						else if(map[r][c]==0) {
							if(r==i && c==j) {
								r += dr[k];
								c += dc[k];
								continue;
							}								
							cnt++;
							//test
							if(!(r+dr[k]+dr[k]>=0 && r+dr[k]+dr[k]<n && c+dc[k]+dc[k]>=0 && c+dc[k]+dc[k]<n) && map[r+dr[k]][c+dc[k]]==0) {
								cnt++;
								break;
							}
							//test
						}						
						r += dr[k];
						c += dc[k];
					}
				}
				
				if(map[i][j]==0) {
					cnt++;
				}
				if(cnt>max) {
					max = cnt;
					x = i;
					y = j;
				}
			}
		}
		System.out.println(max);
		System.out.printf("%d,%d", x, y);

	}

}
