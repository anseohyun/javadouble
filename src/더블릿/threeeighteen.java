//	���α׷� ��: factor
//	���ѽð�: 1 ��
//	
//	�־����� ���� ����� ����ϴ� �����̴�.
//	
//	�Է�
//	10000 ������ �ڿ����� �Է����� �־�����.
//	���
//	���� ������ �� �ٿ� �� ���� ����Ѵ�.
//
//	����� ��
//	�Է�
//	4
//	���
//	1 
//	2 
//	4
//	�Է�
//	6
//	���
//	1 
//	2 
//	3 
//	6

package ����;

import java.util.Scanner;

public class threeeighteen {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i = 1; i <= num ; i++)
		{
			if(num%i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
