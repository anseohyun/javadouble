//	���α׷� ��: seq2
//	���ѽð�: 1 ��

//	�� N �� �Է����� �޾ ��� ���� �������� ���� ���ϴ� ���α׷��̴�.

//	�Է�
//	�� N �� �Է����� �־�����. N �� 1000 ������ �ڿ����̴�.
//	���
//	��� ���� �������� ����Ѵ�.

//	����� ��

//	�Է�
//	5

//	���
//	1..1 1
//	1..2 3
//	1..3 6
//	1..4 10
//	1..5 15


package ����;

import java.util.Scanner;

public class threesix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= num ; i++)
		{
			for (int j = 0 ; j <= i ; j++)
			{
				sum = sum +j;
			}
			
			System.out.println(1 + ".." + i + " " + sum);
			sum = 0;
		}

	}

}
