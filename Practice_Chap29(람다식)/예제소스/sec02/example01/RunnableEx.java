package sec02.example01;

public class RunnableEx {

	public static void main(String[] args) {
		
		//지금까지 익명구현객체를 만든 방법
		Runnable runnable = new Runnable() {			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println(i);
				}				
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		System.out.println("-----------------------");
		
		//람다식으로 직접 작성하여 Thread의 매개값으로 주는 코드(방법1)
		runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}		
		};
		thread = new Thread(runnable);
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		System.out.println("-----------------------");
		
		//Thread객체를 생성할 때, 바로 람다식을 작성함.(방법2)
		thread = new Thread( () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}
}
