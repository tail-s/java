package ssafy_git;

public class q3_1 {

	public static void main(String[] args) {
		
		int[][] map = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int r = 1;
		int c = 1;
		
		int[] dr1 = {-1, 1, 0, 0};
		int[] dc1 = {0, 0, -1, 1};
		
		for(int i=0; i<4; i++) {
			int nr = r + dr1[i];
			int nc = c + dc1[i];
			System.out.print(map[nr][nc] + " ");
		}
		System.out.println();
		
		int[] dr2 = {-1, 0, 1, 0};
		int[] dc2 = {0, 1, 0, -1};
		
		r = 0;
		c = 1;
		
		for(int i=0; i<4; i++) {
			int nr = r + dr2[i];
			int nc = c + dc2[i];
			if(nr >= 0 && nr < map[0].length && nc >= 0 && nc < map[0].length) {
				System.out.print(map[nr][nc] + " ");
			}
		}
		System.out.println();


	}

}
