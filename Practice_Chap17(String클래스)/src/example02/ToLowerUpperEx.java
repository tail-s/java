package example02;

public class ToLowerUpperEx {

	public static void main(String[] args) {
		
		String str1 = "Java Program";
		String str2 = "JAVA Program";
		
		System.out.println("대문자 : " + str1.toUpperCase());
		System.out.println("소문자 : " + str1.toLowerCase());
		
		System.out.println(str1.equals(str2));
		
		//대소문자를 구별하지 않고 비교를 하고자 한다면, equalsIgnoreCase()를 사용하면 된다.
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
