//	���α׷� ��: med
//	���ѽð�: 1 ��
//	
//	�� ������ �Է����� �޾� �� ���� ũ�� ������ ������ �� �߰��� ��ġ�� ��(������)�� ���ϴ� �����̴�.
//	�Է�
//	1000 ������ �ڿ����� �Է����� �־�����. �� ���� ��� ���� �� �� �ִ�.
//	���
//	
//	����� ��
//	�Է�
//	1 5 2
//	���
//	2
//	�Է�
//	2 2 2
//	���
//	2
//	�Է� 
//	2 5 2
//	���
//	2

package ����;

import java.util.Scanner;

public class twoseventeen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		
		for(int i = 0 ; i < 3 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j = 0 ; j < 2 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int blank;
					blank = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = blank;
				}
			}
		}
		
		System.out.println(arr[1]);
		
	}
}
