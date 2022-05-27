package Example01;

public class IncreDreEx {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		System.out.println("-----------------");
		System.out.println("x = " + (x++));	//후위 증가 연산
		System.out.println("x = " + x);
		System.out.println("y = " + (++y));	//전위증가연산
		System.out.println("y = " + y);
		System.out.println("-----------------");
		
		System.out.println("(x++) + (++y) = " + ((x++) + (++y)));

	}

}
