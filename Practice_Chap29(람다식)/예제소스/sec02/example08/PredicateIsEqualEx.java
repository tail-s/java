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
		
		//번지 비교
		System.out.println(Objects.equals(obj1, obj2));
		
		//Predicate.isEqual()는 정적 메서드로써, 두 개의 객체의 번지 값을 비교한다.
		//둘다, null이면 true가 나오는게 좀 의아하다.
		predicate = Predicate.isEqual(null);
		result = predicate.test(null);
		System.out.println("두 객체가 null일 때 : " + result);
				
		predicate = Predicate.isEqual(null);
		result = predicate.test("신은혁");
		System.out.println("신은혁과 null을 비교할 때 : " + result);
				
		//아래의 코드 두 개의 객체는 값비교가 이루어진다.
		//Objects.equals("신은혁", "신은혁")의 결과값과 동일하다.
		predicate = Predicate.isEqual("신은혁");
		result = predicate.test("신은혁");
		System.out.println("신은혁과 신은혁을 비교할 때 : " + result);
		
		System.out.println(Objects.equals("신은혁", "신은혁"));
		
		//위의 코드들은 대용량 데이터를 나중에 매핑하고 정렬하고 null값은 걸러내고 함수적 인터페이스를
		//선언하고 사용하면 편리한 점과 코드의 간결성이 좋아진다.		
	}
}
