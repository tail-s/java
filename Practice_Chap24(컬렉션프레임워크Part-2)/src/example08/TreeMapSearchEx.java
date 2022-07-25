package example08;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSearchEx {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//객체 추가
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
			System.out.println("단어 : " + str + " - 페이지 번호 : " + value);
		}
		
		System.out.println();
		//c부터 f까지만 검색하기, f이후에 값이 있는 단어는 검색이 안됨.
		System.out.println("[c ~ f] 사이의 단어 검색하기");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		Set<Map.Entry<String, Integer>> entrySet = rangeMap.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + " - 페이지 번호 : " + value);
		}
		
		System.out.println();
		//"d"를 포함하고 이후 값들만 가지는 Map.Entry객체를 얻어내기
		System.out.println("[d포함, 이후의 단어 검색하기]");
		NavigableMap<String, Integer> tailMap = treeMap.tailMap("d", true);
		
		//간단한 방법
		for(Map.Entry<String, Integer> entry : tailMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + " - 페이지 번호 : " + value);
		}
		
		System.out.println();
		//"g"를 포함하고 그 이전의 값들만 가지는 Map.Entry객체를 얻어내기
		System.out.println("[g포함, 이후의 단어 검색하기]");
		NavigableMap<String, Integer> headMap = treeMap.headMap("g", true);
		for(Map.Entry<String, Integer> entry : headMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + " - 페이지 번호 : " + value);
		}

	}

}
