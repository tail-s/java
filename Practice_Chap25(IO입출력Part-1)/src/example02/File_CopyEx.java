package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_CopyEx {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fInputStream = new FileInputStream("C:/Users/lunar/Desktop/study/test/write.txt");
		FileOutputStream fOutputStream = new FileOutputStream("C:/Users/lunar/Desktop/study/test/write_���纻.txt");
		byte[] readBytes = new byte[2000];
		int data = 0;
		
		while((data=fInputStream.read(readBytes))!=-1) {
			fOutputStream.write(readBytes);
			System.out.println("���� ����Ʈ �� : " + data);
		}
		
//		data=fInputStream.read(readBytes);
//		fOutputStream.write(readBytes);
//		System.out.println("���� ����Ʈ �� : " + data);
		
		fOutputStream.flush();
		System.out.println("�ش� ��ο� write_���纻.txt ������ �����Ǿ����ϴ�.");
		
		
		
		fOutputStream.close();
		fInputStream.close();

	}

}
