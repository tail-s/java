package example01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadEx01 {

	public static void main(String[] args) throws Exception {
		//다형성이 적용된 코드, 일반 예외가 발생하는데 그 예외를 JVM에게 던지고 있다.
		InputStream iStream = new FileInputStream("C:\\Users\\lunar\\Desktop\\study\\test\\test.txt");
		int readByte;	//읽은 바이트 수를 리턴받는 변수
		
		//InputStream의 read()는 더 이상 읽을것이 없다면 -1값을 리턴함
		//기본적으로 이클립스는 한글은 2바이트로 읽어들인다.
		while((readByte = iStream.read())!=-1) {
			System.out.println("읽은 바이트 수 : " + readByte);		//아스키코드값을 출력
			System.out.println("읽은 문자 : " + (char)readByte);	//강제타입캐스팅 후 문자를 출력
		}
		//이클립스의 디폴트 캐릭터셋
		System.out.println(Charset.defaultCharset());
		
		//아래와 같이 작성해도 같은 결과를 얻을 수 있다.
//		while(true) {
//			readByte = iStream.read();
//			if(readByte == -1) {
//				break;
//			}				
//			System.out.println("읽은 바이트 수 : " + readByte);		//아스키코드값을 출력
//			System.out.println("읽은 문자 : " + (char)readByte);	//강제타입캐스팅 후 문자를 출력
//		}
//		
		iStream.close();

	}

}
