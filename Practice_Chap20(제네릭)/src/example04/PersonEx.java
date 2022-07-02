package example04;

public class PersonEx {

	public static void main(String[] args) {
		//정상적인 코드
		//Person<Integer> p1 = Util.<Integer>changing(new Integer(100));
		
		//생략 가능
		Person<Integer> p1 = Util.changing(new Integer(100));
		int value = p1.getT();
		System.out.println("Person객체가 가지고 있는 값 : " + value);
		
		Person<String> p2 = Util.changing("김소진");
		String str = p2.getT();
		System.out.println("Person객체가 가지고 있는 값 : " + str);
		
	}

}
