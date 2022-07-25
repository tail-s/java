package example04;

import java.util.Objects;

public class Student {
	
	private int sno;	//�й�
	private String name;	//�̸�
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.sno, this.name);
	}
	
//	@Override
//	public int hashCode() {
//		return this.sno + this.name.hashCode();
//	}	����ȣȯ�� ���� ���
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return this.sno == student.sno && this.name.equals(student.name);
		}
		return false;
	}

}
