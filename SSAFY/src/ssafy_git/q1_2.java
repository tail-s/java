package ssafy_git;

import java.util.Scanner;

public class q1_2 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		for(;;) {
//			System.out.print("�� �Է�>>");
//			int month = sc.nextInt();
//			
//			if(month == 12 || month < 3) {
//				System.out.printf("%d���� �ܿ��Դϴ�.\n", month);
//			}
//			else if(month < 6) {
//				System.out.printf("%d���� ���Դϴ�.\n", month);
//			}
//			else if(month < 9) {
//				System.out.printf("%d���� �����Դϴ�.\n", month);
//			}
//			else if(month < 12) {
//				System.out.printf("%d���� �����Դϴ�.\n", month);
//			}
//			else {
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//				break;
//			}
//		}
//		
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		boolean is_On = true;
		
		while(is_On) {
			
			System.out.print("�� �Է�>>");
			int month = sc.nextInt();
						
			switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.printf("%d���� �ܿ��Դϴ�.\n", month);
				continue;
			case 3:
			case 4:
			case 5:
				System.out.printf("%d���� ���Դϴ�.\n", month);
				continue;
			case 6:
			case 7:
			case 8:
				System.out.printf("%d���� �����Դϴ�.\n", month);
				continue;
			case 9:
			case 10:
			case 11:
				System.out.printf("%d���� �����Դϴ�.\n", month);
				continue;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				is_On = false;
			}
			
			sc.close();
			
			
		}
		
		

	}

}
