//	���α׷� ��: coci_tablica
//	���ѽð�: 1 ��
//	�丮ī�� ������ �� �Ѵ�. �� ���� �ϳ��� ������ ���ϱ�� �������̴�. �׸� ���� ���� �������� ������ ���� ������ �����ߴ�.
//	
//	2�� 2�� ���̺��� �־����� 4 ���� ���� A,B,C,D �� �־�����.
//	�� ���̺��� ���� ������ ���� ����Ѵ�.
//	a/c + b/d
//	������ �ð� ���� 90 �� �� ȸ���ϸ鼭 ���̺��� ���� ���� �� ���� ū ���� ������� �ּ� ȸ�� ���� ���ϴ� ���̴�.
//	������ 90 �� ȸ�� �ϴ� ����� �׸��̴�.
//	
//	�Է�
//	ù �ٿ��� A,B ��
//	�� ��° �ٿ��� C,D �� �־�����.
//	�� ���� �����̰� 100 �� ���� �ʴ´�.
//	���
//	�ּ� ȸ�� ���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	1 2
//	3 4
//	���
//	2
//	�Է�
//	5 9
//	7 2
//	���
//	0
//	�Է�
//	41 99
//	100 13
//	���
//	1


package ����;

import java.util.Scanner;

public class twotwentyfive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		double num[] = new double[4];
		
		num[0] = a/c + b/d;
		num[1] = c/d + a/b;
		num[2] = d/b + c/a;
		num[3] = b/a + d/c;
		
		double max = num[0];
		
		for(int i = 1 ; i < 4  ; i++)
		{
			if(max<=num[i])
			{
				max = num[i];
			}
		}
		
		if(max == num[0])
		{
			System.out.println(0);
		}
		else if(max == num[1])
		{
			System.out.println(1);
		}
		else if(max == num[2])
		{
			System.out.println(2);
		}
		else
		{
			System.out.println(3);
		}

	}

}
