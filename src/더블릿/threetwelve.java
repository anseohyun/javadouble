//	���α׷� ��: sb
//	���ѽð�: 1 ��
	
//	���� �� ������ �������� , ���� �������� ��� �� ���� ���ʽ��� �����ϱ�� �߽��ϴ�.
//	��� 7 �� , �� ��κ��� ��Ȯ�� ���� �ٱ����� ���� �Է� �޾Ƽ� ���� �������� ��� ��ȣ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
//	�Է�
//	7 ���� ��ΰ� ��Ȯ�� ���� �ٱ��� ���� �Է����� �־�����. �� ���� 100 ������ �ڿ����̰� ���� ���� �Է����� �־����� �ʴ´�.
//	�ԷµǴ� ������� 1 ����� , 2 �� , 3 �� ...
//	���
//	���� �������� ��� ��ȣ�� ����Ѵ�.
	
//	����� ��
	
//	�Է�
//	6 2 9 8 1 4 7
//	���
//	3

package ����;

import java.util.Scanner;

public class threetwelve {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int[7];
		int best;
		int best_num = 1;
		
		for(int i = 0 ; i<7;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		best = arr[0];
		
		int j;
		
		for(j = 1 ; j<=7 ; j++)
		{
			if(best < arr[j-1])
			{
				best = arr[j-1];
				best_num = j;
			}
		}
		
		System.out.println(best_num);

	}

}
