package example01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		//Arrays.asList()는 컬렉션이 아니라, 배열형식으로 된 컬렉션을 리턴한다.
		List<String> list1 = Arrays.asList("홍길동", "이준호", "김소진");
		
		//아래와 같이 객체 추가, 삭제를 하면 java.lang.UnsupportedOperationException이 발생한다.
		//asList()는 배열형식의 ㅋ러렉션을 리턴하기 때문이다.
//		list1.add("개그맨");
//		list1.remove(0);
		System.out.println(list1.toString());
		
		List<Integer> list2 = Arrays.asList(100, 200, 300);
		
		//리스트 컬렉션을 가지고 배열을 직접 만들고 있다.
//		Integer[] arr = (Integer[])list2.toArray(); //--> 에러발생 확인필요
//		int[] arr1 = new int[3];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr1[i] = arr[i];	
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr1[0] == 100) {
//				arr1[0] = 0;
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr1[i]);
//		}

	}

}
