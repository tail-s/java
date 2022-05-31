package example05;

public class SamsungPhone {
	
	private String company;
	private String model;
	private String color;
	private int release;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		//예외처리코드
		if(!company.equals("삼성")) {
			System.out.println("삼성폰이 아닙니다.");
			return;
		}
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		//예외처리코드
		if(!(model.equals("갤럭시8") || model.equals("갤럭시7"))) {
			System.out.println("삼성모델이 아닙니다.");
			return;			
		}
		this.model = model;	
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	@Override
	public String toString() {
		return this.getCompany() + "회사의 " + this.getModel() + "모델이며, 출시일은 " + this.getRelease() + "년 입니다. 색상은 "
				+ this.getColor() + "색입니다.";
	}
 	

}
