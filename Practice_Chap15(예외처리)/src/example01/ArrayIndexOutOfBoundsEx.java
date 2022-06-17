package example01;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<6; i++) {
			arr[i] = 10;	//i가 5일 때 예외 발생 될거라고 예상.
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

	}

}
