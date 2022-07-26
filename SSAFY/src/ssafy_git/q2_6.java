package ssafy_git;

import java.util.Scanner;

public class q2_6 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		System.out.println("-----원소 10개 출력-----");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----원소 10개 중 짝수만 출력-----");		
		for(int i : arr) {
			if(i%2==0) {
				System.out.print(i + " ");
			}			
		}
		System.out.println();
		System.out.print("-----바꿀 위치 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		
		System.out.print("-----수 입력 : ");
		int data = sc.nextInt();		
		arr[idx] = data;
		
		System.out.println("-----원소 10개 출력-----");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		sc.close();


	}

}
