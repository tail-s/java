package example04;

public class ReferEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		Child child = new Child();
		
		//멤버변수는 근본을 벗어나지 못함.
		System.out.println(parent.x);
		System.out.println(child.x);
		
		//멤버메서드는 현재 참조하고있는 인스턴스에 영향을 받음.
		parent.method();
		child.method();
		
		parent.type(new Child());
		parent.type(new Car());

	}

}
