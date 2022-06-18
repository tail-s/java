package example03;

//클래스의 복제가 가능하게 하려면, java.lang.cloneable 인터페이스를 구현해야 한다.
public class Product implements Cloneable {
	
	private String id;
	private String name;
	private int price;
	private int[] arr;
	
	public Product(String id, String name, int price, int[] arr) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr = arr;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int[] getArr() {
		return this.arr;
	}
	
	@Override
	public String toString() {
		return "상품ID : " + this.getId() + "\n" +
				"상품이름 : " + this.getName() + "\n" +
				"상품가격 : " + this.getPrice();
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		
//		return super.clone();
//	}
	
	public Product getProduct() {
		
		Product cloned = null;
		try {
			//얕은 복제가 여기서 일어난다. (참조변수의 값들은 번지 공유)
			cloned = (Product)this.clone();	//여기서의 clone()은 Object클래스 소속
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}

}
