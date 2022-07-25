package example03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Ű�� String�̰�, ���� Integer�̴�. �� �� ��ü��� �Ϳ� �ָ�����.
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("������ : " + map.size());
		
		//map�� �ߺ��� Ű�� �������� �ʴ´�. ȫ�浿�� ���屺�� 2���� ������ �Ǿ�����, �������� ����� ������ ��ü�ȴ�. (�߿�)
		map.put("�����", 95);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		map.put("���屺", 1000);
		
		System.out.println("������ : " + map.size());
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println("���屺 : " + map.get("���屺"));
		System.out.println("-----------------------------------");
		
		//map�÷��ǿ� �ִ� key���� Set�迭�� �ٲ۴�.
		Set<String> set = map.keySet();
		System.out.println("keySet()�� �̿��ؼ� ����� ��");
		
		//�ݺ��� ���
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			//�ݺ��ڸ� ���� ���� Ű���� ������ ���� ���´�.
			int value = map.get(key);
			System.out.println(key + " : " + value);			
		}
		System.out.println("-----------------------------------");
		
		//Map�÷����� Map.Entry��ü�� ������� Set�迭�� �ٲ۴�.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("EntrySet()�� �̿��ؼ� ����� ��");
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();	//Ű ���� ��´�.
			int value = entry.getValue();	//���� ��´�.
			System.out.println(key + " : " + value);
		}
		System.out.println("-----------------------------------");
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� MapEntry �� : " + map.size());

	}

}
