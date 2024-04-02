package sec01.example02;

@FunctionalInterface
public interface MyInterface {
	//매개변수가 있다.
	void method(int x);
	//void mehtod1();  //추상메서드가 2개 이상이 되면 컴파일 예외를 발생시킴.
}
