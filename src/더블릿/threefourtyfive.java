//	���α׷� ��: fou(open,special judge)
//	���ѽð�: 1 ��
//	
//	���� ������ �̷�� �� ���� �־�����. �׷��� �� �� �� �� ���� �ؾ� ���ȴ�. �� ���� ���ϴ� �� �����̴�.
//	���� �������� ���� �� ������ ���� �Ѵٴ� ���� ���� �ȴ�.
//	
//	�Է�
//	�� ���� �Է����� �־�����. �� ���� -100 �̻� 100 ������ ���̴�.
//	���
//	�ؾ� ���� �� ���� ��� �Ѵ�.
//	
//	����� ��
//	�Է�
//	4 6 8 
//	���
//	10
//	�Է�
//	10 1 4 
//	���
//	7

package ����;

import java.util.Scanner;

public class threefourtyfive {

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
				if(arr[j+1] < arr[j])
				{
					int a;
					a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
				}
			}
		}
		
		if(arr[2] - arr[1] == arr[1] - arr[0])
		{
			System.out.println(arr[2]+(arr[1] - arr[0]));
		}
		else if((arr[2] - arr[1]) > (arr[1] - arr[0]))
		{
			System.out.println(arr[2] - (arr[1] - arr[0]));
		}
		else
		{
			System.out.println(arr[1] - (arr[2] - arr[1]));
		}
		
	}

}
