package ssafy_git;

import java.util.Scanner;

public class q1_3 {
	
	public static void main(String[] args) {
		
//		int num = 1;
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("           ");
//			}
//			for(int j=5; j>i; j--) {
//				System.out.print(num++ + "           ");
//			}
//			System.out.println();
//		}
		
		int num = 1;		
		for(int x=2, y=-2; y<3; x--, y++) {
			for(int i=0; i<Math.abs(Math.abs(y)-2); i++) {
				System.out.print("  ");
			}
			for(int i=0; i<Math.abs(x-y)+1; i++) {
				System.out.print(num++ + " ");
			}
			for(int i=0; i<Math.abs(Math.abs(y)-2); i++) {
				System.out.print("  ");
			}
			System.out.println();		
		}		
		
//		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
//		System.out.println("1. 5판 3승");
//		System.out.println("2. 3판 2승");
//		System.out.println("3. 1판 1승");
//		System.out.print("번호를 입력하세요.");
//		
//		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
//		
//		int cnt = 0;		
//		if(choice == 1) {cnt = 5;}
//		else if(choice == 2) {cnt = 3;}
//		else if(choice == 3) {cnt = 1;}
//		else {System.out.println("잘못 입력하셨습니다.");}
//		
//		int win = 0;
//		int lose = 0;
//		
//		for(int i=0; i<cnt; i++) { 			
// 			
//			System.out.println("가위바위보 중 하나 입력 : ");
//			String select = sc.next();
//			
//			int com = (int)(Math.random()*3)+1;
//			if(com==1) {
//				System.out.println("이겼습니다!!!");
//				win++;
//				if((cnt == 5 && win > 2) || (cnt == 3 && win > 1) || (cnt == 1 && win == 1)) {
//	 				System.out.println("###사용자 승!!!");
//	 			}
//			}
//			else if(com==2) {
//				System.out.println("졌습니다!!!");
//				lose++;
//				if((cnt == 5 && lose > 2) || (cnt == 3 && lose > 1) || (cnt == 1 && lose == 1)) {
//	 				System.out.println("###컴퓨터 승!!!");
//	 			}
//			}
//			else {
//				System.out.println("비겼습니다!!!");
//				i--;
//			} 			
//			}		
//		
//		sc.close();

	}

}
