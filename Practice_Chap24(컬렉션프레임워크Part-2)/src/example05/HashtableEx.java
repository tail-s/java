package example05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx {

	public static void main(String[] args) {
		
		//HashMap : 신버전
		//HashTable : 구버전
		//기능은 동일하다.
		
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12");
		System.out.println("총 Entry 수 : " + map.size());
		
		int cnt = 0;	//비밀번호 틀린 횟수
		
		//객체 검색
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.println();
			
			//저장되어 있는 객체를 검색하여(일종의 DB라고 생각하자) 아이디와 비밀번호가 일치하면 로그인 성공
			if(map.containsKey(id)) {
				//id 즉, 키를 주고 얻어오는 값은 password이기에, 같다면 로그인 성공, 아니면 비밀번호가 불일치. 단, 틀린 횟수 1 증가.
				if(map.get(id).equals(password)) {
					System.out.println(id + "님이 로그인 되었습니다.");
					break;
				}
				else {
					cnt++;
					System.out.println("비밀번호가 " + cnt + "회 틀렸습니다.");
					if(cnt == 3) {
						System.out.println("비밀번호가 " + cnt + "회 틀렸습니다. 지점 방문 부탁드립니다.");
						break;
					}
				}
			}
			else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
		
		
		sc.close();
		

	}

}
