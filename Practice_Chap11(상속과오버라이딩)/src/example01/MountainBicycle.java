package example01;

//상속을 하는 이유
//1. 공통된 코드는 조상에서 관리
//2. 개별적인 부분은 자손에서 따로 관리
//3. 코드의 재사용성

//상속은 직접적 관리
public class MountainBicycle extends Bicycle {
	
	//멤버 개수 : 5개
	String frame;
	int gear;
	int price;
	
	public void print() {
		System.out.println("id : " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("frame : " + this.frame);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("owner : " + this.owner);
	}
	
	public static void main(String[] args) {
		MountainBicycle mb = new MountainBicycle();
		mb.id = 1111;
		mb.brand = "LESPO";
		mb.frame = "카본";
		mb.gear = 10;
		mb.price = 150000;
		mb.owner = "kim";
		
		mb.print();				
		
	}
}
