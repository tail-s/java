package example03;

public class ReverseEx {

	public static void main(String[] args) {
		
		String str = "안녕하세요";
		String reverse = "";
		int count = 0;
		
		String r = reverseString(str);
		System.out.println("resverseString() 호출 후 : " + r);
		
		System.out.println("-------------------------");
		
		count = str.length();
		System.out.println("문자열 길이 : " + count);
		
		//구버전
		for(int i=0; i<count; i++) {
			reverse += str.charAt(count - (i+1));
			System.out.println(reverse);
			System.out.println(reverse.hashCode());
		}
		System.out.println("역순 출력 : " + reverse);

	}
	
	//신버전
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
