//	���α׷� ��: eva
//	���ѽð�: 1 ��
//	
//	���� ����
//	���� �׿��� ������ ��( ���� )�� ���ؼ� ���� ���� �����Ǵ� ����
//	��)
//	1 , 2 , 3 , 4 ...  ����: 1
//	1 , 3 , 5 , 7 .... ����: 2
//	 ������
//	���� �׿��� ������ ��( ���� ) ���� ���ϸ� ���� ���� �������� ����
//	��)
//	1 , 2 , 4 , 8 , ... ����: 2
//	2 , 6 , 18 , 54 , .. ����: 3
//	�� �� ���� �Է����� �־�����.
//	
//	�Է�
//	�� �ٴ� 4 ���� �ڿ����� �Է����� �־�����. �� ���� ���� ���� Ȥ�� ��� �����̰� �������� ��� ����� �ڿ����̴�.
//	���
//	���� ������ ���� ���� ���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	1 2 3 4
//	���
//	1 2 3 4 5
//	�Է�
//	1 2 4 8
//	���
//	1 2 4 8 16

package ����;

import java.util.Scanner;

public class twothirtyone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[4];
		
		for(int i = 0 ; i < 4 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		if(arr[3] - arr[2] == arr[2] - arr[1] && arr[2] - arr[1] == arr[1] - arr[0])
		{
			for(int i = 0 ; i < 4 ; i++)
			{
				System.out.print(arr[i] + " ");
				
			}
			System.out.print(arr[3] + (arr[3]-arr[2]));
		}
		
		else if(arr[3]/arr[2] == arr[2]/arr[1] && arr[2]/arr[1] == arr[1]/arr[0])
		{
			for(int i = 0 ; i < 4 ; i++)
			{
				System.out.print(arr[i] + " ");
				
			}
			System.out.print(arr[3] * (arr[3]/arr[2]));
		}
	}

}
