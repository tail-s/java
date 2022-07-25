package example03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//키가 String이고, 값이 Integer이다. 둘 다 객체라는 것에 주목하자.
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("사이즈 : " + map.size());
		
		//map은 중복된 키를 저장하지 않는다. 홍길동과 동장군이 2번씩 저장이 되었지만, 마지막에 저장된 값으로 대체된다. (중요)
		map.put("김소진", 95);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		map.put("동장군", 1000);
		
		System.out.println("사이즈 : " + map.size());
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println("동장군 : " + map.get("동장군"));
		System.out.println("-----------------------------------");
		
		//map컬렉션에 있는 key값만 Set계열로 바꾼다.
		Set<String> set = map.keySet();
		System.out.println("keySet()을 이용해서 출력해 봄");
		
		//반복자 얻기
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			//반복자를 통해 얻은 키값을 가지고 값을 얻어온다.
			int value = map.get(key);
			System.out.println(key + " : " + value);			
		}
		System.out.println("-----------------------------------");
		
		//Map컬렉션의 Map.Entry객체를 대상으로 Set계열로 바꾼다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("EntrySet()을 이용해서 출력해 봄");
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();	//키 값을 얻는다.
			int value = entry.getValue();	//값을 얻는다.
			System.out.println(key + " : " + value);
		}
		System.out.println("-----------------------------------");
		
		//전체 객체 삭제
		map.clear();
		System.out.println("총 MapEntry 수 : " + map.size());

	}

}
