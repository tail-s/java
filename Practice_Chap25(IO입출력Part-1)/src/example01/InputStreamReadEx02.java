package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx02 {

	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("C:/Users/lunar/Desktop/study/test/test.txt");
		int readByteNo;
		byte[] b = new byte[2];
		
		while((readByteNo = iStream.read(b))!=-1) {
			System.out.println("���� ����Ʈ �� : " + readByteNo);
			String str = new String(b);
			System.out.println("���� ���ڿ� : " + str);			
		}
		
		iStream.close();

	}

}
