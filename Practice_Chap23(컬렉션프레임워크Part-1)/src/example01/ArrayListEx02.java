package example01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);	//자동 박싱
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		//subList()는 마지막 인덱스를 포함하지 않고 List타입으로 리턴한다.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));		
		print(list1, list2);
		
		//정렬하기
		System.out.println("정렬 후");	
		//Comparator를 따로 구현하기 귀찮고 간단한 정렬이 필요할 경우 상위 인터페이스인 Collections의 sort()를 이용. < Comparator가 이미 구현되어있음.
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//포함관계
		System.out.print("list1컬렉션에 list2컬렉션의 모든 요소가 들어있는가? --> ");
		System.out.println(list1.containsAll(list2));
		System.out.println();
		
		//삽입하기
		list2.add("B");			//배역 복사가 일어나지 않음
		list2.add("C");			//배역 복사가 일어나지 않음
		print(list1, list2);
		list2.add(3, "A");		//배열 복사가 일어남
		print(list1, list2);
		
		//대체하기
		list2.set(3, "AA");
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제하기
		System.out.println("포함된 객체 삭제하기\n");
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			print(list1, list2);
		}
		

	}
	
	//출력하는 메서드 작성
	public static void print(ArrayList<Integer> list1, ArrayList list2) {
		System.out.println("list1 : " + list1.toString());
		System.out.println("list2 : " + list2.toString());
		System.out.println();
		
	}

}
