package pre_class;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2063 {
	
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
        int[] arr = new int[T];
        for(int test_case = 1; test_case <= T; test_case++)
		{
            arr[test_case - 1] = sc.nextInt();
		}
        sc.close();
        Arrays.sort(arr);        
        System.out.print(arr[T/2]);
            
	}

}
