package ssafy_git;

import java.util.Scanner;

public class q3_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// n * n ũ�� �迭 ���� ( ���� )
		int[][] map = new int[n][n];
		
		// ���� ���� �Է� �ޱ�
		for ( int i=0 ; i<n ; i++ ) {
			for ( int j=0 ; j<n ; j++ ) {
				map[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		// �ִ밪 ����
		int maxDistance = 0;		
		for ( int i=0 ; i<n ; i++ ) {
			for ( int j=0 ; j<n ; j++ ) {				
				// ���� ��ġ�� ������ �˻�
				if ( map[i][j] == 1 ) {		
					
					// ���̸� ���� ��ġ�κ��� ���Ž�� �Ͽ� ���� �Ǵ� ���ο� �ִ� ���� �Ÿ� ����, �ִ밪 ����	
					
					// ������ 1���� �˻�
					for (int d = 1; j+d<n ; d++) {
						if ( map[i][j+d] == 1 ) {
							maxDistance = Math.max( maxDistance , d );
							break;
						}
					}
					
					// ������ 1���� �˻�
					for (int d = 1; j-d>=0 ; d++) {
						if ( map[i][j-d] == 1 ) {
							maxDistance = Math.max( maxDistance , d );
							break;
						}
					}
					
					// ������ 1���� �˻�
					for (int d = 1; i-d>=0 ; d++) {
						if ( map[i-d][j] == 1 ) {
							maxDistance = Math.max( maxDistance , d );
							break;
						}
					}
					
					// ������ 1���� �˻�
					for (int d = 1; i+d<n ; d++) {
						if ( map[i+d][j] == 1 ) {
							maxDistance = Math.max( maxDistance , d );
							break;
						}
					}
				}
			}
		}
		
		System.out.println(maxDistance);
	}

}
