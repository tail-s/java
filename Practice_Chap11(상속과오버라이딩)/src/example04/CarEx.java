package example04;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car(80);
		car.speedUp();
		car.speedDown();
		car.stop();
		
		SportCar sportCar = new SportCar(150);
		sportCar.speedUp();		//조상클래스의 speedUp()을 호출
		sportCar.speedDown();	//조상클래스의 speedDown()을 호출
		sportCar.stop(); 		//자손클래스의 stop()을 호출

	}

}
