package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx03 {

	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("C:/Users/lunar/Desktop/study/test/test.txt");
		int cnt;
		byte[] readBytes = new byte[8];
		
		//시작 인덱스가 2이고 3개만 읽어서 저장하는 코드를 작성한다.
		cnt = iStream.read(readBytes, 2, 5);
		System.out.println("읽은 바이트 수 : " + cnt);
		System.out.println();
		
		for(byte b : readBytes) {
			System.out.println("읽은 바이트 : " + (char)b);
		}
		
		iStream.close();

	}

}
