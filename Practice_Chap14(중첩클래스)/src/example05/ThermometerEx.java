package example05;

import example05.Thermometer.TemperatureChangable;

public class ThermometerEx {

	public static void main(String[] args) {


		Thermometer thermometer = new Thermometer();
		thermometer.setChangable(new AnalogThermometer());
		thermometer.viewTemperature();
		
		thermometer = new Thermometer();
		thermometer.setChangable(new DigitalThermometer());
		thermometer.viewTemperature();
		
		//중첩인터페이스이므로 익명구현객체를 얻는 것은 안된다.
//		TemperatureChangable thermometer2 = new Thermometer.TemperatureChangable() {
//			@Override
//			public void onChange() {
//				System.out.println("익명구현객체로 만든");				
//			}			
//		};
//		Thermometer t = (Thermometer)thermometer2;
//		t.viewTemperature();

	}

}
