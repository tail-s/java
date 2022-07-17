package example04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitEx {

	public static void main(String[] args) {
		//최대 2개의 스레드를 가지는 스레드풀 생성하기
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<20; i++) {
			//20개의 작업객체 만들기
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//newFixedThreadPool(), newCachedThreadPool()은 내붖거으로 ThreadPoolExecutor로 만들어졌기 때문에
					//강제타입변환이 가능하다.
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
					
					//현재 스레드 풀에 있는 스레드 개수를 리턴해줌
					int poolSize = threadPoolExecutor.getPoolSize();
					
					//작업실행 스레드명을 얻기
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 수 : " + poolSize + "] 작업스레드 이름 : " + threadName);
					
					//일부러 예외 발생시키기(execute()와 submit()의 차이점을 보기 위해 예외를 발생시킴)
					Integer.parseInt("삼");
				}
			};
			
			//작업 큐에 runnable 객체를 넣는 행위, execute()는 작업처리 도중에 예외가 발생하면, 해당 스레드를 제거하고 새롱누 스레드가 생성된다.
			//submit()는 예외가 발생하더라도, 해당 스레드를 스레드풀에서 제거하지 않고 재사용 함을 알 수 있다.
			//하여, submit()를 사용하는 것이 좋다.
			
//			executorService.execute(runnable);
			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}			
		}
		
		//스레드 풀 종료(단, 작업큐에 있는 모든 작업을 마무리 한 후에 종료시킨다.)
		executorService.shutdown();
	}
}
