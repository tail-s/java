package example02;

public class TryCatchEx {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			//System.out.println(2/0);	//ArithmeticException �߻�
			System.out.println(5);		//��� �ȵ�
		}catch (ArithmeticException e) {
			System.out.println(6);
		}
		System.out.println(7);

	}

}
