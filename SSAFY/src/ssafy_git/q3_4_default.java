package ssafy_git;

import java.io.FileInputStream;
import java.util.Scanner;
/**
 * üũ����Ʈ �Ǻ��ϱ�
 */ 
public class q3_4_default {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int t = 1; t <= TC; t++){
			int N = sc.nextInt(); // ü���� ũ�� ����
			int colKing = sc.nextInt(); // ŷ�� ����(��) ��ǥ
			int rowKing = sc.nextInt(); // ŷ�� ����(��) ��ǥ
			int colQueen = sc.nextInt(); // ���� ����(��) ��ǥ
			int rowQueen = sc.nextInt(); // ���� ����(��) ��ǥ
			int ans = 0; // ���� ���� ����, �����ϸ� 1, �Ұ����ϸ� 0
			
			// ���� ���� ���� ���� ���� üũ
			// ���� �࿡ ���� �ִٸ� ���� ����
			if(rowKing == rowQueen) ans = 1;
			
			// ���� ���� ���� ���� ���� üũ
			// ���� ���� ���� �ֵ��� ���� ����
			if(colKing == colQueen) ans = 1;
			
			// �밢�� ���� ���� ���� ���� üũ
			// ����� ����: ���� ��ǥ�� ���� ��ǥ�� ���ؼ� ���� ���̸�
			// ���� �밢���� ���� ����
			if(colKing + rowKing == colQueen + rowQueen) ans = 1;
			
			// ������ ����: ���� ��ǥ�� ���� ��ǥ�� ���� ���� ���̸�
			// ���� �밢���� ���� ����
			if(colKing - rowKing == colQueen - rowQueen) ans = 1;
			

			System.out.println("#"+t+" "+ans);
		}
	}
}