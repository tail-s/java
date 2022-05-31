package example02;

public class Calculator {
	
	//인스턴스 메서드
	//인스턴스의 특징 : new 연산자로 인스턴스를 생성해야만, 참조변수명.인스턴스메서드명 접근 가능.
	public int add(int x, int y) {
		int result = x + y;
		//double dresult = Calculator.divide(10.5, 11.7); 인스턴스 메서드에서 static 메서드를 호출할 수 있으나 그 반대는 불가.
		return result;
	}
	//인스턴스 메서드
	public int substract(int x, int y) {
		return x - y;
	}
	
	//static(정적)메서드
	//static의 특성 : 인스턴스 생성 없이 클래스명.정적메서드명으로 바로 접근 가능하다.
	public static long multiply(long x, long y ) {
		return x * y;
	}
	//static(정적)메서드
	public static double divide(double x, double y) {
		//static 메서드는 이미 메모리 상단에 올라가있고 인스턴스 생성없이 접근이 가능해야하는데, 아래 코드는 인스턴스가 생성되어야만 사용가능하기에 예외가 발생.
		//this.add(10,5); 인스턴스를 생성해야만 호출 가능하기 때문에 불가능 하다.
		return x / y;
	}
	

}
