package sec02.example09;

import java.util.function.BinaryOperator;

public class MinByMaxByEx {

	public static void main(String[] args) {
		
		BinaryOperator<Fruit> binaryOperator = null;
		Fruit fruit = null;		
		
		//BinaryOperator�� minBy()���� �޼���� �� ���� ��ü�� ������ ���� ������ ��ü�� �����Ѵ�.
		//�� ������ �Ǵ� �ʵ��� ����� ���α׷����� ���̴�.
		//�ƿ﷯, minBy�� Comparator<T>�� �������̽� Ÿ���� �Ű������� ������ �ֱ� ������
		//�߻�޼����� int compare(T o1, T 02); �������ϴ� ���ٽ��� �ü��� �ִ�.
		binaryOperator = BinaryOperator.minBy( (f1, f2) -> {	
//			if( f1.getPrice() < f2.getPrice())
//				return -1;
//			else if(f1.getPrice() == f2.getPrice())
//				return 0;
//			else
//				return 1;
			return Integer.compare(f1.getPrice(), f2.getPrice());
		});
		
		fruit = binaryOperator.apply(new Fruit("Ȳ��", 5000), new Fruit("������", 4000));
		System.out.println(fruit.getName());		
				
		binaryOperator = BinaryOperator.maxBy( (f1, f2) -> {	
//			if( f1.getPrice() < f2.getPrice())
//				return -1;
//			else if(f1.getPrice() == f2.getPrice())
//				return 0;
//			else
//				return 1;
			return Integer.compare(f1.getPrice(), f2.getPrice());
		});
		
		fruit = binaryOperator.apply(new Fruit("Ȳ��", 5000), new Fruit("������", 4000));
		System.out.println(fruit.getName());		
	}
}