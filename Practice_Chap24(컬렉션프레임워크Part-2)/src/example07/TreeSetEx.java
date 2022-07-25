package example07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		//TreeSet은 이진트리를 기반으로 이루어진 컬렉션이며, Set인터페이스와 SortedSet인터페이스를 구현한 클래스이다.
		TreeSet<Integer> scores = new TreeSet<>();
		
		//객체 추가
		scores.add(87);	//자동 박싱
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		//가장 낮은 점수를 구해보기(이진트리의 가장 왼쪽 값)
		System.out.println("가장 낮은 점수 : " + scores.first());		
		//가장 높은 점수를 구해보기(이진트리의 가장 오른쪽 값)
		System.out.println("가장 높은 점수 : " + scores.last());
		
		System.out.println("==============================");	
		
		//주어진 객체의 왼쪽에 있는 점수 -- 주어진 객체는 포함하지 않는다.
		score = scores.lower(95);
		System.out.println("95점 아래 점수 : " + score);		
		//주어진 객체의 왼쪽에 있는 점수 -- 주어진 객체는 포함한다.
		score = scores.floor(95);
		System.out.println("95점 아래 점수(95점도 포함) : " + score);
		System.out.println("사이즈 : " + scores.size());		
		
		System.out.println("==============================");	
		
		//주어진 객체의 오른에 있는 점수 -- 주어진 객체는 포함하지 않는다.
		score = scores.higher(95);
		System.out.println("95점 위의 점수 : " + score);		
		//주어진 객체의 왼쪽에 있는 점수 -- 주어진 객체는 포함한다.
		score = scores.ceiling(95);
		System.out.println("95점 위의 점수(95점도 포함) : " + score);
		System.out.println("사이즈 : " + scores.size());

		System.out.println("==============================");
		
//		while(!scores.isEmpty()) {
//			System.out.println("pollFirst()실행");
//			//맨 왼쪽 객체부터 가져온다. 단, 가져온 후 treeSet에서 제거를 한다.
//			score = scores.pollFirst();
//			System.out.println("가져온 객체 : " + score);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}

		System.out.println("==============================");
		
//		while(!scores.isEmpty()) {
//			System.out.println("pollLast()실행");
//			//맨 오른쪽 객체부터 가져온다. 단, 가져온 후 treeSet에서 제거를 한다.
//			score = scores.pollLast();
//			System.out.println("가져온 객체 : " + score);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
		
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollFirst, pollLast 메서드와 반복자와의 가장 큰 차이점은 객체를 제거하느냐의 차이점이다.
			//반복자에선느 명시적으로 remove()를 호출해야 제거가 된다.
			int value = iterator.next();
//			iterator.remove();
			System.out.println(value + " 남은 객체 수 : " + scores.size());
		}
		

	}

}
