//	���α׷� ��: adigit
//	���ѽð�: 1 ��
//	
//	�� �ڸ� ������ ���ڸ��� ������ �� , �� �ڸ� ������ ���ڸ� ���� , �� �ڸ� ������ ���ڸ� ������ ���� ���ϴ� �����̴�.
//	
//	�Է�
//	�Է��� 7 �� �̰� , �� ���� 999 ������ ���� �����̴�.
//	���
//	�� ���� ��µȴ�. ���� ���ڸ� ����,���ڸ� ����,���ڸ� ���������� ���̴�.
//	
//	����� ��
//	�Է�
//	1 10 100 2 20 300 1
//	���
//	4 30 400

package ����;

import java.util.Scanner;

public class threeseven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i = 0 ; i<7 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int num0 = 0;
		int num00 = 0;
		int num000 = 0;
		
		for(int j = 0; j < 7 ; j++)
		{
			if(arr[j] < 10)
			{
				num0 = num0 + arr[j];
			}
			else if(arr[j] < 100)
			{
				num00 = num00 + arr[j];	
			}
			else if(arr[j] < 1000)
			{
				num000 = num000 + arr[j];
			}
	
		}
	
		System.out.println(num0 + " " + num00 + " " + num000);
	}
}
