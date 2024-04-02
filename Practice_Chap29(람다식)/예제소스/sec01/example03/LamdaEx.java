package sec01.example03;

public class LamdaEx {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		int result = myInterface.method(100, 200);
		System.out.println("�Ű����� 2���� ���ϰ��� �ִ� ���ٽ��� �� : " + result);
			
		
		myInterface = (x, y) -> { return x + y; };
		result = myInterface.method(300, 200);
		System.out.println("�Ű����� 2���� ���ϰ��� �ִ� ���ٽ��� �� : " + result);
		
		//return���� �ϳ���� ���� �����ϴ�.
		myInterface = (x, y) ->  x + y; 
		result = myInterface.method(1000, 200);
		System.out.println("�Ű����� 2���� ���ϰ��� �ִ� ���ٽ��� �� : " + result);
		
		//�޼��� ȣ��� �Ű������� x, y�� �Ѿ��.
		myInterface = (x, y) ->  add(x, y); 
		result = myInterface.method(700, 200);
		System.out.println("add�޼��� ȣ�� �� ���ٽ��� �� : " + result);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
}
