package example10;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		
		//생성자에 비교할 기준을 미리 제시를 한 것이다.
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new AscendingComparator());
		
//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {
//			@Override
//			public int compare(Fruit o1, Fruit o2) {				
//				return o1.getPrice() - o2.getPrice();
//			}			
//		});
		
		
		//비교 기준이 없다면 ClassCastException 실행예외가 발생할 수 있기에 예외처리를 기본적으로 해주는 것이 좋음.
		try {
			treeSet.add(new Fruit("딸기", 4200));
			treeSet.add(new Fruit("포도", 6500));
			treeSet.add(new Fruit("복숭아", 3500));
			treeSet.add(new Fruit("바나나", 3400));
			treeSet.add(new Fruit("자두", 2500));
			treeSet.add(new Fruit("호박", 1000));
		} catch(Exception e) {
			System.out.println("정렬 기준이 없음");
			e.printStackTrace();
		}
		System.out.println("총 객체 수 : " + treeSet.size());		
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName() + " : " + fruit.getPrice());
		}		

	}

}
