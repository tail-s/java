package sec02.example04;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class PopulationEx {

	public static ArrayList<Population> populations = new ArrayList<Population>();
		
	public static void main(String[] args) {
	
		//Population��ü �߰�
		populations.add(new Population("���� ������", 156800));
		populations.add(new Population("���� ������", 10800));
		populations.add(new Population("���� ���α�", 78800));
		populations.add(new Population("���� ��������", 126800));
		
		//Function<T,R>�� �̿��ؼ� Population��ü�� �ְ�, ������ ���ϹްԲ� �ϰ� �ִ�.
		Function<Population, String> function = t -> { return t.getRegion(); };
		regionPrint(function);

		//ToDoubleFunction<Population>�� �̿��Ͽ� ���ٽ����� �α����� �����ϰ� ����� �ִ�.
		ToDoubleFunction<Population> toDoubleFunction = t -> { return t.getPopulation(); };
		avgPrint(toDoubleFunction);
	}
	
	//������ ���
	public static void regionPrint(Function<Population, String> function) {
		for(Population population : populations) {
			String region = function.apply(population);
			System.out.print("���� : " + region + "\t");
		}
		System.out.println();
	}
	//�� ������ �α��� ��� �� ��� �α����� ���
	public static void avgPrint(ToDoubleFunction<Population> toDoubleFunction) {
		double sum = 0.0;
		
		for(Population population : populations) {
			double value = toDoubleFunction.applyAsDouble(population);
			System.out.print("�α��� : " + value + "\t");
			sum += value;
		}
		System.out.println();
		System.out.println("���� ��� �α��� : " + (sum/populations.size()) + "��");	
	}
}