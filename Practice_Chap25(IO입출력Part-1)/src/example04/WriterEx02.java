package example04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx02 {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("C:/Users/lunar/Desktop/study/test/test.txt");
		char[] str = "�����".toCharArray();
		
		//write()�� �Ű����� Ÿ���� ���ڹ迭�̴�. ������ �н��ߴ� write(int b)���� �ξ� ȿ�����̴�.
		writer.write(str);
		writer.flush();
		System.out.println("������ �����Ǿ����ϴ�.");
		writer.close();
	}

}
