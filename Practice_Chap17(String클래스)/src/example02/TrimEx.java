package example02;

public class TrimEx {

	public static void main(String[] args) {
		
		//trim()은 좌우 공백만 제거함. 중간에 있는 공백은 프로그래머가 직접 제거하는 코드를 작성해야 함.
		String tel1 = "                02";
		String tel2 = "-772              ";
		String tel3 = "    -1037         ";
		
		System.out.println(tel1.trim()+tel2.trim()+tel3.trim());

	}

}
