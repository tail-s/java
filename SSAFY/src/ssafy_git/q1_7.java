package ssafy_git;

import java.util.Calendar;
import java.util.Scanner;

public class q1_7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է��ϼ���.");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		Calendar date = Calendar.getInstance();
		date.set(2022, month, day);
		System.out.println(month + "�� " + day + "���� " + date.get(Calendar.DAY_OF_YEAR) + "��° ���Դϴ�.");
		
		sc.close();	
		
	}

}
