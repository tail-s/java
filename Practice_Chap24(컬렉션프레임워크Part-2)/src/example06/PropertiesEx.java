package example06;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception {
		
		//Properties��ü�� Ű�� ���� String���� ������ Map�÷���
		Properties properties = new Properties();
		
		//PropertiesEx�� ������ ���� ���� ������Ƽ ������ �����ϹǷ� �Ʒ��� ���� �н��� �˾ƿ��� ���̴�.
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		
		//���ϰ�� ���
		System.out.println(path);
		
		//�ѱ۷� ���ϰ�ΰ� ��µǵ��� ���ڵ��Ѵ�.
		path = URLDecoder.decode(path, "UTF-8");	//�ѱ��� 3����Ʈ
//		path = URLDecoder.decode(path, "EUC-KR");	//�ѱ��� 2����Ʈ
		System.out.println(path);
		
		//database.properties������ �о���δ�.
		properties.load(new FileReader(path));
		
		System.out.println("==================================");
		//Ű�� �ְ� ���� �о��
		String driver = properties.getProperty("driver");
		System.out.println(driver);
		String url = properties.getProperty("url");
		System.out.println(url);
		String username = properties.getProperty("username");
		System.out.println(username);
		String password = properties.getProperty("password");
		System.out.println(password);

	}

}
