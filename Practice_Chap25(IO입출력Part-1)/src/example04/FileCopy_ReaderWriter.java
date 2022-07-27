package example04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy_ReaderWriter {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("C:/Users/lunar/Desktop/study/test/test.java");
		Writer writer = new FileWriter("C:/Users/lunar/Desktop/study/test/test_copied.txt");
		
		String str = "";
		int readBytes;
		char[] cArr = new char[2];
//		char[] cArr = new char[1000];
		int i = 0;
		
		
//		readBytes = reader.read(cArr);
		while((readBytes = reader.read(cArr)) != -1) {
			String tmp = new String(cArr);
			str += tmp;
			System.out.println("루핑 수 : " + ++i);
			System.out.println("읽은 바이트 수 : " + readBytes);
		}
		writer.write(str);
//		writer.write(tmp);	
			
		writer.flush();
		System.out.println("복사본 생성완료.");
		writer.close();
		reader.close();

	}

}
