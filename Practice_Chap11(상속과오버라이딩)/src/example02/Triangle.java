package example02;

public class Triangle extends Shape {
	
	Point[] p;	//객체배열
	
	public Triangle() {
		this(new Point(0,0), new Point(50,50), new Point(100,100));
	}
	
	public Triangle(Point p1, Point p2, Point p3) {
		System.out.println("Triangle의 매개변수 3개 호출됨");
		this.p = new Point[] { p1, p2, p3 };
	}
	
	public Triangle(Point[] p) {
		System.out.println("Triangle의 매개변수 p 호출됨");
		this.p = p;
	}
	
	@Override
	public void draw() {
		System.out.println("[p1] : " + this.p[0].x + ", " + this.p[0].y);
		System.out.println("[p2] : " + this.p[1].x + ", " + this.p[1].y);
		System.out.println("[p3] : " + this.p[2].x + ", " + this.p[2].y);
	}

}
