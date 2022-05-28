package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// 참조형 타입의 ==, !=에 대해서 이해할 수 있다.
		
		//리터럴인 경우 같은 값이 있는지, 먼저 메모리공간(heap)에 있는지 확인하고, 있다면 같은 주소를 공유하게 되고, 없다면 새로운 곳에 인스턴스를 생성해준다.
		String str1 = "IT";
//		String str2 = "JAVA";
		String str2 = "IT";	//힙에서 같은 리터럴이 있는지 찾아 존재하는 경우 주소를 공유
		
		//new 연산자가 오면 무조건 새로운 인스턴스가 생성됨.
		String str3 = new String("IT");	//새로 만들어졌기 때문에 주소를 공유하지 않음
		
		//참조형 타입에서 서로 ==은 주소를 비교하고 있음.
		//같은 리터럴의 경우는 같은 번지를 공유함.
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : " + result);
		
		result = (str1 == str3);
		System.out.println("str1 == str3 : " + result);
		
		//String 클래스의 equals()는 주소와 상관없이 값이 같다면 무조건 true를 리턴함.
		result = str1.equals(str3);
		System.out.println("str1.equals(str3) : " + result);
		
		result = str1.equals(str2);
		System.out.println("str1.equals(str2) : " + result);
		

	}

}
