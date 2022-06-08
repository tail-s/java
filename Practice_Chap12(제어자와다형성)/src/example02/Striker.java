package example02;
//자손 클래스
public class Striker extends Player {
	
	private int shoot;

	public Striker(String name, int age, int backNumber, int speed, int shoot) {
		super(name, age, backNumber, speed);	//Player의 생성자 호출
		this.shoot = shoot;
	}
	
	public int getShoot() {
		return this.shoot;
	}
	
	@Override
	public void info() {
		super.info();	//Player의 info를 호출
		System.out.println("유효 슛팅 : " + this.getShoot());
	}
	
	

}
