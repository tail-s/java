package example07;
//공유객체
public class Calculator {
	
	private int memory;
	int value = 100;
	
	public int getMomory() {
		return this.memory;
	}
	
	//비동기화 메서드 -> 데이터의 신뢰성을 보장하기 위해서는 반드시 동기화처리가 필수다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		//1초간 일시정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.getMomory());
	}
	
	//비동기화 메서드이므로 어떤 스레드라도 얼마든지 접근이 가능하다.
	public void print() {
		System.out.println(Thread.currentThread().getName() + " value값 : " + this.value);
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
		}
	}
	
	

}
