package example04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class WriterEx01 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/Users/lunar/Desktop/study/test/test.txt");
		
		//toCharArray()�� ���ڿ��� char[]�� �������ش�.
		char[] str = "ȫ�浿".toCharArray();
		System.out.println(Arrays.toString(str));
		
		for(int i=0; i<str.length; i++) {
			//�� ���ھ� ������ ����
			writer.write(str[i]);
			System.out.println("���� �� : " + i);
		}
		//������ ���۸� ����ش�.
		writer.flush();
		System.out.println("������ �����Ǿ����ϴ�.");
		writer.close();
		
		

	}

}
