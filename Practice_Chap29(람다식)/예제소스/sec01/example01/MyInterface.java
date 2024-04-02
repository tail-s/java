package sec01.example01;

@FunctionalInterface
public interface MyInterface {
	void method();
	//void mehtod1();  //추상메서드가 2개 이상이 되면 컴파일 예외를 발생시킴.
}
