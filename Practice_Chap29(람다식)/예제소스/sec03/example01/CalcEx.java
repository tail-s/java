package sec03.example01;

import java.util.function.IntBinaryOperator;

public class CalcEx {

	public static void main(String[] args) {
		
		//IntBinaryOperator�Լ��� �������̽��� 2���� int�� �Ű������� �޾� �����Ͽ�
		//�ϳ��� int������ �����ϴ� int applyAsInt(int, int)�߻�޼��带 ������ �ִ�.
		//�Ͽ�, ���ٽ����� ������ �ϸ� �Ʒ��� ����.
		IntBinaryOperator intBinaryOperator = null;
		
		//���ٽ� ����
		intBinaryOperator = (x, y) -> { return Calc.sAddMethod(x, y); };
		System.out.println("���ٽ� : " + intBinaryOperator.applyAsInt(100, 200));
		
		//�޼��� ���� ����
		//���ŷӰ� ���ٽ����� ������ �Ҷ� �Ű������� 2�� �����־�� �Ѵٴ� ���� ���̱� ���ؼ�
		//�Ʒ��� ���� �޼��� ������ �ڵ��� �ϸ� �ڵ��� ���� ���� �� �ִٶ�� �������� ��ȵ� ����̴�.
		intBinaryOperator = Calc :: sAddMethod;
		System.out.println("�޼��� ���� : " + intBinaryOperator.applyAsInt(100, 200));
				
		//���ٽ� ����
		intBinaryOperator = (x, y) -> { return Calc.sMulMethod(x, y); };
		System.out.println("���ٽ� : " + intBinaryOperator.applyAsInt(100, 200));

		intBinaryOperator = Calc :: sMulMethod;
		System.out.println("�޼��� ���� : " + intBinaryOperator.applyAsInt(100, 200));
		
		Calc calc = new Calc();
		
		System.out.println("===========================================");
		
		//���ٽ� ����
		intBinaryOperator = (x, y) -> { return calc.iMethod(100, 200); };
		System.out.println("���ٽ� : " + intBinaryOperator.applyAsInt(100, 200));
		
		//�޼��� ����
		intBinaryOperator = calc :: iMethod;
		System.out.println("�޼��� ���� : " + intBinaryOperator.applyAsInt(100, 200));	
		
//		1.������ �޼����� �Ű������� ���ϰ��� ���������� �ϴ� ���� ��Ȯ�ϰ� �ľ��� �Ѵ�.
//		2.�ľ��� ���� ���� ������ �Լ��� �������̽��� ã�´�.
//		3.�� ���� �������� �ν��Ͻ��޼��������� Ȯ���ؼ� �޼��带 �����ϴ� ������ �͸�����ü�� �����.

//		��� : �޼��� ���� ���õ� �͸�����ü�� ����� ���̹Ƿ�, �Լ��� �������̽��� ������ �����ϴٴ� ���̰�,
//		�ƿ﷯, �Ű������� ���ϰ��� �´� ���� Ÿ�� Ÿ������ �����Ͽ� �����ؾ� �Ǵ� ���̴�.
//		�׷��� �Ǹ� �ڵ尡 �پ��� �����͵� ������ ó���� ����������.	
	}
}