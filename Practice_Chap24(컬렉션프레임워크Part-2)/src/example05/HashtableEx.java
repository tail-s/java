package example05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx {

	public static void main(String[] args) {
		
		//HashMap : �Ź���
		//HashTable : ������
		//����� �����ϴ�.
		
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12");
		System.out.println("�� Entry �� : " + map.size());
		
		int cnt = 0;	//��й�ȣ Ʋ�� Ƚ��
		
		//��ü �˻�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���.");
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.println();
			
			//����Ǿ� �ִ� ��ü�� �˻��Ͽ�(������ DB��� ��������) ���̵�� ��й�ȣ�� ��ġ�ϸ� �α��� ����
			if(map.containsKey(id)) {
				//id ��, Ű�� �ְ� ������ ���� password�̱⿡, ���ٸ� �α��� ����, �ƴϸ� ��й�ȣ�� ����ġ. ��, Ʋ�� Ƚ�� 1 ����.
				if(map.get(id).equals(password)) {
					System.out.println(id + "���� �α��� �Ǿ����ϴ�.");
					break;
				}
				else {
					cnt++;
					System.out.println("��й�ȣ�� " + cnt + "ȸ Ʋ�Ƚ��ϴ�.");
					if(cnt == 3) {
						System.out.println("��й�ȣ�� " + cnt + "ȸ Ʋ�Ƚ��ϴ�. ���� �湮 ��Ź�帳�ϴ�.");
						break;
					}
				}
			}
			else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
		}
		
		
		sc.close();
		

	}

}
