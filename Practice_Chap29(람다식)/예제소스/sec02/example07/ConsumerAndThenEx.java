package sec02.example07;

import java.util.function.Consumer;

public class ConsumerAndThenEx {

	public static void main(String[] args) {
		
		//Consumer<T>�Լ����������̽��� �Ű��� p�� �޾ƿͼ� �ܼ��� �Һ��ϴ� ���Ҹ� �Ѵ�.
		//�Ͽ�, �Ʒ��� ���� accept()�߻�޼��带 ���ٽ����� �����ߴ�.
		Consumer<People> consumerA = p -> { 
			System.out.println("ConsumerA : " + p.getName());};
			
		Consumer<People> consumerB = p -> { 
			System.out.println("ConsumerB : " + p.getId());};
		
		//���� ���ǵ� 2���� �Լ����������̽� consumerA�� consumerB�� ������ �Ʒ��� ���� �ڵ��� �ϸ�,
		//consumerA�� ���� ����ǰ�, �̾ consumerB�� ����Ǿ� ��°���� ���´�.
		Consumer<People> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new People("������", "Shin", null));

	}

}
