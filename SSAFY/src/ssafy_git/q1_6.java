package ssafy_git;

import java.util.Scanner;

public class q1_6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int ans = sc.nextInt();	
		
		while(true) {			
			if(ans == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d\n", ans, i, ans * i);
			}
			System.out.print("���� ���� �Է� : ");
			ans = sc.nextInt();
		}
		
		sc.close();
		
		
		
	}

}
