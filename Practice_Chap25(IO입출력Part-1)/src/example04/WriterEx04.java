package example04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx04 {

	public static void main(String[] args) throws IOException {

		Writer writer = new FileWriter("C:/Users/lunar/Desktop/study/test/test.txt");
		
		String str = "안녕하세요. 지금 자바를 배우고 있어요.";
		//매개변수가 String타입이다. 그래서 String을 파일에 그대로 저장하게 된다.
//		writer.write(str);
		writer.write(str, 2, 10);	//문자열 2번째 인덱스부터 10개의 문자를 파일로 저장하기
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		writer.close();

	}

}
