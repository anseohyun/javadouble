//	���α׷� ��: oddddo(open)
//	���ѽð�: 1 ��
//	
//	����� �ɽ��ؼ� ���̿� 1 ���� Ȧ���� ���ʷ� � ������ ������. ���� �ٿ��� �� ���� ���� �Ųٷ� ���� �� �Ʒ����� ������ ���� ���� ���ϱ �ñ��� ����.
//	3 ���� ���� �����ٸ�
//	1 3 5
//	5 3 1
//	------
//	5 9 5
//	���� 19 �̴�.
//	���� ���� �� ������ Ǯ���.
//	
//	�Է�
//	�ڿ��� N �� �Է����� �־�����. N �� �� ���� �����̴�. 1000 �� ���� �ʴ´�.
//	���
//	���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	3
//	���
//	19

package ����;

import java.util.Scanner;

public class threethirtynine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum = 0;
		arr[0] = 1;
		
		for(int i = 0 ; i < (num-1) ; i++)
		{
			arr[i+1] = arr[i] + 2;
		}
		
		int j = num - 1;
		for(int i = 0 ; i < num ; i++)
		{
			sum = sum + arr[i] * arr[j];
			j--;
		}
				
		System.out.println(sum);

	}

}
