package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx03 {

	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("C:/Users/lunar/Desktop/study/test/test.txt");
		int cnt;
		byte[] readBytes = new byte[8];
		
		//���� �ε����� 2�̰� 3���� �о �����ϴ� �ڵ带 �ۼ��Ѵ�.
		cnt = iStream.read(readBytes, 2, 5);
		System.out.println("���� ����Ʈ �� : " + cnt);
		System.out.println();
		
		for(byte b : readBytes) {
			System.out.println("���� ����Ʈ : " + (char)b);
		}
		
		iStream.close();

	}

}
