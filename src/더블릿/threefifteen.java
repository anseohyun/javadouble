//	���α׷� ��: 1ton
//	���ѽð�: 1 ��
//	
//	�ڿ����� �Է����� �޾� 1 ���� n ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	3 �� �Է����� ������
//	1 + 2 + 3 = 6
//	6 �� ����Ѵ�.
//	
//	�Է�
//	1000 ������ �ڿ����� �Է����� �־�����.
//	���
//	1���� n������ ��
//	
//	����� ��
//	�Է�
//	5
//	���
//	15


package ����;

import java.util.Scanner;

public class threefifteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		int sum = 0;
		
		for(int i = 1;i <= num ; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}

}
