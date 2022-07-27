package example06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {

	public static void main(String[] args) throws Exception {
		
		//주 스트림은 바이트 기반
		InputStream iStream = System.in;
		//보조스트림 첫 번째는 바이트를 문자로 바꿔주는 InputStreamReader를 연결함.
		Reader reader = new InputStreamReader(iStream);
		//보조스트림 두 번째는 속도 및 성능 향상을 해준느 BufferedReader를 연결함.
		BufferedReader bReader = new BufferedReader(reader);
		
		System.out.print("입력 : ");
		//보통, BufferedReader보조스트림은 readLine()을 사용하기 위해 많이 사용된다.
		//readLine()은 한 줄 단위로 읽어들인다.
		String lineString = bReader.readLine();
		System.out.println("출력 : " + lineString);
		
		bReader.close();
		reader.close();
		iStream.close();

	}

}
