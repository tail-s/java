package example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		//ArrayList는 제네릭 타입이다. 그래서 Warning이 뜸. -> 굳이 없애고 싶다면 Quick Access(우상단 검색창)에서 Error 입력 후 
		//Preference의 Generics 탭에 있는 항목ㅇ르 모두 ignore로 바꾸면 된다.
		
		ArrayList list = new ArrayList();		//기본적으로 10개의 방을 생성함.
		System.out.println("총 크기 : " + list.size());	//저장된 객체가 하나도 없기 때문에 0을 리턴함.
		
		//객체 추가하기
		list.add("111");	//boolean add(Object o) -> 순차적 추가
		list.add("222");
		list.add("333");
		list.add("444");
		list.add(333);		//list.add(new Integer(333));
		
		System.out.println("총 크기 : " + list.size());
		System.out.println("ArrayList의 주소 : " + list.hashCode());
		System.out.println("ArrayList의 있는 값 : " + list.toString());
		
		//0번째 인덱스에 "333"추가하기
		list.add(0, "333");
		System.out.println("ArrayList의 있는 값 : " + list.toString());
		
		//객체 삭제하기 -> 동일한 객체가 있다면 앞에서부터 검색하여 한 개만 삭제한다.
		list.remove("333");
		System.out.println("ArrayList의 있는 값 : " + list.toString());
		
		System.out.println(list.remove("333"));
		System.out.println("ArrayList의 있는 값 : " + list.toString());
		
		//저장도니 객체의 인덱스를 찾아오기(없으면 -1을 리턴함.)
		System.out.println("index = " + list.indexOf("333"));
		System.out.println("index = " + list.indexOf(333));
		
		//객체 전부 삭제하기
//		list.clear();
		
		//아래와 같이 삭제하면 객체가 남는다. 남는 이유(중요) -> i값은 증가하지만, remove 수행 시 값은 당겨와지기 때문. -> 뒤에서부터 삭제해야 함.
//		for(int i=0; i<list.size(); i++) {
//			list.remove(i);
//			System.out.println("ArrayList의 있는 값 : " + list.toString());
//		}
		
		for(int i=list.size()-1; i>=0; i--) {	//list.size()값과 index의 값 차이 고려
			list.remove(i);
		}
		
		System.out.println("ArrayList의 있는 값 : " + list.toString());

		
		
		

	}

}
