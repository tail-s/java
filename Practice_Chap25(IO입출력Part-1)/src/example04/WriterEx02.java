package example04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx02 {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("C:/Users/lunar/Desktop/study/test/test.txt");
		char[] str = "김소진".toCharArray();
		
		//write()의 매개변수 타입이 문자배열이다. 이전에 학습했던 write(int b)보다 훨씬 효율적이다.
		writer.write(str);
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		writer.close();
	}

}
