//	���α׷� ��: whatisn
//	���ѽð�: 1 ��
//	
//	��Ż���� �հ��� ���� ������ �ϰ� �ִ�.
//	���� �ƹ����� �׳࿡�� n (1 , 2 ... , 10) ���� ���� ���ϸ� �׳�� �ƹ������� �ٽ� ���Ѵ�. "�ƹ��� n �� ����?" �ƹ����� �� �հ����� ������ �� ���� �����.
//	������ ������ �ϱ� ���Ͽ� ������ ���� ��Ģ�� ����ϴ� ��� ǥ���� �� �ִ� ����� ��� �ϱ�?
//	�� �� Ȥ�� �� ���� ����� �� �ִ�.
//	�� ���� ����Ѵٸ� ū ���� ù ��°�� ��Ÿ���� �Ѵ�.
//	���� ��� 4 �� ��� ���� �� �ִ� ����� 3 ���� �̴�.
//	4
//	3 , 1
//	2 , 2
//	
//	�Է�
//	1 ���� 10 ���� �� �� ���� �־�����.( 1 , 10 ���� )
//	���
//	���� ���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	4
//	���
//	3

package ����;

import java.util.Scanner;

public class twonineteen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int right;
		int left;
		int repeat = 0;
		
		if(num <=  5)
		{
			right = 0;
			left = num - 0;
			
			for(int i = 0 ; i <= num ; i++)
			{
				
				if(right > left)
				{
					System.out.println(repeat);
					break;
				}
				right++;
				left--;
				repeat++;
			}
		}
		else
		{
			right = num - 5;
			left = 5;
			for(int i = 0 ; i <= num ; i++)
			{
				
				if(right > left)
				{
					System.out.println(repeat);
					break;
				}
				right++;
				left--;
				repeat++;
			}
		}	

	}

}
