package ssafy_git;

import java.util.Scanner;

public class q2_6 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		System.out.println("-----���� 10�� ���-----");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----���� 10�� �� ¦���� ���-----");		
		for(int i : arr) {
			if(i%2==0) {
				System.out.print(i + " ");
			}			
		}
		System.out.println();
		System.out.print("-----�ٲ� ��ġ �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		
		System.out.print("-----�� �Է� : ");
		int data = sc.nextInt();		
		arr[idx] = data;
		
		System.out.println("-----���� 10�� ���-----");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		sc.close();


	}

}
