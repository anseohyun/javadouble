//	���α׷� ��: tri
//	���ѽð�: 1 ��
//	
//	�� ������ �Է� �޾� �� ���� �ﰢ���� ���� �� �ִ����� �Ǵ��ϴ� ���α׷��� �ۼ��ϴ� ���� �����̴�.
//	
//	�Է�
//	�� ���� ������ �Է����� �־�����. �� �� ��� 100000 �����̴�.
//	���
//	�����ϸ� yes , �ƴϸ� no �� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	2 3 5
//	���
//	no
//	�Է�
//	4 5 6
//	���
//	yes
//	
//	����
//	�ﰢ���� �̷�� ���� ���ؼ��� ���� ū ���� ���̰� ������ �� ���� ������ �� ���� �۾ƾ� �Ѵ�.

package ����;

import java.util.Scanner;

public class twotwentyseven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		int big;
		int small1;
		int small2;
		
		for(int i = 0 ; i < 3 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		if(arr[0] > arr[1])
		{
			if(arr[0] > arr[2])
			{
				big = arr[0];
				small1 = arr[1];
				small2 = arr[2];
			}
			else
			{
				big = arr[2];
				small1 = arr[0];
				small2 = arr[1];
			}
		}
		else
		{
			if(arr[1] > arr[2])
			{
				big = arr[1];
				small1 = arr[0];
				small2 = arr[2];
			}
			else
			{
				big = arr[2];
				small1 = arr[1];
				small2 = arr[0];
			}
		}
		

		if(big < (small1 + small2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
