package example03;

public class SystemEx01 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
//			if(i==5) {
//				System.exit(0);
//			}			
		}
		
		System.out.println();
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				//프로그램을 종료시킨다.
				System.exit(0);
			}			
		}
	}

}
