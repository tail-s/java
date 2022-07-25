package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSearchEx {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		//알파벳의 유니코드에 따라 이진트리에 각각 좌측부터 저장된다.
//		treeSet.add("apple");
//		treeSet.add("f");
//		treeSet.add("fe");
//		treeSet.add("forever");
//		treeSet.add("description");
//		treeSet.add("ever");
//		treeSet.add("zoo");
//		treeSet.add("guess");
//		treeSet.add("cherry");
//		System.out.println(treeSet);
		treeSet.add("가라");
		treeSet.add("나가");
		treeSet.add("다시는");
		treeSet.add("라");
		treeSet.add("라면");
		treeSet.add("마");
		treeSet.add("바");
		treeSet.add("사");
		System.out.println(treeSet);
		
		//"f" 까지만 출력. "f"이후의 사전순 단어인 "fe"나 "forever"는 출력되지 않음.
//		System.out.println("[c ~ f] 사이의 단어를 검색해보기");		
//		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
//		System.out.println(rangeSet);
		
		//마찬가지로 "라"는 출력되나, "라면"은 출력되지 않는다.
		System.out.println("[가 ~ 라] 사이의 단어를 검색해보기");		
		NavigableSet<String> rangeSet2 = treeSet.subSet("가", true, "라", true);
		System.out.println(rangeSet2);


	}

}
