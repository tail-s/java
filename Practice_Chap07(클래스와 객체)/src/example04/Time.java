package example04;

public class Time {
	
	//접근제어자(Access Modifier)의 종류
	//private : 같은 클래스 내에서만 접근 가능함.
	//protected : 같은 패키지, 자손 클래스에서만 접근 가능함.
	//default : 같은 패키지에서만 접근 가능함.
	//public : 누구나 다 접근 가능함.
	
	//아무것도 안붙이면 기본으로 default 접근제어자이나 default라고 명시할 경우 문법오류.
	
	private int hour;	
	private int minute;
	private int second;
	
	//getter()
//	public int getHour() {
//		return this.hour;
//	}
	
	//Source탭 -> Generate Getters and Setters -> 원하는 멤버변수를 체크 후 자동완성
	
	//getter() : 멤버변수의 값을 읽어가는 메서드
	//setter() : 멤버변수의 값을 수정하는 메서드
	public int getHour() {
		//return hour;
		return this.hour;
	}
	public void setHour(int hour) {
		//시에 대한 예외처리 코드를 작성
		if(hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		else {
			this.hour = hour;
		}		
	}
	public int getMinute() {
		//return minute;
		return this.minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		}
		else {
			this.minute = minute;
		}		
	}
	public int getSecond() {
		//return second;
		return this.second;	
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("초를 잘못 입력하셨습니다.");
			return;
		}
		else {
			this.second = second;
		}		
	}	
	
	@Override
	public String toString() {
		return this.getHour() + "시 " + this.getMinute() + "분 " + this.getSecond() + "초";
	}
}
