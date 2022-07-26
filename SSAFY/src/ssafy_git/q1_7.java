package ssafy_git;

import java.util.Calendar;
import java.util.Scanner;

public class q1_7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월과 일을 입력하세요.");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		Calendar date = Calendar.getInstance();
		date.set(2022, month, day);
		System.out.println(month + "월 " + day + "일은 " + date.get(Calendar.DAY_OF_YEAR) + "번째 날입니다.");
		
		sc.close();	
		
	}

}
