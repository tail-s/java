package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx02 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("C:/Users/lunar/Desktop/study/test/test.txt");
		int readData;
		char[] cArr = new char[2];
//		String str = "";
		StringBuilder sBuilder = new StringBuilder();
		
		//read()매개변수가 char[]타입이라는 것에 주목을 하자. 중요!
		while((readData=reader.read(cArr)) != -1) {
//			str += new String(cArr, 0, readData);	//읽은 문자를 문자열로 생성
			sBuilder.append(cArr);
			System.out.println("읽은 문자 수 : " + readData);
		}
		//문자열 출력
//		System.out.println(str);
		System.out.println(sBuilder);
		
		reader.close();

	}

}
