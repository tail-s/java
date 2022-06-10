package example01;

//추상클래스란? 1개 이상의 추상메서드를 포함하는 클래스
//추상클래스는 인스턴스를 절대 생성할 수 없다. 추상메서드는 선언부만 존재하고 구현부가 없는 것.
public abstract class ContentSender {
	
	private String title;
	private String name;
	
	//생성자
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
	
	//private 접근제어자를 주면 상속하여 오버라이딩 할 수 없기 때문에 public으로 준다.
	//추상메서드 -> 상속을 통해 반드시 재정의가 되어야 비로소 인스턴스를 생성할 수 있다.
	public abstract void sendMessage(String content);
	
	

}
