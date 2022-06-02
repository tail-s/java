package example02;

class A {
	int data1 = 10;
	int data2 = 30;
}

public class Accumulator {
	
	//add라는 메서드명으로 오버로딩하고 있다.
	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		return x + y;
	}
	
	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x + y;
	}
	
	public long add(long x, int y) {
		System.out.println("add(long x, int y)");
		return x + y;
	}
	
	public double add(double x, double y) {
		System.out.println("add(double x, double y)");
		return x + y;
	}
	//참조형 변수를 받아서 오버로딩 하는 케이스
	public long add(int[] arr) {
		System.out.println("add(int[] arr)");
		//배열의 주소를 받아서 그 값의 총합을 구하여 리턴하고 있는 메서드
		long sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	//클래스를 매개변수로 받아서 오버로딩을 하는 케이스
	public int add(A a) {
		System.out.println("add(A a)");
		return a.data1 + a.data2;
	}


}
