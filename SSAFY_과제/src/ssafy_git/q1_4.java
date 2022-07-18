package ssafy_git;

import java.util.Scanner;

public class q1_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("60갑자를 입력하세요 : ");
			String ans = sc.next();
			if(ans.equals("종료")) {
				break;
			}
			
			String gan = ans.substring(0, 1);
			String ji = ans.substring(1);
			
			int x = 0;
			int y = 0;
			
			if(gan.equals("갑"))
				x = 4;
			else if(gan.equals("을"))
				x = 5;
			else if(gan.equals("병"))
				x = 6;
			else if(gan.equals("정"))
				x = 7;
			else if(gan.equals("무"))
				x = 8;
			else if(gan.equals("기"))
				x = 9;
			else if(gan.equals("경"))
				x = 0;
			else if(gan.equals("신"))
				x = 1;
			else if(gan.equals("임"))
				x = 2;
			else if(gan.equals("계"))
				x = 3;
			else
				System.out.println("잘못된 입력");
			
			if(ji.equals("자"))
				y = 4;
			else if(ji.equals("축"))
				y = 5;
			else if(ji.equals("인"))
				y = 6;
			else if(ji.equals("묘"))
				y = 7;
			else if(ji.equals("진"))
				y = 8;
			else if(ji.equals("사"))
				y = 9;
			else if(ji.equals("오"))
				y = 10;
			else if(ji.equals("미"))
				y = 11;
			else if(ji.equals("신"))
				y = 0;
			else if(ji.equals("유"))
				y = 1;
			else if(ji.equals("술"))
				y = 2;
			else if(ji.equals("해"))
				y = 3;
			else
				System.out.println("잘못된 입력");
			
			
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
