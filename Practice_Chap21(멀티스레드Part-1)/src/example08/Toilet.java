package example08;
//공유객체
public class Toilet {
	
	//플래그 변수
//	private boolean seat; 의미가 없어짐
	
	//메서드 잠금이 일어난다.
	public synchronized void use() throws Exception {
		
		String name = Thread.currentThread().getName();
		
		//누군가가 화장실에 들어갔을 때
//		if(this.seat == false) {
			System.out.println(name + "가/이 화장실에 입장하였습니다.");
			//this.seat = true; synchronized 적용하는 경우 이 코드는 필요가 없어진다.
			
			Thread.sleep(1000);
			System.out.println(name + "의 말 : 아 시원하다~~!");
			
			//this.seat = false; 마찬가지로 의미가 없어짐
			System.out.println(name + "가/이 화장실 사용을 마쳤습니다.");
			System.out.println();
//		}
//		else {	//마찬가지로 의미가 없어짐
//			System.out.println(name + "가/이 화장실 사용중입니다. 기다리세요!");
//		}		
		
	}
	
	//비동기화 메서드
	public void knock() {
		System.out.println(Thread.currentThread().getName() + " 똑똑!");
		
	}

}
