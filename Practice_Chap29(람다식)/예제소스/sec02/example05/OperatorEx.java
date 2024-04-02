package sec02.example05;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
	
	public static int[] scores = { 15, 55, 10, 100, 92, 35, 87};
	
	public static void main(String[] args) {
		
		IntBinaryOperator operatorMax = (a, b) -> {			
//			if(a >= b)
//				return a;
//			else
//				return b;			
			return Math.max(a, b);			
		};
		int max = maxOrMin(operatorMax);
		System.out.println("�ִ밪 : " + max);

		IntBinaryOperator operatorMin = (a, b) -> {
			return Math.min(a, b);
		};
		
		int min = maxOrMin(operatorMin);
		System.out.println("�ּҰ� : " + min);		
	}
	
	public static int maxOrMin(IntBinaryOperator operator) {
		
		int result = scores[0];
		for(int score : scores) {
			//2���� ���� �����Ͽ� �ϳ��� ���� �����ϴ� applyAsInt(int, int)�߻�޼��带 ȣ���ϴµ�,
			//main()���� ������ �κ��� ����Ǿ�, a�� result, b�� score�̴�.
			result = operator.applyAsInt(result, score);
		}
		return result;	
	}
}