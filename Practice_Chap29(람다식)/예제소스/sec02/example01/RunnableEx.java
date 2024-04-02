package sec02.example01;

public class RunnableEx {

	public static void main(String[] args) {
		
		//���ݱ��� �͸�����ü�� ���� ���
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
		
		//���ٽ����� ���� �ۼ��Ͽ� Thread�� �Ű������� �ִ� �ڵ�(���1)
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
		
		//Thread��ü�� ������ ��, �ٷ� ���ٽ��� �ۼ���.(���2)
		thread = new Thread( () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}
}
