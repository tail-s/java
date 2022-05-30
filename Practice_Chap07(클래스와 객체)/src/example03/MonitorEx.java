package example03;

public class MonitorEx {

	public static void main(String[] args) {

		Monitor monitor = new Monitor();
		
		System.out.println(monitor.toString());
		
		monitor.power();
		monitor.power();
		monitor.power();
		monitor.power();
		monitor.power();
		monitor.power();
		monitor.power();
		
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelUp();
		
		monitor.channelDown();
		monitor.channelDown();
		monitor.channelDown();
		
		monitor.volumeUp();
		monitor.volumeUp();
		monitor.volumeUp();
		
		System.out.println(monitor);
		
		monitor.power();		

	}

}
