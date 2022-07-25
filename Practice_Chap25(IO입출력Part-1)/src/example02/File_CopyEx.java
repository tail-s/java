package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_CopyEx {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fInputStream = new FileInputStream("C:/Users/lunar/Desktop/study/test/write.txt");
		FileOutputStream fOutputStream = new FileOutputStream("C:/Users/lunar/Desktop/study/test/write_복사본.txt");
		byte[] readBytes = new byte[2000];
		int data = 0;
		
		while((data=fInputStream.read(readBytes))!=-1) {
			fOutputStream.write(readBytes);
			System.out.println("읽은 바이트 수 : " + data);
		}
		
//		data=fInputStream.read(readBytes);
//		fOutputStream.write(readBytes);
//		System.out.println("읽은 바이트 수 : " + data);
		
		fOutputStream.flush();
		System.out.println("해당 경로에 write_복사본.txt 파일이 생성되었습니다.");
		
		
		
		fOutputStream.close();
		fInputStream.close();

	}

}
