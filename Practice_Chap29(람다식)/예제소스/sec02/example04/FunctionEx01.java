package sec02.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx01 {

	//ArraysŬ������ asList()�� �Ű������� ������ ��ü�� �� ������ ����� �ؼ� List<T>���� �����Ѵ�.
	private static List<Student> list = Arrays.asList(
			new Student("������", "�뱸", 100, 95),
			new Student("�迬��", "����", 90, 98),
			new Student("������", "����", 80, 92),
			new Student("���־�", "�λ�", 81, 99)			
	);	
	
	public static void main(String[] args) {
		
		Function<Student, String> function = t -> { return t.getAddress(); };
		printString(function);
		
		ToIntFunction<Student> toIntFunction = t -> { return t.getEnglishScore(); };
		intPrint(toIntFunction, "����");
		
		ToIntFunction<Student> toIntFunction2 = t -> { return t.getMathScore(); };
		intPrint(toIntFunction2, "����");
	}	
	//Function<T,R>�Լ��� �������̽��� T�� �Ű������� �Ͽ�, R�� �����Ͽ� �����ϴ� �������̽��̴�.
	//���⼭�� �� printString�� �Ű����� Ÿ���� Function<T,R>�Լ��� �������̽��̴�.
	//�� ���� ��, Function<T,R>�Լ��� �������̽��� ������ ���ٽ��� �Ѱ��־�� �Ѵ�.
    public static void printString(Function<Student, String> function) {
    
    	for(Student student : list) {
    		String str = function.apply(student);
    		System.out.print("�ּ� : " + str + "\t");    		
    	}
    	System.out.println();
    	
    }   
    
    public static void intPrint(ToIntFunction<Student> function, String str) {
        
    	for(Student student : list){
			int score = function.applyAsInt(student);
			System.out.print(str + "���� : " + score + "\t");
		}
		System.out.println();    	
    }
}
