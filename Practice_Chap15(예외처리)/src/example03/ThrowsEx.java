package example03;

public class ThrowsEx {

	
	public static void main(String[] args) {         //throws Exception {
		//JVM에게 예외를 던진다.
		//method1();
		
		//main()에서 method1() 호출하고 있으니 여기서 예외처리를 해야한다.
		try {
			method1();
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");			
		}
		
		

	}
	//Throws는 메서드 선언부 끝에 작성을 하며, 호출한 곳으로 예외를 되던지며, 호출한 곳에서 예외를 반드시 처리해야 한다.
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		System.out.println(10/0); //산술예외(실행예외)
	}

}
