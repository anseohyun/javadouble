//	���α׷� ��: min
//	���ѽð�: 1 ��
//
//	7 ���� ���� �Է����� �޾� �Է� ���� �� �� �ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	7 ���� ���� 100 ������ �ڿ����̴�.
//	���
//	�ּҰ�
//
//	����� ��
//	�Է�
//	6 2 9 8 3 4 7
//	���
//	2

package ����;

import java.util.Scanner;

public class threeten {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i = 0 ; i < 7 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		int min = arr[0];
		
		for(int j = 1; j < 7 ; j++)
		{
			if(min>arr[j])
			{
				min = arr[j];
			}
		}
		
		System.out.println(min);

	}

}
