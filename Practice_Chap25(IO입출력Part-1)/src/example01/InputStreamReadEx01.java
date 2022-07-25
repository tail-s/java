package example01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadEx01 {

	public static void main(String[] args) throws Exception {
		//�������� ����� �ڵ�, �Ϲ� ���ܰ� �߻��ϴµ� �� ���ܸ� JVM���� ������ �ִ�.
		InputStream iStream = new FileInputStream("C:\\Users\\lunar\\Desktop\\study\\test\\test.txt");
		int readByte;	//���� ����Ʈ ���� ���Ϲ޴� ����
		
		//InputStream�� read()�� �� �̻� �������� ���ٸ� -1���� ������
		//�⺻������ ��Ŭ������ �ѱ��� 2����Ʈ�� �о���δ�.
		while((readByte = iStream.read())!=-1) {
			System.out.println("���� ����Ʈ �� : " + readByte);		//�ƽ�Ű�ڵ尪�� ���
			System.out.println("���� ���� : " + (char)readByte);	//����Ÿ��ĳ���� �� ���ڸ� ���
		}
		//��Ŭ������ ����Ʈ ĳ���ͼ�
		System.out.println(Charset.defaultCharset());
		
		//�Ʒ��� ���� �ۼ��ص� ���� ����� ���� �� �ִ�.
//		while(true) {
//			readByte = iStream.read();
//			if(readByte == -1) {
//				break;
//			}				
//			System.out.println("���� ����Ʈ �� : " + readByte);		//�ƽ�Ű�ڵ尪�� ���
//			System.out.println("���� ���� : " + (char)readByte);	//����Ÿ��ĳ���� �� ���ڸ� ���
//		}
//		
		iStream.close();

	}

}
