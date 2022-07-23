package example02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<Member> set = new HashSet<>();
		
		//new�� ����߱⿡ �Ʒ� 4���� Member��ü�� ���� �ٸ� �ּҸ� ������ �ִ�. ������, MemberŬ�������� Hashcode()�� �������߱⿡ ���ü�� �ν��Ѵ�.
		//�Ͽ�, Set�� �ߺ������� ���� �ʴ´�.
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 25));
		set.add(new Member("ȫ�浿", 17));
		
		System.out.println("�� ��ü �� : " + set.size());
		
		//�ݺ���
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member.getName() + " : " + member.getAge());
		}

	}

}
