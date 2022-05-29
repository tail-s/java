package example03;

import java.util.Scanner;

public class WhileEx02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;	//flag 변수
		int speed = 0;
		
		while(run) {
			
			System.out.println("-------------------------------------");
			System.out.println("   1. 증속   |   2. 감속   |   3. 중지   ");
			System.out.println("-------------------------------------");
			System.out.print("입력 : ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//speed++;
				System.out.println("현재 속도 : " + ++speed);
			}			
			else if(choice == 2) {
				//speed--;
				System.out.println("현재 속도 : " + --speed);
			}
			else if(choice == 3) {				
				//break;
				//System.exit(0);	//이자리에서 마무리되므로 아래 명령어들이 실행되지 않음.
				run = false;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println("프로그램 종료");
		}
		
		
		
		sc.close();
	}

}
