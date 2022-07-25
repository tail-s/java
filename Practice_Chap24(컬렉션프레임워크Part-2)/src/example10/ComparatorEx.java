package example10;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		
		//�����ڿ� ���� ������ �̸� ���ø� �� ���̴�.
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new AscendingComparator());
		
//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {
//			@Override
//			public int compare(Fruit o1, Fruit o2) {				
//				return o1.getPrice() - o2.getPrice();
//			}			
//		});
		
		
		//�� ������ ���ٸ� ClassCastException ���࿹�ܰ� �߻��� �� �ֱ⿡ ����ó���� �⺻������ ���ִ� ���� ����.
		try {
			treeSet.add(new Fruit("����", 4200));
			treeSet.add(new Fruit("����", 6500));
			treeSet.add(new Fruit("������", 3500));
			treeSet.add(new Fruit("�ٳ���", 3400));
			treeSet.add(new Fruit("�ڵ�", 2500));
			treeSet.add(new Fruit("ȣ��", 1000));
		} catch(Exception e) {
			System.out.println("���� ������ ����");
			e.printStackTrace();
		}
		System.out.println("�� ��ü �� : " + treeSet.size());		
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName() + " : " + fruit.getPrice());
		}		

	}

}
