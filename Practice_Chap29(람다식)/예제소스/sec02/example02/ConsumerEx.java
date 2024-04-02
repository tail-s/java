package sec02.example02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {		
		//String타입을 매개변수로 가지는 Consumer제네릭 함수적 인터페이스를 구현했다.
		//t는 무조건 String타입이고 매개변수가 된다.
		//Consumer인터페이스류들은 리턴값이 존재하지 않는 것을 상기하도록 하자.
		//(t) -> { System.out.println("ConsumerInterface : " + t); --> 바로, accept()를 람다식으로
		//구현했다.
		Consumer<String> consumer = (t) -> {
			System.out.println("ConsumerInterface : " + t);
		};		
		consumer.accept("소비자 인터페이스 자바1.8추가");
		
		//Bi(2개)Consumer는 2개의 객체를 받아서 소비하는 인터페이스이다.
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println("BiConsumerInterface : " + t + ", " + u);
		};
		biConsumer.accept("자바", "C++");
		
		//DoubleConsumer는 매개변수 값으로 무조건 double값만 받는 인터페이스이다.
		DoubleConsumer doubleConsumer = d -> {
			System.out.println("DoubleConsumerInterface : " + d );
		};
		doubleConsumer.accept(1.8);
		
		//ObjIntConsumer<T>함수적 인터페이스는 매개값으로 T와 int값(고정)을 가진다.		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> {
			System.out.println("ObjIntConsumerInterface : " + t + ", " + i);			
		};
		objIntConsumer.accept("자바", 8);
	}
}
