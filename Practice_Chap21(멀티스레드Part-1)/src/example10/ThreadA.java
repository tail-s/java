package example10;

public class ThreadA extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {}
				System.out.println("ThraedA 작업내용");
			}
			else {
				//무의미한 반복을 막기 위해서 다른 스레드에게 양보함.
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}

}
