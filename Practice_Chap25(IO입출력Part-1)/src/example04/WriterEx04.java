package example04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx04 {

	public static void main(String[] args) throws IOException {

		Writer writer = new FileWriter("C:/Users/lunar/Desktop/study/test/test.txt");
		
		String str = "�ȳ��ϼ���. ���� �ڹٸ� ���� �־��.";
		//�Ű������� StringŸ���̴�. �׷��� String�� ���Ͽ� �״�� �����ϰ� �ȴ�.
//		writer.write(str);
		writer.write(str, 2, 10);	//���ڿ� 2��° �ε������� 10���� ���ڸ� ���Ϸ� �����ϱ�
		writer.flush();
		System.out.println("������ �����Ǿ����ϴ�.");
		writer.close();

	}

}
