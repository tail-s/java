package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) throws Exception {
		//ReaderŬ������ ���� Ưȭ Ŭ�����ν� ����Ŭ������ FileReader�� �����ؼ� ����.
		Reader reader = new FileReader("C:/Users/lunar/Desktop/study/test/test.txt");
		int readData;
		
		//readData�� int������ �� 2����Ʈ(���� 2����Ʈ�ϱ�)�� ����ȴ�.
		while((readData=reader.read()) != -1) {
			//���� ���(����Ʈ������ ���� ĳ����)
			System.out.println("���� ���� : " + (char)readData);
			//�����ڴ� �ƽ�Ű�ڵ�, �ѱ��� �����ڵ尡 ���.
			System.out.println("���� ���� : " + readData);
		}
		
		//���� �ڵ�
//		while(true) {
//			readData = reader.read();
//			if(readData == -1)
//				break;
//		//���� ���(����Ʈ������ ���� ĳ����)
//		System.out.println("���� ���� : " + (char)readData);
//		//�����ڴ� �ƽ�Ű�ڵ�, �ѱ��� �����ڵ尡 ���.
//		System.out.println("���� ���� : " + readData);			
//		}
		
		reader.close();

	}

}
