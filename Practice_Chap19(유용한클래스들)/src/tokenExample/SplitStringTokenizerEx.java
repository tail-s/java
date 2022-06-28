package tokenExample;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {

	public static void main(String[] args) {
		
		String data = "baby      cat dog a b c d e f g h i j k l m n o p q r s t u v w x y z";
		
		long start = System.nanoTime();		
		//split()은 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고 있다면, 공백도 하나의 토큰으로 인식한다.
		String[] result = data.split(" ");
		for(String str : result) {
			System.out.println(str);
		}
		
		long end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end-start) + "ns");
//		System.out.println("토큰 개수 : " + result.length);
		System.out.println("-------------------");
		
		start = System.nanoTime();
		//StringTokenizer는 공백을 토큰으로 인정하지 않는다.
		StringTokenizer sTokenizer = new StringTokenizer(data, " ");
		while(sTokenizer.hasMoreElements()) {
//			System.out.println("남은 토큰 수 : " + sTokenizer.countTokens()); 
			String str = sTokenizer.nextToken();
			System.out.println(str);			
		}
		end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end-start) + "ns");

	}

}
