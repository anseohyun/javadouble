//	���α׷� ��: sum
//	���ѽð�: 1 ��

//	7 ���� �ڿ����� �Է����� �޾� �� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

//	�Է�
//	7 ���� ���� �Է����� �־�����.
//	�� ���� 100 ������ �ڿ����̴�.
//	���
//	������ ��

//	����� ��
//
//	�Է�
//	6 2 9 8 3 4 7
//	���
//	39

package ����;

import java.util.Scanner;

public class threefive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i = 0; i<7 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int j = 0; j<7 ;j++)
		{
			sum = sum + arr[j];
		}
		
		System.out.println(sum);

	}

}
