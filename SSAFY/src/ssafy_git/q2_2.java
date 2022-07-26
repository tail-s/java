package ssafy_git;

import java.util.Scanner;

public class q2_2 {

	public static void main(String[] args) {
		
		int[] num = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int cycle = sc.nextInt();
		
		String[] food = new String[cycle];
		for(int i=0; i<cycle; i++) {
			food[i] = sc.next();
		}
		
		for(int i=0; i<cycle; i++) {
			System.out.println(food[i]);
		}
		
		sc.close();


	}

}
