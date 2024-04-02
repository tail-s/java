package sec02.example08;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		
		IntPredicate predicateA = x -> 
						{ return (x % 2) == 0; }; //2의 배수를 구해서 확인하는 람다식
		IntPredicate predicateB = x -> 
						{ return (x % 3) == 0; }; //3의 배수를 구해서 확인하는 람다식
						
		System.out.println("15는 2의 배수입니까 > " + predicateA.test(15));
		System.out.println("15는 3의 배수입니까 > " + predicateB.test(15));
		
		//and()는 둘다 true여야 true를 리턴한다.
		IntPredicate predicateAB = predicateA.and(predicateB);
		System.out.println("6은 2와 3의 공배수입니까 > " + predicateAB.test(6));
		
		//or()는 하나라도 true이면 true를 리턴한다.
		predicateAB = predicateA.or(predicateB);
		System.out.println("8은 2나 3의 배수입니까 > " + predicateAB.test(8));

		//negate()는 true이면 false를 리턴하고, false이면 true를 리턴한다.
		predicateAB = predicateA.negate();
		System.out.println("10은 홀수입니까? > " + predicateAB.test(10));
	}
}
