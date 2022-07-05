package example07;

public class Course<T> {
	
	private String name;
	private T[] students;
	
	@SuppressWarnings("unchecked")
	public Course(String name, int size) {
		super();
		this.name = name;
		
		//아직 T타입이 결정되지 않았기 때문에 배열을 생성할 수 없다.
		this.students = (T[])new Object[size];
	}
	
	public void add(T t) {
		for(int i=0; i<this.students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}
	
	
	

}
