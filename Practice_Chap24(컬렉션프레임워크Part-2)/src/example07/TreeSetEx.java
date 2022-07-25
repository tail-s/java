package example07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		//TreeSet�� ����Ʈ���� ������� �̷���� �÷����̸�, Set�������̽��� SortedSet�������̽��� ������ Ŭ�����̴�.
		TreeSet<Integer> scores = new TreeSet<>();
		
		//��ü �߰�
		scores.add(87);	//�ڵ� �ڽ�
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		//���� ���� ������ ���غ���(����Ʈ���� ���� ���� ��)
		System.out.println("���� ���� ���� : " + scores.first());		
		//���� ���� ������ ���غ���(����Ʈ���� ���� ������ ��)
		System.out.println("���� ���� ���� : " + scores.last());
		
		System.out.println("==============================");	
		
		//�־��� ��ü�� ���ʿ� �ִ� ���� -- �־��� ��ü�� �������� �ʴ´�.
		score = scores.lower(95);
		System.out.println("95�� �Ʒ� ���� : " + score);		
		//�־��� ��ü�� ���ʿ� �ִ� ���� -- �־��� ��ü�� �����Ѵ�.
		score = scores.floor(95);
		System.out.println("95�� �Ʒ� ����(95���� ����) : " + score);
		System.out.println("������ : " + scores.size());		
		
		System.out.println("==============================");	
		
		//�־��� ��ü�� ������ �ִ� ���� -- �־��� ��ü�� �������� �ʴ´�.
		score = scores.higher(95);
		System.out.println("95�� ���� ���� : " + score);		
		//�־��� ��ü�� ���ʿ� �ִ� ���� -- �־��� ��ü�� �����Ѵ�.
		score = scores.ceiling(95);
		System.out.println("95�� ���� ����(95���� ����) : " + score);
		System.out.println("������ : " + scores.size());

		System.out.println("==============================");
		
//		while(!scores.isEmpty()) {
//			System.out.println("pollFirst()����");
//			//�� ���� ��ü���� �����´�. ��, ������ �� treeSet���� ���Ÿ� �Ѵ�.
//			score = scores.pollFirst();
//			System.out.println("������ ��ü : " + score);
//			System.out.println("���� ��ü �� : " + scores.size());
//		}

		System.out.println("==============================");
		
//		while(!scores.isEmpty()) {
//			System.out.println("pollLast()����");
//			//�� ������ ��ü���� �����´�. ��, ������ �� treeSet���� ���Ÿ� �Ѵ�.
//			score = scores.pollLast();
//			System.out.println("������ ��ü : " + score);
//			System.out.println("���� ��ü �� : " + scores.size());
//		}
		
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollFirst, pollLast �޼���� �ݺ��ڿ��� ���� ū �������� ��ü�� �����ϴ����� �������̴�.
			//�ݺ��ڿ����� ��������� remove()�� ȣ���ؾ� ���Ű� �ȴ�.
			int value = iterator.next();
//			iterator.remove();
			System.out.println(value + " ���� ��ü �� : " + scores.size());
		}
		

	}

}
