package sec01.example02;

public class LamdaEx {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (x) -> {
			int result = x * 10;
			System.out.println("�Ű����� x���� ������ ���ٽ��� ������ �޼����� �� : " + result);
		};
		//���⼭ 500�� �Ű������̴�. �Ͽ�, ���ٽ��� �Ű������� x�� ������ �Ǿ�����.
		myInterface.method(500);
		
		//�Ű������� �ϳ��̱� ������ ()�� ������ �����ϴ�.
		myInterface = x -> 			
			System.out.println("�Ű����� x���� ������ ���ٽ��� ������ �޼����� �� : " + (x * 10));
		
		myInterface.method(500);		
	}
}
