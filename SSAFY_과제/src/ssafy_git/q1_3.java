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
		
//		System.out.println("���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
//		System.out.println("1. 5�� 3��");
//		System.out.println("2. 3�� 2��");
//		System.out.println("3. 1�� 1��");
//		System.out.print("��ȣ�� �Է��ϼ���.");
//		
//		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
//		
//		int cnt = 0;		
//		if(choice == 1) {cnt = 5;}
//		else if(choice == 2) {cnt = 3;}
//		else if(choice == 3) {cnt = 1;}
//		else {System.out.println("�߸� �Է��ϼ̽��ϴ�.");}
//		
//		int win = 0;
//		int lose = 0;
//		
//		for(int i=0; i<cnt; i++) { 			
// 			
//			System.out.println("���������� �� �ϳ� �Է� : ");
//			String select = sc.next();
//			
//			int com = (int)(Math.random()*3)+1;
//			if(com==1) {
//				System.out.println("�̰���ϴ�!!!");
//				win++;
//				if((cnt == 5 && win > 2) || (cnt == 3 && win > 1) || (cnt == 1 && win == 1)) {
//	 				System.out.println("###����� ��!!!");
//	 			}
//			}
//			else if(com==2) {
//				System.out.println("�����ϴ�!!!");
//				lose++;
//				if((cnt == 5 && lose > 2) || (cnt == 3 && lose > 1) || (cnt == 1 && lose == 1)) {
//	 				System.out.println("###��ǻ�� ��!!!");
//	 			}
//			}
//			else {
//				System.out.println("�����ϴ�!!!");
//				i--;
//			} 			
//			}		
//		
//		sc.close();

	}

}
