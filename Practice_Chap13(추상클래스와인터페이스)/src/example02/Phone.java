package example02;
//추상클래스
public abstract class Phone {
	
	private int serial_No;
	private String company;	private String owner;
	
	
	public Phone(int serial_No, String owner, String company) {
		super();
		this.serial_No = serial_No;
		this.owner = owner;
		this.company = company;
	}

	public int getSerial_No() {
		return serial_No;
	}

	public String getOwner() {
		return owner;
	}

	public String getCompany() {
		return company;
	}
	
	//추상메서드 선언
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void showInfo() {
		System.out.println("시리얼 넘버 : " + this.getSerial_No());
		System.out.println("제조회사 : " + this.getCompany());
		System.out.println("소유자 : " + this.getOwner());
	}
	
	

}
