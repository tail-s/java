package example09;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<>();		
		//Person���� Comparable�������̽��� �������� ������ ���ܹ߻�.
		//����� ���� Ŭ������ TreeSet�� �����ϱ� ���ؼ��� �ݵ�� Comparable Ȥ�� Comparator �������̽��� �����ؾ� �Ѵ�.
		//TreeSet�� ����Ǹ鼭 �ڵ� ������ �̷������ �����̴�.
		treeSet.add(new Person("�����", 12));
		treeSet.add(new Person("ȫ�浿", 35));
		treeSet.add(new Person("�տ���", 23));
		treeSet.add(new Person("����", 19));
		treeSet.add(new Person("�ڿ���", 25));
		treeSet.add(new Person("������", 21));
		treeSet.add(new Person("�չμ�", 29));
		treeSet.add(new Person("������", 51));
		treeSet.add(new Person("�ڱ���", 61));
		
		System.out.println("�� ��ü �� : " + treeSet.size());
		System.out.println("=============================");
		
		//�ݺ��ڸ� ���� ���
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("�̸� : " + person.getName() + ", ���� : " + person.getAge());
		}		
		System.out.println("=============================");		
		System.out.println("�������� ����");
		NavigableSet<Person> descending = treeSet.descendingSet();
		Iterator<Person> diterator = descending.iterator();
		while(diterator.hasNext()) {
			Person person = diterator.next();
			System.out.println("�̸� : " + person.getName() + ", ���� : " + person.getAge());
		}
		
		

	}

}
