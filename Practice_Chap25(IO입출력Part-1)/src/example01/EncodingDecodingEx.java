package example01;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingDecodingEx {

	public static void main(String[] args) throws Exception {
		
		String hangul = "�ѱ�";
		String[] encodings = new String[] {"x-windows-949", "EUC-KR", "UTF-8", "ISO8859-1"};
		String[] encoded = new String[4];
		String decoded = "";
		
		for(int i=0; i<encodings.length; i++) {
			//���ڵ�(��谡 ���� ������ ��ȯ)
			encoded[i] = URLEncoder.encode(hangul, encodings[i]);
			System.out.println(encodings[i] + " ���� ���ڵ��� �� : " + encoded[i]);
		}
		
		for(int i=0; i<encodings.length; i++) {
			//���ڵ�(����� ���� ������ ��ȯ)
			decoded = URLDecoder.decode(encoded[i], encodings[i]);
			System.out.println(encodings[i] + " ���� ���ڵ��� �� : " + decoded);
		}

	}

}
