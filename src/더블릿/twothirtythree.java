//	���α׷� ��: tpz(open)
//	���ѽð�: 1 ��
//	
//	10 ���� ������� ��Ÿũ����Ʈ ���� ��ȣ�� ���� �ߴ���
//	�׶� : 8
//	�����佺 : 7
//	���� : 9
//	��� ������ �����ϴ� ������ �ִ� �ο��� �ּ� �ο��� ���ϴ� ���� �����̴�.
//	�ִ� �ο��� 7 , �Ʒ� ���̺��� ������ �� ����� ���̴�.(1,2,3,4,5,6,7)
//			1	2	3	4	5	6	7	8	9	10
//	�׶�		v	v	v	v	v	v	v	v		
//	�����佺		v	v	v	v	v	v	v			
//	����		v	v	v	v	v	v	v	v	v	
//	�ּ� �ο��� 4 �� �̰� ������ �� ���(4,5,6,7) �� ���̴�.
//			1	2	3	4	5	6	7	8	9	10
//	�׶�		v	v	v	v	v	v	v	v		
//	�����佺				v	v	v	v	v	v	v
//	����		v	v	v	v	v	v	v		v	v
//	
//	�Է�
//	ù �ٿ����ο� �� N (100 ����) �� �־����� ���� �ٿ��� �� ���� ������ �־�����. �� ���� N �� ���� �ʴ´�.
//	���
//	�� �ٿ� �ִ� , �ּ� �ο����� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	10
//	8 7 9
//	���
//	7 4

package ����;

import java.util.Scanner;

public class twothirtythree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int P = sc.nextInt();
		int J = sc.nextInt();
	
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if(T >= P && T>= J)
		{
			if(P >= J)
			{
				mid = P;
				min = J;
			}
			else
			{
				mid = J;
				min = P;
			}
			max = T;
		}
		else if(P >= T && P>= J)
		{
			if(T >= J)
			{
				mid = T;
				min = J;
			}
			else
			{
				mid = J;
				min = T;
			}
			max = P;
		}
		else if(J >= T && J>= P)
		{
			if(T >= P)
			{
				mid = T;
				min = P;
			}
			else
			{
				mid = P;
				min = T;
			}
			max = J;
		}

		System.out.print(min + " ");
		if((-(N-(min+mid))-(N-max))  < 0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(-(N-(min+mid))-(N-max));
		}
		
	}
}
