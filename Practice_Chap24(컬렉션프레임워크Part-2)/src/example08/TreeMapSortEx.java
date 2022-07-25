package example08;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "ȫ�浿");
		scores.put(98, "�����");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");
		
		//�����ϱ�(Ű�� ������ ������ �Ǵ� ���� �ָ�����.)
		//��������
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		//���������� �� decendingMap�� entrySet() ���ؼ� Set���� �����ϰ� �ִ�.
		Set<Map.Entry<Integer, String>> decendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : decendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : " + value + " - �� : " + str);
		}
		
		System.out.println("====================================");
		
		//�ٽ� �������� �����ϱ�
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : " + value + " - �� : " + str);
		}
		
		System.out.println("====================================");
		
		//Ű�� �����ͼ� �ݺ��ڷ� ����غ���
		NavigableSet<Integer> keySet = scores.descendingKeySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			System.out.println("Ű : " + value + " - �� : " + str);
		}
		
	}

}
