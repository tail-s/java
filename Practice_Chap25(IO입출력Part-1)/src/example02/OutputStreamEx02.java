package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx02 {

	public static void main(String[] args) throws Exception {
		
		OutputStream oStream = new FileOutputStream("C:/Users/lunar/Desktop/study/test/write.txt");
		//"ABC������"���ڿ��� ���ؼ� ����Ʈ �迭�� ��� �ִ�.
		byte[] data = "�����ǹ��������ȶȶȶȶ�".getBytes("UTF-8");
		//getBytes()�� ����� ��, �Ű������� ������ ĳ���� ���� �� ���� �ִµ�, EUC-KR�� �ѱ��� 2����Ʈ �ν�, UTF-8�� �ѱ��� 3����Ʈ �ν��Ѵ�.
		//ISO8859-1 ĳ���� �¿����� �ѱ��� 1����Ʈ�� �ν��Ѵ�. x-windows-949�� ���� �ѱ��� 2����Ʈ�� �ν��Ѵ�.
		System.out.println("data����Ʈ �迭�� ũ�� : " + data.length);
		
		//����Ʈ �迭�� �ѹ��� ��Ʈ���� ������. �ռ��� �� write(int b)�޼��忡 ���ؼ� �ξ� ȿ�����̴�.
		oStream.write(data);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		oStream.flush();
		
		//������� ������ ���� write.txt�� �ٽ� �о���δ�.
		InputStream iStream = new FileInputStream("C:/Users/lunar/Desktop/study/test/write.txt");
		int cnt = 0;
		//UTF-8�� �ѱ��� 3����Ʈ�̹Ƿ� ����Ʈ�迭�� 3����Ʈ ������.
		byte[] readBytes = new byte[3];
		int i = 0;
		
		while((cnt=iStream.read(readBytes)) != -1) {
			i++;
			String str = new String(readBytes, "UTF-8");
			System.out.println("���� �� : " + str);
			System.out.println("���� ����Ʈ �� : " + cnt);
		}
		System.out.println("���� �� : " + i);
		
		
		iStream.close();
		oStream.close();
		
		

	}

}
