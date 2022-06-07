package example03;

public class HddEx {

	public static void main(String[] args) {
		
		HddDisk hddDisk = new HddDisk(500, 7200);
		UsbMemory usbMemory = new UsbMemory(32, 960);
		
		System.out.println("HDD상세");
		System.out.println(hddDisk.status());
		
		System.out.println("USB상세");
		System.out.println(usbMemory.status());
		System.out.println(usbMemory.status(64));

	}

}
