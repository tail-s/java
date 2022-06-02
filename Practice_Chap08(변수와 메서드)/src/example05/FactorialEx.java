package example05;

public class FactorialEx {

	public static void main(String[] args) {
		
		long result = FactorialEx.factorial(5);
		System.out.println("5!(팩토리얼)의 값 : " + result);

	}
	
	public static long factorial(int n) {
		
		long result = 0L;
		//n이 1일때 비로소 재귀호출이 더 이상 이루어지지 않는다. f(1) = 1 이니깐.
		if(n==1) {
			result = 1;
		}
		else {
			System.out.println("result값 : " + result + "\tn 값 : " + n);
			result = n * factorial(n-1); //재귀호출이 직접적으로 이루어지는 곳.
			System.out.println("result값 : " + result + "\tn 값 : " + n);
		}
		
		return result;
	}

}
