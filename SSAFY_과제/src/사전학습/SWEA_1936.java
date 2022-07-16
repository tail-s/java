package 사전학습;

import java.util.Scanner;

public class SWEA_1936 {
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        
        if(a==1 && b==3) {System.out.print("A");}
        else if(a==3 && b==1) {System.out.print("B");}
        else if(a>b) {System.out.print("A");}
        else {System.out.print("B");}
        
		sc.close();
	}

}
