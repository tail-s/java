package sec02.example02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {		
		//StringŸ���� �Ű������� ������ Consumer���׸� �Լ��� �������̽��� �����ߴ�.
		//t�� ������ StringŸ���̰� �Ű������� �ȴ�.
		//Consumer�������̽������� ���ϰ��� �������� �ʴ� ���� ����ϵ��� ����.
		//(t) -> { System.out.println("ConsumerInterface : " + t); --> �ٷ�, accept()�� ���ٽ�����
		//�����ߴ�.
		Consumer<String> consumer = (t) -> {
			System.out.println("ConsumerInterface : " + t);
		};		
		consumer.accept("�Һ��� �������̽� �ڹ�1.8�߰�");
		
		//Bi(2��)Consumer�� 2���� ��ü�� �޾Ƽ� �Һ��ϴ� �������̽��̴�.
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println("BiConsumerInterface : " + t + ", " + u);
		};
		biConsumer.accept("�ڹ�", "C++");
		
		//DoubleConsumer�� �Ű����� ������ ������ double���� �޴� �������̽��̴�.
		DoubleConsumer doubleConsumer = d -> {
			System.out.println("DoubleConsumerInterface : " + d );
		};
		doubleConsumer.accept(1.8);
		
		//ObjIntConsumer<T>�Լ��� �������̽��� �Ű������� T�� int��(����)�� ������.		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> {
			System.out.println("ObjIntConsumerInterface : " + t + ", " + i);			
		};
		objIntConsumer.accept("�ڹ�", 8);
	}
}
