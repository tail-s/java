package sec02.example06;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx {
	
	public static ArrayList<Student> arrayList = new ArrayList<Student>();
	
	public static void main(String[] args) {
		//��ü�� �߰�
		arrayList.add(new Student("�赿��", "����", 20));
		arrayList.add(new Student("�̹α�", "����", 60));
		arrayList.add(new Student("�迬��", "����", 100));
		arrayList.add(new Student("������", "����", 100));
		arrayList.add(new Student("ȫ�浿", "����", 80));		
		
		//Predicate<T>�Լ��� �������̽��� test()�� �߻�޼����� ��ü�� ���ٽ����� �Ʒ��� ���� �͸����߰�
		//�����̳� �����̳Ŀ� ���� ���� �޶����� ���� Ȯ���� ���� �ִ�.
		Predicate<Student> predicateMale = t -> { return t.getSex().equals("����"); };

		double male = avg(predicateMale);
		System.out.println("���� ��� �� : " + male);
		
		Predicate<Student> predicateFeMale = t -> { return t.getSex().equals("����"); };

		double female = avg(predicateFeMale);
		System.out.println("���� ��� �� : " + female);		
	}
	//Predicate<T>�Լ��� �������̽��� test()�� �߻�޼��带 ������ �ִ�.
	//�ƿ﷯, �Ű������� Predicate<Student>�̴�.�Ͽ� ȣ���ϴ� ��������
	//Predicate<Student>�� �߻�޼��� test()������ ��ü�� �޾ƾ� �ϴ� ���̴�.
	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum =0;
		
		for(Student student : arrayList) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double)sum/count;
	}
}