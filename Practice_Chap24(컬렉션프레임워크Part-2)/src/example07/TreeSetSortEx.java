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
		//�⺻������ �������� ������ �̷������.
		System.out.println(scores);
		System.out.println("��ü �� : " + scores.size());
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println("�������� ���");
		System.out.println(descendingSet);
		System.out.println("��ü �� : " + descendingSet.size());
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		System.out.println("�ٽ� �������� ���");
		System.out.println(descendingSet);
		System.out.println("��ü �� : " + descendingSet.size());
	}

}
