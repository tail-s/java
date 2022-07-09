package example02;

import java.awt.Toolkit;

public class BeepPrintEx {
	//main()는 JVM이 실행한다.
	public static void main(String[] args) {
		
		//멀티스레드를 직접 생성하는 방법 3가지
		//방법 1 --> 구현객체 대입
		Runnable runnable = new Beep();	//구현 객체 대입
		Thread thread = new Thread(runnable);
		thread.start();
		
		//방법 2 --> 익명구현객체
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					System.out.println("Beep음을 실행하는 스레드명 : " + Thread.currentThread().getName());
//					
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {}
//				}				
//			}
//		});
//		thread.start();
		
		//방법3 --> 람다식(함수적 인터페이스) JDK1.8 코드 절약, 가독성
//		Thread thread = new Thread( ()-> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for(int i=0; i<5; i++) {
//				System.out.println("Beep음을 실행하는 스레드명 : " + Thread.currentThread().getName());
//				
//				toolkit.beep();
//				
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {}
//			}			
//		});
//		thread.start();		
		
		
		for(int i=0; i<5; i++) {
			System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
			System.out.println("Beep!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		//스레드는 한 번 start()를 다 실행하고 나면 재실행이 안되며, 재실행을 하기 위해서 아래와 같이 인스턴스를 한개 더 만들어야 한다.(중요)
		thread = new Thread(runnable);
		thread.start();
		
		

	}

}
