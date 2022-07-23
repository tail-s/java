package example01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		System.out.println("사이즈 : " + set.size()); 
		
		//Set계열은 중복 저장이 되지 않는다. 아울러 순서 유지를 하지도 않는다.
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("iBATIS");
		set.add("Java");
		//Set계열에는 null값도 저장 가능하지만, 오직 1개만 저장된다.
//		set.add(null);
//		set.add(null);		
		
		System.out.println("사이즈 : " + set.size()); 
		
		//반복자를 set을 통해서 얻는다.
		Iterator<String> iterator = set.iterator();
		//가져올게 있으면 true, 없으면 false를 리턴한다.
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			//반복자를 통해서 가져오면 Set에서 객체들을 제거하지 않는다.
			System.out.println("사이즈 : " + set.size());
		}
		
		System.out.println("-----------------------");
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("사이즈 : " + set.size());
		System.out.println("-----------------------");
		
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("객체가 없습니다.");
		}
		else
			System.out.println("객체가 존재합니다.");
	}

}
