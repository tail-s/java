package ssafy_git;

import java.util.Arrays;
import java.util.Scanner;

public class q2_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] data = new int[2][n];
		int[] target = new int[] {9, 10, 11};
		int sum = 0;
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<n; j++)
			data[i][j] = sc.nextInt();
		}	
		
		for(int i=0; i<n-4; i++) {
			if((data[1][i]-data[1][i+4])>=4000) {
				sum = 0;
				for(int j=0; j<4; j++) {					
					sum += data[0][i+j];	
					if(sum/4>=900) {				
						target[0] = i+5;
					}
				}
			}					
		}
		
		for(int i=0; i<n-3; i++) {
			if((data[1][i]-data[1][i+3])>=3000) {
				sum = 0;
				for(int j=0; j<3; j++) {					
					sum += data[0][i+j];	
					if(sum/3>=1000) {				
						target[1] = i+4;
					}
				}
			}					
		}
		
		for(int i=0; i<n-2; i++) {
			if((data[1][i]-data[1][i+2])>=2000) {
				sum = 0;
				for(int j=0; j<2; j++) {					
					sum += data[0][i+j];	
					if(sum/2>=1100) {				
						target[2] = i+3;
					}
				}
			}					
		}
		
		Arrays.sort(target);
		if(target[0] == 9) {
			System.out.println(-1);
		}
		else {
			System.out.println(target[0]);
		}
		
		sc.close();


	}

}
