//	���α׷� ��: max
//	���ѽð�: 1 ��
//	7 ���� ���� �Է����� �޾� �Է� ���� �� �� �ִ밪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	7 ���� ���� 100 ������ �ڿ����̴�.
//	���
//	�ִ밪
//
//	����� ��
//	�Է�
//	6 2 9 8 3 4 7
//	���
//	9

package ����;

import java.util.Scanner;

public class threenine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i=0 ; i < 7 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		
		for(int j = 1 ; j < 7 ; j++)
		{
			if(max<arr[j])
			{
				max = arr[j];
			}
		}
		
		System.out.println(max);
		

	}

}
