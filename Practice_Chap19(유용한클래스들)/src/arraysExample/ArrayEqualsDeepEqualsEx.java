package arraysExample;

import java.util.Arrays;
import java.util.Objects;

class Car{
	String model;
	
	public Car(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return this.model;
	}
}

public class ArrayEqualsDeepEqualsEx {

	public static void main(String[] args) {
		
		int[] ori = new int[] {1,2};
		int[] cloned = Arrays.copyOf(ori, ori.length);
		
		//얕은 비교(1차원 배열은 값까지 비교)
		System.out.println(Arrays.equals(ori, cloned));
		System.out.println(Objects.equals(ori, cloned));
		System.out.println(ori);
		System.out.println(cloned);
		
		System.out.println("-------------------------");
		
		Car[] c1 = new Car[2];
		c1[0] = new Car("그랜져");
		c1[1] = new Car("트럭");
		
		Car[] c2 = Arrays.copyOf(c1, c1.length);
		//얕은 비교(1차원 배열은 값까지 비교)
		System.out.println(Arrays.equals(c1, c2));
		System.out.println(Objects.equals(c1, c2));
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("-------------------------");
		
		//2차원 배열 생성
		int[][] original = new int[][] {
											{1, 2},
											{3, 4}
										};
		
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println(Arrays.equals(original, cloned1));
		System.out.println(Objects.equals(original, cloned1));
		
		System.out.println("original[0] : " + original[0]);
		System.out.println("cloned1[0] : " + cloned1[0]);
		
		System.out.println(original);
		System.out.println(cloned1);
		

	}

}
