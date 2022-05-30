package example01;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		int[] ball = new int[5];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = (int)(Math.random()*20)+1;
		}
		
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(ball));
//		for(int i=0; i<ball.length; i++) {
//			System.out.println(ball[i]);
//		}
		System.out.println();
		
		//버블소팅을 위해서는 반드시 1차원 배열이라도 더블루프가 필요하고 조건문 하나 들어와야 한다.		
//		for(int i=0; i<ball.length; i++) {
//			for(int j=0; j<ball.length-1; j++) {
//				//버블정렬
//				if(ball[j] > ball[j+1]) {
//					int temp = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = temp;
//				}
//			}
//		}
		
		
		Arrays.sort(ball);	//오름차순 정렬
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(ball));
		
//		System.out.println("정렬 후");
//		for(int i=0; i<ball.length; i++) {
//			System.out.println(ball[i]);
//		}

	}

}
