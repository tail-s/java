package ssafy_git;

import java.io.FileInputStream;
import java.util.Scanner;
/**
 * 체크메이트 판별하기
 */ 
public class q3_4_default {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int t = 1; t <= TC; t++){
			int N = sc.nextInt(); // 체스판 크기 변수
			int colKing = sc.nextInt(); // 킹의 가로(열) 좌표
			int rowKing = sc.nextInt(); // 킹의 세로(행) 좌표
			int colQueen = sc.nextInt(); // 퀸의 가로(열) 좌표
			int rowQueen = sc.nextInt(); // 퀸의 세로(행) 좌표
			int ans = 0; // 공격 가능 여부, 가능하면 1, 불가능하면 0
			
			// 가로 방향 공격 가능 여부 체크
			// 같은 행에 놓여 있다면 공격 가능
			if(rowKing == rowQueen) ans = 1;
			
			// 세로 방향 공격 가능 여부 체크
			// 같은 열에 놓여 있따면 공격 가능
			if(colKing == colQueen) ans = 1;
			
			// 대각선 방향 공격 가능 여부 체크
			// 우상향 방향: 행의 좌표와 열의 좌표를 더해서 같은 값이면
			// 같은 대각선상에 놓여 있음
			if(colKing + rowKing == colQueen + rowQueen) ans = 1;
			
			// 우하향 방향: 행의 좌표와 열의 좌표를 빼서 같은 값이면
			// 같은 대각선상에 놓여 있음
			if(colKing - rowKing == colQueen - rowQueen) ans = 1;
			

			System.out.println("#"+t+" "+ans);
		}
	}
}