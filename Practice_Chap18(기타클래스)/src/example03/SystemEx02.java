package example03;

public class SystemEx02 {

	public static void main(String[] args) {
		
		//프로그램의 성능을 테스트 할 때 사용하는 유용한 메서드
		long sum = 0;
		long start = System.currentTimeMillis();	//10의 3승 분의 1초
//		long start = System.nanoTime();	//10의 9승 분의 1초
		
		for(long i=1; i<10000000; i++) {
			sum += i;
		}
		
//		long end = System.nanoTime();
		long end = System.currentTimeMillis();					
		System.out.println(sum);
//		System.out.println("소요된 시간 : " + (end-start) + "ms");
		System.out.println("소요된 시간 : " + ((end-start)/1000.0) + "초");
//		System.out.println("소요된 시간 : " + (end-start) + "ns");
		
		

	}

}
