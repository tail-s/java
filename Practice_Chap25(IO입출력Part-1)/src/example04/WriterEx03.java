package example04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx03 {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("C:/Users/lunar/Desktop/study/test/test.txt");
		//���ڿ� -> ���ڹ迭�� ������.
		char[] str = "������̴�.".toCharArray();
		writer.write(str, 1, 4);
		writer.flush();
		System.out.println("������ �����Ǿ����ϴ�.");
		writer.close();

	}

}
