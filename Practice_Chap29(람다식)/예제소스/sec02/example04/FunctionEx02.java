package sec02.example04;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class FunctionEx02 {

	public static ArrayList<Student> arrayList = new ArrayList<Student>();
	
	public static void main(String[] args) {
		
		arrayList.add(new Student("ȫ�浿", "�뱸", 100, 80));
		arrayList.add(new Student("������", "����", 90, 88));
		arrayList.add(new Student("�迬��", "����", 77, 100));
		
		//��������� � �޼��带 ȣ���ϴ��Ŀ� ���� ������ �޶����� Ȯ���Ҽ� �־�� �Ѵ�.(����)
		ToIntFunction<Student> toIntFunction1 = t -> { return t.getEnglishScore(); };
		//�Ű������� applyAsInt()�߻�޼����� ��ü ���ٽ��� ������ toIntFunction1�����ϰ� �ִ�.
		average(toIntFunction1, "����");
		
		//����
		ToIntFunction<Student> toIntFunction2 = t -> { return t.getMathScore(); };
		average(toIntFunction2, "����");
	}
	
	//average()���� �Ű�����Ÿ���� ToIntFunction<Student>�� ������ ��ü�� �Ѿ�;� ��.
	public static void average(ToIntFunction<Student> function, String str) {		
		int sum = 0;
		double avg = 0.0;
		
		for(Student student : arrayList) {
			int score = function.applyAsInt(student);
			sum += score;
		}
		avg = (double)sum / arrayList.size();
		System.out.println(str + "���� ��� : " + avg);
		System.out.println();		
	}
}