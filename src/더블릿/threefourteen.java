//	���α׷� ��: odd
//	���ѽð�: 1 ��

//	7���� �ڿ����� �־��� ��, �̵� �� Ȧ���� �ڿ������� ��� ��� �� ���� ���ϰ�, �� Ȧ���� �� �ּҰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
//	���� ���, 7���� �ڿ��� 12, 77, 38, 41, 53, 92, 85�� �־����� �̵� �� Ȧ���� 77, 41, 53, 85�̹Ƿ� �� ����
//	77 + 41 + 53 + 85 = 256 �� �ǰ�,
//	41 < 53 < 77 < 85 �̹Ƿ� Ȧ���� �� �ּҰ��� 41 �� �ȴ�.
//	�Է�
//	ù ° �ٺ��� �ϰ� ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 �����̴�.
//	���
//	Ȧ���� �������� �ʴ� ��쿡�� ù° �ٿ� -1 �� ����Ѵ�. Ȧ���� �����ϴ� ��� ù° �ٿ� Ȧ������ ���� ����ϰ�, ��° �ٿ� Ȧ���� �� �ּҰ��� ����Ѵ�.

//	����� ��

//	�Է�
//	12
//	77
//	38
//	41
//	53
//	92
//	85
//	���
//	256
//	41

package ����;

import java.util.Scanner;

public class threefourteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		int min = 100;
		int sum = 0;
		int even_number = 0;
		
		
		for(int i = 0; i < 7 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0 ; j<7 ; j++)
		{
			if(arr[j]%2 == 1)
			{
				if(arr[j] < min)
				{
					min = arr[j];
				}
				sum = sum + arr[j];
			}
			else
			{
				even_number++;
			}
		}
		
		if(even_number != 7)
		{
			System.out.println(sum);
			System.out.println(min);
		}
		else
		{
			System.out.println(-1);
		}

		
	}

}
