package example01;

public class ForEx02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int temp = 0;
		
		//디버깅 : debug 창으로 의도치 않게 넘어갔다면, 프로그램에 문제가 발생한 것으로 에러를 잡아나가는 과정을 디버깅이라고 합니다.
		//breakPoint(종단점) 설정 후, 실행시키면 F8을 누르면서 한단계씩 진행시켜 변수의 값들을 살펴나가면 에러를 쉽게 잡을 수 있다.
		
		//누적 합계가 2000 이상일 때 i의 값을 출력하시오.
		for(int i=1; i<=100; i++) {
			sum += i;			
			if(sum >= 2000) {
				temp = i;
				break;
			}
		}
		System.out.println("2000 이상일 때 sum의 값 : " + sum);
		System.out.println("2000 이상일 때 i의 값 : " + temp);

	}

}
