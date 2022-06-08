package example03;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = null;
		SportCar sportCar1 = new SportCar();
		SportCar sportCar2 = null;
		PoliceCar policeCar = new PoliceCar();
		
		sportCar1.speedUp();
		
		//형변환코드 생략가능
		car = sportCar1;	//업캐스팅(자손 -> 조상), 조작할 수 있는 멤버가 줄어든다.
		//car.speedUp(); 접근 불가. 컴파일 예외 발생 이유? : 
		
		//다운캐스팅을 할 때, 반드시 명시적으로 형변환코드를 작성해야 함. 생략불가.
		sportCar2 = (SportCar)car;	//다운캐스팅(조상 -> 자손), 조작할 수 있는 멤버가 늘어난다.
		sportCar2.speedUp();
		
		//sportCar1 = (SportCar)policeCar; 상속관계가 없는 클래스끼리는 형변환이 불가능.
		
		

	}

}
