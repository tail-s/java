package sec02.example08;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateIsEqualEx {

	public static void main(String[] args) {
		
		Predicate<String> predicate = null;
		//Predicate<Object> predicate = null;
		boolean result = false;
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//���� ��
		System.out.println(Objects.equals(obj1, obj2));
		
		//Predicate.isEqual()�� ���� �޼���ν�, �� ���� ��ü�� ���� ���� ���Ѵ�.
		//�Ѵ�, null�̸� true�� �����°� �� �Ǿ��ϴ�.
		predicate = Predicate.isEqual(null);
		result = predicate.test(null);
		System.out.println("�� ��ü�� null�� �� : " + result);
				
		predicate = Predicate.isEqual(null);
		result = predicate.test("������");
		System.out.println("�������� null�� ���� �� : " + result);
				
		//�Ʒ��� �ڵ� �� ���� ��ü�� ���񱳰� �̷������.
		//Objects.equals("������", "������")�� ������� �����ϴ�.
		predicate = Predicate.isEqual("������");
		result = predicate.test("������");
		System.out.println("�������� �������� ���� �� : " + result);
		
		System.out.println(Objects.equals("������", "������"));
		
		//���� �ڵ���� ��뷮 �����͸� ���߿� �����ϰ� �����ϰ� null���� �ɷ����� �Լ��� �������̽���
		//�����ϰ� ����ϸ� ���� ���� �ڵ��� ���Ἲ�� ��������.		
	}
}
