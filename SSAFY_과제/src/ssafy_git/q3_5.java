package ssafy_git;

import java.util.Scanner;

public class q3_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] map = new int[n][n];	
		int now_x = 0;
		int now_y = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]==0) {
					now_x = i;
					now_y = j;
				}
			}
		}
		
		int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
		int r;
		int c;
		
		int block = 0;
		int order_num = sc.nextInt();
		for(int i=0; i<order_num; i++) {
			String order = sc.next();
			switch(order) {
			case "U":
				if(map[now_x-1][now_y]==0) {
					now_x = now_x-1;
				}
				else if(map[now_x-1][now_y]==1) {
					block++;
					map[now_x-1][now_y] = 0;
					now_x = now_x-1;
				}
				else {
					map[now_x-1][now_y] -= 1;
				}
				break;
			case "D":
				if(map[now_x+1][now_y]==0) {
					now_x = now_x+1;
				}
				else if(map[now_x+1][now_y]==1) {
					block++;
					map[now_x+1][now_y] = 0;
					now_x = now_x+1;
				}
				else {
					map[now_x+1][now_y] -= 1;
				}
				break;
			case "L":
				if(map[now_x][now_y-1]==0) {
					now_y = now_y-1;
				}
				else if(map[now_x][now_y-1]==1) {
					block++;
					map[now_x][now_y-1] = 0;
					now_y = now_y-1;
				}
				else {
					map[now_x][now_y-1] -= 1;
				}
				break;
			case "R":
				if(map[now_x][now_y+1]==0) {
					now_y = now_y+1;
				}
				else if(map[now_x][now_y+1]==1) {
					block++;
					map[now_x][now_y+1] = 0;
					now_y = now_y+1;
				}
				else {
					map[now_x][now_y+1] -= 1;
				}
				break;
			case "X":
				for(int j=0; j<8; j++) {
					r = now_x + dr[j];
					c = now_y + dc[j];
					if(r>=0 && r<n && c>=0 && c<n && map[r][c]!=0) {
						map[r][c]=0;
						block++;
					}
				}
			}			
		}
		System.out.printf("광부 위치 : (%d,%d)\n", now_x, now_y);
		System.out.printf("부순 암석 개수 : %d", block);
		sc.close();
	}
}
