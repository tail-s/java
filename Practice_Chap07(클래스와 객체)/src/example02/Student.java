package example02;

public class Student {
	
	String name;
	int age;
	
	//Object클래스의 toString()을 오버라이딩(재정의)
	@Override
	public String toString() {
		
		//String str = "이름 : " + this.name + "나이 : " + this.age;
		//return str;
		
		//this : 클래스의 주소(new라는 연산자가 인스턴스를 생ㅅ어하면 비로소 활성화)
		//this는 static메서드나 클래스 안에 사용할 수 없다.
		return "이름 : " + this.name + "\t나이 : " + this.age;
	}

}
