//	���α׷� ��: cross(open)
//	���ѽð�: 1 ��
//	
//	���� ���� ������ ������ ���̶� �Ѵ�.
//	������ 1 ���� 100 ���� ������ �������� ���� �ο��Ǿ� �ִ�.
//	�� ���� ���� �־��� �� �� ���� �����ϴ��� �ƴ����� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	�Ʒ� �׸��� �� ���� �����ϴ� ����� ���̴�.
//	
//	�Է� ����
//	ù �ٿ��� �� ���� ������ ���� �ٿ��� �ٸ� �� ���� ������ �Էµȴ�. ���ڴ� 1 �̻� 100 ������ ���� �ٸ� �ڿ����̴�.
//	��� ����
//	�� ���� �����ϸ� cross ,�ƴϸ� not cross �� ����Ѵ�.
//	
//	����� ��
//	�Է� 
//	20 80
//	85 40
//	��� 
//	cross

package ����;

import java.util.Scanner;

public class twothirtyfour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[2];
		int arr2[] = new int[2];
		int big1, big2, small1, small2;
		
		
		for(int i = 0 ; i < 2 ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		for(int i = 0 ; i < 2 ; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		
		if(arr1[0] > arr1[1])
		{
			big1 = arr1[0];
			small1 = arr1[1];
		}
		else
		{
			big1 = arr1[1];
			small1 = arr1[0];
		}
		if(arr2[0] > arr2[1])
		{
			big2 = arr2[0];
			small2 = arr2[1];
		}
		else
		{
			big2 = arr2[1];
			small2 = arr2[0];
		}
		
		
		
		if(small1 > big2 || small2 > big1)
		{
			System.out.println("not cross");
		}
		else
		{
			if(big1 > big2)
			{
				if(small1 > small2)
				{
					System.out.println("cross");
				}
				else
				{
					System.out.println("not cross");
				}
			}
			else
			{
				if(small1 < small2)
				{
					System.out.println("cross");
				}
				else
				{
					System.out.println("not cross");
				}
			}
		}

	}

}
