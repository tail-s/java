package sec02.example07;

import java.util.function.Function;

public class FunctionAndThenEx {

	public static void main(String[] args) {
		
		//Function<T,R>�Լ����������̽��� T�� �Ű������� �ְ� R�� �����Ͽ� �������ش�.
		//apply()�߻�޼��带 ������ �ִ�.
		//����� andThen()�� ���ؼ� People�� �ָ� String�� ��� ����� ���´�.
		//���⼭ Address�� functionA�� ���ϰ����� �׸��� functionB�� �Ű������� ���Ǿ�����
		//������� country�� �������� �߽��� ������ �ϴ� ���� �� ���� �ִ�.
		Function<People, Address> functionA = p -> { return p.getAddress(); };
		Function<Address, String> functionB = a -> { return a.getCountry(); };
		Function<People, String> functionAB = functionA.andThen(functionB);

		String country = functionAB.apply(
				new People("������", "Shin", new Address("�ѱ�", "�뱸")));		
		System.out.println("���� : " + country);
		
		functionAB = functionB.compose(functionA);		
		country = functionAB.apply(
				new People("������", "Shin", new Address("�ѱ�", "�뱸")));		
		System.out.println("���� : " + country);		
	}
}
