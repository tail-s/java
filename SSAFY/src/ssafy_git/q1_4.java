package ssafy_git;

import java.util.Scanner;

public class q1_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("60���ڸ� �Է��ϼ��� : ");
			String ans = sc.next();
			if(ans.equals("����")) {
				break;
			}
			
			String gan = ans.substring(0, 1);
			String ji = ans.substring(1);
			
			int x = 0;
			int y = 0;
			
			if(gan.equals("��"))
				x = 4;
			else if(gan.equals("��"))
				x = 5;
			else if(gan.equals("��"))
				x = 6;
			else if(gan.equals("��"))
				x = 7;
			else if(gan.equals("��"))
				x = 8;
			else if(gan.equals("��"))
				x = 9;
			else if(gan.equals("��"))
				x = 0;
			else if(gan.equals("��"))
				x = 1;
			else if(gan.equals("��"))
				x = 2;
			else if(gan.equals("��"))
				x = 3;
			else
				System.out.println("�߸��� �Է�");
			
			if(ji.equals("��"))
				y = 4;
			else if(ji.equals("��"))
				y = 5;
			else if(ji.equals("��"))
				y = 6;
			else if(ji.equals("��"))
				y = 7;
			else if(ji.equals("��"))
				y = 8;
			else if(ji.equals("��"))
				y = 9;
			else if(ji.equals("��"))
				y = 10;
			else if(ji.equals("��"))
				y = 11;
			else if(ji.equals("��"))
				y = 0;
			else if(ji.equals("��"))
				y = 1;
			else if(ji.equals("��"))
				y = 2;
			else if(ji.equals("��"))
				y = 3;
			else
				System.out.println("�߸��� �Է�");
			
			
			for(int i=1800; i<=2100; i++) {
				if(i%10==x && i%12==y) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		
		sc.close();		

	}

}
