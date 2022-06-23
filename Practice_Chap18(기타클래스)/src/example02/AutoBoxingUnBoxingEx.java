package example02;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		
		//자동 박싱
		Integer obj1 = 100;
		Integer obj2 = 300;
		
		List list = new Vector();
		list.add(obj1);
		list.add(obj2);
		list.add(500);	//list.add(new Integer(500))
		System.out.println(list);
		
		int value1 = (Integer)list.get(0);
		System.out.println(value1);
		
		int value2 = obj2.intValue();	//정상코드
		int value3 = obj2;	//자동 언박싱
		System.out.println(value2);
		System.out.println(value3);
		
		//객체 + 기본타입은 문법에러지만 포장클래스이기 때문에 컴파일러가 알아서 자동 언박싱해서 아래와 같은 코드가 가능하다.
		int result = obj1 + 500;
		System.out.println(result);

	}

}
