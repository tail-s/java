package example04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class WriterEx01 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/Users/lunar/Desktop/study/test/test.txt");
		
		//toCharArray()는 문자열을 char[]로 리턴해준다.
		char[] str = "홍길동".toCharArray();
		System.out.println(Arrays.toString(str));
		
		for(int i=0; i<str.length; i++) {
			//한 문자씩 보내는 형태
			writer.write(str[i]);
			System.out.println("루핑 수 : " + i);
		}
		//강제로 버퍼를 비워준다.
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		writer.close();
		
		

	}

}
