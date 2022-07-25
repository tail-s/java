package example09;

public class Person implements Comparable<Person>{


	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	//나이 정렬
//	@Override
//	public int compareTo(Person o) {
////		if(this.age < o.age)	//부등호만 바꾸면 오름차순 - 내림차순 변경 가능.
////			return -1;		
////		else if(this.age == o.age)
////			return 0;
////		else
////			return 1;
//		
//		return this.age - o.age;	//비교해서 음수값, 양수값으로 비교하게 됨. 위 코드들을 한 줄로 줄일 수 있음.
//	}
	
	//이름 정렬
	@Override
	public int compareTo(Person o) {
//		if(this.name.compareTo(o.name) < 1)
//			return -1;		
//		else if(this.name.compareTo(o.name) < 0)
//			return 0;
//		else
//			return 1;
		
		return this.name.compareTo(o.name) - o.name.compareTo(this.name);	//마찬가지로 줄일 수 있음
	}
	

}
