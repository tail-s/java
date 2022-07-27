package example06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {

	public static void main(String[] args) throws Exception {
		
		//�� ��Ʈ���� ����Ʈ ���
		InputStream iStream = System.in;
		//������Ʈ�� ù ��°�� ����Ʈ�� ���ڷ� �ٲ��ִ� InputStreamReader�� ������.
		Reader reader = new InputStreamReader(iStream);
		//������Ʈ�� �� ��°�� �ӵ� �� ���� ����� ���ش� BufferedReader�� ������.
		BufferedReader bReader = new BufferedReader(reader);
		
		System.out.print("�Է� : ");
		//����, BufferedReader������Ʈ���� readLine()�� ����ϱ� ���� ���� ���ȴ�.
		//readLine()�� �� �� ������ �о���δ�.
		String lineString = bReader.readLine();
		System.out.println("��� : " + lineString);
		
		bReader.close();
		reader.close();
		iStream.close();

	}

}
