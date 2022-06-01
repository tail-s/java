package example04;

class A {
	int data;
}

public class ReferenceParamEx {

	public static void main(String[] args) {

		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출 전 main() 내의 값 : " + a.data);
		//동생한테 "시계가 어디있니?" 라고 물어보는 형태. 값을 읽고 수정할 수 있다.
		//Call by Reference(주소에 의한 복사)		
		ReferenceParamEx.dataChange(a);
		System.out.println("메서드 호출 후 main() 내의 값 : " + a.data);

	}
	//int[], String --> 참조변수형태 호출
	public static void dataChange(A a) {
		//a라는 주소값은 매개변수로 넘어왔기 때문에 주소를 공유한다. 호출한 곳에서 영향을 무조건 받는다.
		a.data = 44;
		System.out.println("dataChange() 내의 값 : " + a.data);
		return;
	}

}
