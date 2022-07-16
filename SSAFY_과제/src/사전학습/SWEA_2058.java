package 사전학습;

import java.util.Scanner;

public class SWEA_2058 {
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int sum = 0;
        
		while(num>0) {
            sum += num % 10;
            num /= 10;
        }        
        System.out.print(sum);
	}

}
