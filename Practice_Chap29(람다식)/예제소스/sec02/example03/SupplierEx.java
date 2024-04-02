package sec02.example03;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		//Supplier<T>�Լ��� �������̽��� �Ű����� ����, TŸ���� ���� ������ ���ش�.(������)
		//�Ͽ�, �Ʒ��� ���� �Լ��� �������̽��� �߻�޼����� get()�� ���ٽ����� ������ ��������,
		//���� ȣ�⵵ �� ����̴�.
		Supplier<String> supplier = () -> {			
			String str = "�ڹ� ���θ� �մϴ�.";
			return str;			
		};
		
		String str = supplier.get();
		System.out.println(str);		
		
		//IntSupplier�Լ��� �������̽� ���� �Ű����� ����, intŸ��(����)�� �ݵ�� ������ �ؾ��Ѵ�.
		//getAsInt()�� ���ٽ����� �����ؼ� ȣ���غ� ����̴�.
		IntSupplier intSupplier = () -> {
			int rand = (int)(Math.random()*45) + 1; 
			return rand;
		};
		
		int rand = intSupplier.getAsInt();
		System.out.println("IntSupplier�Լ��� �������̽��� �̿��� �ζ� ��ȣ : " + rand);
	}
}
