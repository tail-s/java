package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSortEx {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(100);
		scores.add(-50);
		//기본적으로 오름차순 정렬이 이루어진다.
		System.out.println(scores);
		System.out.println("객체 수 : " + scores.size());
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println("내림차순 결과");
		System.out.println(descendingSet);
		System.out.println("객체 수 : " + descendingSet.size());
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		System.out.println("다시 오름차순 결과");
		System.out.println(descendingSet);
		System.out.println("객체 수 : " + descendingSet.size());
	}

}
