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
		
		//read()�Ű������� char[]Ÿ���̶�� �Ϳ� �ָ��� ����. �߿�!
		while((readData=reader.read(cArr)) != -1) {
//			str += new String(cArr, 0, readData);	//���� ���ڸ� ���ڿ��� ����
			sBuilder.append(cArr);
			System.out.println("���� ���� �� : " + readData);
		}
		//���ڿ� ���
//		System.out.println(str);
		System.out.println(sBuilder);
		
		reader.close();

	}

}
