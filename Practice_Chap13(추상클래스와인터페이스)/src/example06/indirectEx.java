package example06;

public class indirectEx {

	public static void main(String[] args) {
		
		I i = new B();
		i.method();
		
		i = new C();
		i.method();

	}

}
