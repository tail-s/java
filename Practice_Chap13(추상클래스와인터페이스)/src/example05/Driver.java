package example05;
//독립 클래스
public class Driver {
	
	//new Taxi()이거나 new Bus()만 들어올 수가 있다.
	//위 2개의 클래스가 Vehiclable 인터페이스를 구현했기 때문.
	public void drive(Vehiclable vehiclable) {
		vehiclable.run();
		//System.out.println(vehiclable);	//주소 출력
	}
	
	public void stop(Vehiclable vehiclable) {
		vehiclable.stop();
	}

	//리턴타입, 매개변수타입이 전부 Vehiclable 인터페이스 타입이다. 리턴타입도 구현클래스가 와야 하며, 매개변수 타입도 역시 구현클래스가 와야 한다.
	public Vehiclable newCarmethod(Vehiclable vehiclable) {
		if(vehiclable instanceof Taxi) {
			System.out.println("새 택시");
			Taxi taxi = (Taxi)vehiclable;
			return taxi;
		}
		else if (vehiclable instanceof Bus) {
			System.out.println("새 버스");
			Bus bus = (Bus)vehiclable;
			return bus;
		}
		return null;
	}
}
