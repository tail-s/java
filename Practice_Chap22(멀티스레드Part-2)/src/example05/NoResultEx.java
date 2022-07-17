package example05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {

	public static void main(String[] args) {
		//해당 PC CPU의 코어 수를 최대 스레드 수로 준다. (ex. 듀얼코어는 2개, 쿼드코어는 4개)
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		
		//Runnable익명 구현객체 생성(작업객체) --> 리턴값 없다.
		System.out.println("[작업처리 요청]");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for(int i=0; i<10; i++) {
					sum += i;
				}
				System.out.println("[작업처리 결과] : " + sum);
				
			}
		};
		
		//작업큐에 작업(runnable객체)을 넣는다. 작업이 완료될 때까지 블로킹 즉 기다린다. Future는 지연완료객체이다.
		Future<?> future = executorService.submit(runnable);
		
		try {
			//get()는 작업객체가 작업을 완료할 때까지 기다린다.
			Object obj = future.get();
			String str = (String)obj;
			System.out.println("[작업처리 완료]");
			System.out.println("Future의 get()가 리턴한 값 : " + str);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
				
		//스레드풀 종료
		executorService.shutdown();

	}

}
