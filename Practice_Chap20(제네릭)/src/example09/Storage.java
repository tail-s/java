package example09;
//인터페이스도 일종의 조상이기 때문이 인터페이스가 제네릭이면 구현 클래스도 제네릭이 되어야 한다.
public class Storage<T> implements Storable<T> {
	
	private T[] arr;
	
	public Storage(int size) {
		//this.arr = new T[size];
		this.arr = (T[])(new Object[size]);	//이런 방식 자주 사용
	}

	@Override
	public void add(T item, int index) {
		this.arr[index] = item;
		
	}

	@Override
	public T get(int index) {
		return this.arr[index];
	}
	
	public T[] getT() {
		return this.arr;
	}

}
