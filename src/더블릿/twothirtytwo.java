//	���α׷� ��: reduction
//	���ѽð�: 1 ��
//	
//	560 * 400 �и����� �̹����� ǥ�� ����( 218 * 280 mm) �� �����Ϸ��� �Ѵ�.
//	�� ������ ��� ����� �־� ������ �°� ������ ũ�� �����Ϸ��� �ϴ� ��� 50 % ��� �����ϸ� �ȴ�. ���� 90 �� ȸ�� �Ҽ��� �ִ�.( ���彺������ ���)
//	������ ������ �̹����� ��������� �־��� �� �� �̹����� ��������� �߸��� ���� �ִ�� �ֱ� ���� ���� ��� % �� ���ϴ� �����̴�.
//	
//	�Է�
//	4 ���� ������ �Է����� �־�����. ó�� �� ���� ������ �̹����� ũ���̰� ���� �� ���� ��������� ũ���̴�.
//	���
//	���� 1 ���� 100% ������ �����̴�.
//	
//	����� ��
//	�Է�
//	560 400 218 280
//	���
//	50%
//	�Է�
//	10 25 88 10
//	���
//	100%
//	�Է�
//	8 13 5 1
//	���
//	12%
//	�Է�
//	199 333 40 2
//	���
//	1%

package ����;

import java.util.Scanner;

public class twothirtytwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextInt();
		double B = sc.nextInt();
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		if(A>B)
		{
			if(a>b)
			{
			}
			else
			{
				double swi;
				swi = a;
				a = b;
				b = swi;
			}
		}
		else
		{
			if(a>b)
			{
				double swi;
				swi = A;
				A = B;
				B = swi;
			}
			else
			{
				double swi1;
				swi1 = A;
				A = B;
				B = swi1;
				
				double swi2;
				swi2 = A;
				A = B;
				B = swi2;
			}
		}
		
		double Aa = (a/A)*100;
		int reAa = (int)Aa;
		double Bb = (b/B)*100;
		int reBb = (int)Bb;		
		
	
		if(reAa < reBb)
		{
			if(reAa>100)
			{
				System.out.println(100+"%");
			}
			else
			{
				System.out.println(reAa+"%");
			}
		}
		else			
		{
			if(reBb>100)
			{
				System.out.println(100+"%");
			}
			else
			{
				System.out.println(reBb+"%");
			}
		}
		
	}
}
