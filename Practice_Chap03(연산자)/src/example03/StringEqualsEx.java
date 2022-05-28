package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// 참조형 타입의 ==, !=에 대해서 이해할 수 있다.
		
		String str1 = "IT";
//		String str2 = "JAVA";
		String str2 = "IT";	//힙에서 같은 리터럴이 있는지 찾아 존재하는 경우 주소를 공유
		String str3 = new String("IT");
		
		//참조형 타입에서 서로 ==은 주소를 비교하고 있음.
		//같은 리터럴의 경우는 같은 번지를 공유함.
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : " + result);
		
		result = (str1 == str3);
		System.out.println("str1 == str3 : " + result);
		

	}

}
