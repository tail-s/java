package example02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<Member> set = new HashSet<>();
		
		//new를 사용했기에 아래 4개의 Member객체는 서로 다른 주소를 가지고 있다. 하지만, Member클래스에서 Hashcode()를 재정의했기에 동등객체로 인식한다.
		//하여, Set은 중복저장을 하지 않는다.
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 25));
		set.add(new Member("홍길동", 17));
		
		System.out.println("총 객체 수 : " + set.size());
		
		//반복자
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member.getName() + " : " + member.getAge());
		}

	}

}
