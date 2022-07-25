package example04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		
		//Ű ��ü�� ���ü��� �ߺ� �������� �ʴ´�.
		map.put(new Student(1001, "ȫ�浿"), 95);
		map.put(new Student(1001, "ȫ�浿"), 90);
		map.put(new Student(2001, "�����"), 100);
		map.put(new Student(3001, "������"), 58);
		
		System.out.println("�� Entry �� : " + map.size());
		//�ڿ� ����� ������ ��ü�ȴ�.
		System.out.println("ȫ�浿 : " + map.get(new Student(1001, "ȫ�浿")));
		
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			System.out.println("�й� : " + key.getSno() + "  �̸� : " + key.getName() + "  ���� : " + map.get(new Student(key.getSno(), key.getName())));
		}
		
	}

}
