package example03;

import java.util.Properties;
import java.util.Set;

public class SystemEx03 {

	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		System.out.println("현재 운영체제 : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("사용자 계정 : " + userName);
		
		//Properties 클래스는 Map계열의 컬렉션이다. 키도 String, 값도 String이다.
		Properties properties = System.getProperties();
//		System.out.println(properties.toString());
		//Map컬렉션에서 키값만 Set계열로 가져오는 메서드가 keySet()
		Set set = properties.keySet();
		
		System.out.println("Key                                       value");
		System.out.println("-----------------------------------------------");
		for(Object objkey : set) {
			String key = (String)objkey;
			String value = System.getProperty(key);
			System.out.println(key + "                          " + value);
		}
		

	}

}
