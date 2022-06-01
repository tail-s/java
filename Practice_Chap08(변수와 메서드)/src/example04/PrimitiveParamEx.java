package example04;

class P {
	int data;
}

public class PrimitiveParamEx {

	public static void main(String[] args) {

		P a = new P();
		a.data = 77;
		System.out.println("메서드 호출 전 main() 내의 값 : " + a.data);
		//동생한테 "몇 시냐?" 라고 물어보는 형태. 값만 읽을 수 있다.
		//Call by Value(값에 의한 복사)		
		PrimitiveParamEx.dataChange(a.data);
		System.out.println("메서드 호출 후 main() 내의 값 : " + a.data);

	}
	
	public static void dataChange(int data) {
		//지역변수 data라는 값은 값복사가 이루어졌기 때문에 호출한 곳에서 아무런 영향을 받지 않는다.
		data = 44;
		System.out.println("dataChange() 내의 값 : " + data);
		return;
	}

}
