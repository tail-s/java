package example08;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSearchEx {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//��ü �߰�
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("f", 64);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 100);
		treeMap.put("guess", 80);
		treeMap.put("banana", 90);
		treeMap.put("kdb", 80);
		treeMap.put("cherry", 15);
		
		for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("�ܾ� : " + str + " - ������ ��ȣ : " + value);
		}
		
		System.out.println();
		//c���� f������ �˻��ϱ�, f���Ŀ� ���� �ִ� �ܾ�� �˻��� �ȵ�.
		System.out.println("[c ~ f] ������ �ܾ� �˻��ϱ�");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		Set<Map.Entry<String, Integer>> entrySet = rangeMap.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("�ܾ� : " + str + " - ������ ��ȣ : " + value);
		}
		
		System.out.println();
		//"d"�� �����ϰ� ���� ���鸸 ������ Map.Entry��ü�� ����
		System.out.println("[d����, ������ �ܾ� �˻��ϱ�]");
		NavigableMap<String, Integer> tailMap = treeMap.tailMap("d", true);
		
		//������ ���
		for(Map.Entry<String, Integer> entry : tailMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("�ܾ� : " + str + " - ������ ��ȣ : " + value);
		}
		
		System.out.println();
		//"g"�� �����ϰ� �� ������ ���鸸 ������ Map.Entry��ü�� ����
		System.out.println("[g����, ������ �ܾ� �˻��ϱ�]");
		NavigableMap<String, Integer> headMap = treeMap.headMap("g", true);
		for(Map.Entry<String, Integer> entry : headMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("�ܾ� : " + str + " - ������ ��ȣ : " + value);
		}

	}

}
