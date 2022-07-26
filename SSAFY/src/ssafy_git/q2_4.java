package ssafy_git;

import java.util.Arrays;
import java.util.Scanner;

public class q2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		int[] arr = new int[test_case];
		
		for(int i=0; i<test_case; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = arr[test_case-1];
		Arrays.sort(arr);
		int max = arr[test_case-1];
		
		int cnt = 0;
		int ans = 0;
		for(int i=0; i<test_case; i++) {
			if(arr[i] < target) {
				ans = max - arr[i];
				cnt ++;
			}
		}
		if(cnt==1) {
			System.out.println(ans);
		}
		else {
			System.out.println(-1);
		}
		
		sc.close(); 


	}

}
