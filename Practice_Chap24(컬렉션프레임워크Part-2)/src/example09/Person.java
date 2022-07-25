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

	//���� ����
//	@Override
//	public int compareTo(Person o) {
////		if(this.age < o.age)	//�ε�ȣ�� �ٲٸ� �������� - �������� ���� ����.
////			return -1;		
////		else if(this.age == o.age)
////			return 0;
////		else
////			return 1;
//		
//		return this.age - o.age;	//���ؼ� ������, ��������� ���ϰ� ��. �� �ڵ���� �� �ٷ� ���� �� ����.
//	}
	
	//�̸� ����
	@Override
	public int compareTo(Person o) {
//		if(this.name.compareTo(o.name) < 1)
//			return -1;		
//		else if(this.name.compareTo(o.name) < 0)
//			return 0;
//		else
//			return 1;
		
		return this.name.compareTo(o.name) - o.name.compareTo(this.name);	//���������� ���� �� ����
	}
	

}
