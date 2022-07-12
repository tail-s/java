package example12;

//공유객체
public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("threadA의 methodA()실행");
		notify();	//wait()에 의해 BLOCKED된 스레드를 실행대기 상태로 깨운다.
		
		try {
			wait();	//영원히 잔다. 다른 스레드에서 notify(), notifyAll() 호출하면 깨어남.
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("threadB의 methodB()실행");
		notify();	//wait()에 의해 BLOCKED된 스레드를 실행대기 상태로 깨운다.
		
		try {
			wait();	//영원히 잔다. 다른 스레드에서 notify(), notifyAll() 호출하면 깨어남.
		} catch (InterruptedException e) {}
	}


}
