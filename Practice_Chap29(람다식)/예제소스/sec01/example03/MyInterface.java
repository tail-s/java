package sec01.example03;

@FunctionalInterface
public interface MyInterface {
	//2개의 매개변수와 리턴값이 존재하는 추상메서드이다.
	int method(int x, int y);
	//void mehtod1();  //추상메서드가 2개 이상이 되면 컴파일 예외를 발생시킴.
}
