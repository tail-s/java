package sec02.example08;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		
		IntPredicate predicateA = x -> 
						{ return (x % 2) == 0; }; //2�� ����� ���ؼ� Ȯ���ϴ� ���ٽ�
		IntPredicate predicateB = x -> 
						{ return (x % 3) == 0; }; //3�� ����� ���ؼ� Ȯ���ϴ� ���ٽ�
						
		System.out.println("15�� 2�� ����Դϱ� > " + predicateA.test(15));
		System.out.println("15�� 3�� ����Դϱ� > " + predicateB.test(15));
		
		//and()�� �Ѵ� true���� true�� �����Ѵ�.
		IntPredicate predicateAB = predicateA.and(predicateB);
		System.out.println("6�� 2�� 3�� ������Դϱ� > " + predicateAB.test(6));
		
		//or()�� �ϳ��� true�̸� true�� �����Ѵ�.
		predicateAB = predicateA.or(predicateB);
		System.out.println("8�� 2�� 3�� ����Դϱ� > " + predicateAB.test(8));

		//negate()�� true�̸� false�� �����ϰ�, false�̸� true�� �����Ѵ�.
		predicateAB = predicateA.negate();
		System.out.println("10�� Ȧ���Դϱ�? > " + predicateAB.test(10));
	}
}
