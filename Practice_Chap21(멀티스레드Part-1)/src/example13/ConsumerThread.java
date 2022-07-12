package example13;

public class ConsumerThread extends Thread {
	//공유객체 선언
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.setName("ConsuemrThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			String data = this.dataBox.getData();	//데이터를 소비
//			System.out.println("가져온 데이터 : " + data); 동기화 처리가 안돼있잖아! 찍으면 안됨.
		} 
	}

}
