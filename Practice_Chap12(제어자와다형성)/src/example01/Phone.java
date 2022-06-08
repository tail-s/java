package example01;

public class Phone {
	
	//필드(멤버변수), 외부로부터 접근 못하게 막는다.
	//확인 결과 protected 접근 제어자는 같은 패키지에서 다 접근 가능함. 다른패키지에서 상속받은 클레스에서도 접근 불가
	protected String model;
	private String color;
	private String company;
	
	//매개변수가 있는 생성자
	public Phone(String model, String color, String company) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
	}

	//getter()제공
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}
	
	@Override
	public String toString() {
		String str = "모델 : " + this.getModel() + ", 색상 : " + this.getColor() + ", 제조회사 : " + this.getCompany();
		return str;
	}	

	
}
